package com.fc.test.controller.gen;

import com.fc.test.common.conf.V2Config;
import com.fc.test.common.enums.ProStatus;
import com.fc.test.common.enums.RecomType;
import com.fc.test.constant.ProjectConstant;
import com.fc.test.model.auto.ProCharpt;
import com.fc.test.model.auto.ProSale;
import com.fc.test.service.ProCharptService;
import com.fc.test.service.ProSaleService;
import com.fc.test.shiro.util.ShiroUtils;
import com.fc.test.util.DateUtils;
import com.fc.test.util.QRCodeUtil;
import com.fc.test.util.SnowflakeIdWorker;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.github.pagehelper.PageInfo;
import com.fc.test.common.base.BaseController;
import com.fc.test.common.domain.AjaxResult;
import com.fc.test.model.auto.ProLiter;
import com.fc.test.model.custom.TableSplitResult;
import com.fc.test.model.custom.Tablepar;
import com.fc.test.model.custom.TitleVo;
import com.fc.test.service.ProLiterService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Api(value = "文学创作信息表")
@Controller
@RequestMapping("/ProLiterController")
public class ProLiterController extends BaseController{
	
	private String prefix = "gen/proLiter";
	@Autowired
	private ProLiterService proLiterService;
	@Autowired
	private ProCharptService proCharptService;
	@Autowired
	private ProSaleService proSaleService;
	/**
	 * 分页跳转
	 */
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/view")
	@RequiresPermissions("gen:proLiter:view")
    public String view(ModelMap model)
    {	
		String str="文学创作信息表";
		setTitle(model, new TitleVo("列表", str+"管理", true,"欢迎进入"+str+"页面", true, false));
        return prefix + "/list";
    }
	
	/**
	 * 分页查询
	 */
	//@Log(title = "文学创作信息表集合查询", action = "111")
	@ApiOperation(value = "分页查询", notes = "分页查询")
	@PostMapping("/list")
	@RequiresPermissions("gen:proLiter:list")
	@ResponseBody
	public Object list(Tablepar tablepar,ProLiter record){
		PageInfo<ProLiter> page=proLiterService.list(tablepar,record) ; 
		TableSplitResult<ProLiter> result=new TableSplitResult<ProLiter>(page.getPageNum(), page.getTotal(), page.getList()); 
		return  result;
	}
	
	/**
     * 新增跳转
     */
    @ApiOperation(value = "新增跳转", notes = "新增跳转")
    @GetMapping("/add")
    public String add(ModelMap modelMap)
    {
        return prefix + "/add";
    }
	
	/**
     * 新增
     */
	//@Log(title = "文学创作信息表新增", action = "111")
   	@ApiOperation(value = "新增", notes = "新增")
	@PostMapping("/add")
	@RequiresPermissions("gen:proLiter:add")
	@ResponseBody
	public AjaxResult add(ProLiter proLiter) throws Exception {
		//添加雪花主键id
		String uid = SnowflakeIdWorker.getUUID();

		Date now = DateUtils.getNowDate();//当前时间

		proLiter.setUid(ProjectConstant.LITERPREFIX+ uid);

		String url ="?id="+uid+"&type="+ RecomType.LITERATURE.getValue();//生成二维码内容
		String qrFileName = "L"+DateUtils.dateTimeNow()+"code.jpg";//生成二维码文件名

		QRCodeUtil.encode(url, null, V2Config.getDefaultBaseDir()+qrFileName,false);


		String fileUrl = V2Config.getDefaultBaseDir()+qrFileName;//二维码请求路径

		proLiter.setQrCode(fileUrl);
		proLiter.setCreateBy(ShiroUtils.getUserId());
		proLiter.setCreateDat(now);
		proLiter.setlUpdateDat(now);
		proLiter.setIsDel(0);
		int b=proLiterService.insertSelective(proLiter);

		List<ProCharpt> list = new ArrayList<>();

		for(int i = 0;i<proLiter.getCharpter();i++){
			ProCharpt data = new ProCharpt();
			//data.setPartType(proPaint.getKind());
			data.setBookId(ProjectConstant.PAINTINGPREFIX+ uid);
			data.setRoot(1);//根目录
			data.setRootOrd(i+1);
			data.setFinish(ProStatus.edit.getValue());//未编辑
			data.setCreateBy(ShiroUtils.getUserId());
			data.setIsDel(0);
			data.setCreateDat(now);
			data.setlUpdateDat(now);
			list.add(data);
		}
		proCharptService.insertSelective(list);

		if(b>0){
			return success();
		}else{
			return error();
		}
	}

	/**
	 * 完成
	 * @param ids
	 * @return
	 */
	//@Log(title = "诗歌作品集完成", action = "111")
	@ApiOperation(value = "完成", notes = "完成")
	@PostMapping("/finish")
	@RequiresPermissions("gen:proLiter:finish")
	@ResponseBody
	public AjaxResult finish(String ids){
		ProLiter data = new ProLiter();
		data.setUid(ids);

		Map<String,Object> map = proLiterService.selectFinChapterCount(data);
		if(map!=null&&map.get("count")==map.get("charpter")) {
			data.setFinish(ProStatus.finish.getValue());
			int b = proLiterService.updateByPrimaryKeySelective(data);
			if (b > 0) {
				ProLiter proLiter = proLiterService.selectByPrimaryKey(ids);
				ProSale proSale = new ProSale();
				proSale.setProNo(proLiter.getUid());
				proSale.setTyp(RecomType.LITERATURE.getValue());
				proSale.setCreateTyp(proLiter.getKind()+"");
				proSale.setTitle(proLiter.getName());
				proSale.setCover(proLiter.getCover());
				proSale.setLabel(proLiter.getLabel());
				proSale.setDescription(proLiter.getDescribe());
				proSale.setSaleStatus("0");
				proSaleService.insertSelective(proSale);
				return success();
			} else {
				return error();
			}
		}else{
			return error();
		}
	}

	/**
	 * 上线
	 * @param ids
	 * @return
	 */
	//@Log(title = "诗歌作品集上线", action = "111")
	@ApiOperation(value = "上线", notes = "上线")
	@PostMapping("/apply")
	@RequiresPermissions("gen:proLiter:apply")
	@ResponseBody
	public AjaxResult apply(String ids){
		ProLiter data = new ProLiter();
		data.setUid(ids);
		data.setFinish(ProStatus.apply.getValue());//
		int b = proLiterService.updateByPrimaryKeySelective(data);
		if(b>0){
			return success();
		}else{
			return error();
		}
	}

	/**
	 * 删除
	 * @param ids
	 * @return
	 */
	//@Log(title = "文学创作信息表删除", action = "111")
	@ApiOperation(value = "删除", notes = "删除")
	@PostMapping("/remove")
	@RequiresPermissions("gen:proLiter:remove")
	@ResponseBody
	public AjaxResult remove(String ids){
		int b=proLiterService.deleteBatchByPrimaryKey(ids);
		if(b>0){
			return success();
		}else{
			return error();
		}
	}
	
	/**
	 * 检查Name
	 * @param tsysUser
	 * @return
	 */
	@ApiOperation(value = "检查Name唯一", notes = "检查Name唯一")
	@PostMapping("/checkNameUnique")
	@ResponseBody
	public int checkNameUnique(ProLiter proLiter){
		int b=proLiterService.checkNameUnique(proLiter);
		if(b>0){
			return 1;
		}else{
			return 0;
		}
	}
	
	
	/**
	 * 修改跳转
	 * @param id
	 * @param mmap
	 * @return
	 */
	@ApiOperation(value = "修改跳转", notes = "修改跳转")
	@GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") String id, ModelMap mmap)
    {
        mmap.put("ProLiter", proLiterService.selectByPrimaryKey(id));

        return prefix + "/edit";
    }
	
	/**
     * 修改保存
     */
    //@Log(title = "文学创作信息表修改", action = "111")
    @ApiOperation(value = "修改保存", notes = "修改保存")
    @RequiresPermissions("gen:proLiter:edit")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(ProLiter record)
    {
        return toAjax(proLiterService.updateByPrimaryKeySelective(record));
    }

    
    /**
   	 * 根据主键查询
   	 * 
   	 * @param id
   	 * @param mmap
   	 * @return
   	 */
   	@ApiOperation(value = "根据id查询唯一", notes = "根据id查询唯一")
   	@PostMapping("/get/{id}")
   	public ProLiter edit(@PathVariable("id") String id) {
   		return proLiterService.selectByPrimaryKey(id);
   	}
    

	
}
