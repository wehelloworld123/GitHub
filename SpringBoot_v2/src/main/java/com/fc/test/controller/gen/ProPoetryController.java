package com.fc.test.controller.gen;

import com.fc.test.common.conf.V2Config;
import com.fc.test.common.enums.ProStatus;
import com.fc.test.common.enums.RecomType;
import com.fc.test.constant.ProjectConstant;
import com.fc.test.model.auto.ProPaint;
import com.fc.test.model.auto.ProPoemset;
import com.fc.test.model.auto.ProSale;
import com.fc.test.service.ProPoemsetService;
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
import com.fc.test.model.auto.ProPoetry;
import com.fc.test.model.custom.TableSplitResult;
import com.fc.test.model.custom.Tablepar;
import com.fc.test.model.custom.TitleVo;
import com.fc.test.service.ProPoetryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

@Api(value = "诗歌创作集")
@Controller
@RequestMapping("/ProPoetryController")
public class ProPoetryController extends BaseController{
	
	private String prefix = "gen/proPoetry";
	@Autowired
	private ProPoetryService proPoetryService;
	@Autowired
	private ProPoemsetService proPoemsetService;
	@Autowired
	private ProSaleService proSaleService;
	
	/**
	 * 分页跳转
	 */
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/view")
	@RequiresPermissions("gen:proPoetry:view")
    public String view(ModelMap model)
    {	
		String str="诗歌创作集";
		setTitle(model, new TitleVo("列表", str+"管理", true,"欢迎进入"+str+"页面", true, false));
        return prefix + "/list";
    }
	
	/**
	 * 分页查询
	 */
	//@Log(title = "诗歌创作集集合查询", action = "111")
	@ApiOperation(value = "分页查询", notes = "分页查询")
	@PostMapping("/list")
	@RequiresPermissions("gen:proPoetry:list")
	@ResponseBody
	public Object list(Tablepar tablepar,ProPoetry record){
		record.setCreateBy(ShiroUtils.getUserId());
		PageInfo<ProPoetry> page=proPoetryService.list(tablepar,record) ; 
		TableSplitResult<ProPoetry> result=new TableSplitResult<ProPoetry>(page.getPageNum(), page.getTotal(), page.getList()); 
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
	//@Log(title = "诗歌创作集新增", action = "111")
   	@ApiOperation(value = "新增", notes = "新增")
	@PostMapping("/add")
	@RequiresPermissions("gen:proPoetry:add")
	@ResponseBody
	public AjaxResult add(ProPoetry proPoetry) throws Exception {


		//添加雪花主键id
		String uid = SnowflakeIdWorker.getUUID();

		Date now = DateUtils.getNowDate();//当前时间

		proPoetry.setUid(ProjectConstant.POETRYPREFIX+ uid);

		String url ="?id="+uid+"&type=0";//生成二维码内容
		String qrFileName = "E"+DateUtils.dateTimeNow()+"code.jpg";//生成二维码文件名

		QRCodeUtil.encode(url, null, V2Config.getDefaultBaseDir()+qrFileName,false);


		String fileUrl = V2Config.getDefaultBaseDir()+qrFileName;//二维码请求路径

		proPoetry.setQrCode(fileUrl);
		proPoetry.setCreateBy(ShiroUtils.getUserId());
		proPoetry.setCreateDat(now);
		proPoetry.setlUpdateDat(now);
		proPoetry.setIsDel(0);
		proPoetry.setFinish(ProStatus.edit.getValue());
		int b=proPoetryService.insertSelective(proPoetry);

		List<ProPoemset> list = new ArrayList<>();

		for(int i = 0;i<proPoetry.getSection();i++){
			ProPoemset data = new ProPoemset();
		//	data.setPartType(proPaint.getKind());
			data.setPoetryId(ProjectConstant.POETRYPREFIX+ uid);
			data.setRoot(1);//根目录
			data.setRootOrd(i+1);
			data.setIsLock(0);
			data.setFinish(ProStatus.edit.getValue());//未编辑
			data.setCreateBy(ShiroUtils.getUserId());
			data.setIsDel(0);
			data.setCreateDat(now);
			data.setlUpdateDat(now);
			list.add(data);
		}
		proPoemsetService.insertSelective(list);

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
	@RequiresPermissions("gen:proPaint:finish")
	@ResponseBody
	public AjaxResult finish(String ids){
		ProPoetry data = new ProPoetry();
		data.setUid(ids);

		Map<String,Object> map = proPoetryService.selectFinChaptCount(data);
		if(map!=null&&map.get("count")==map.get("section")) {
			data.setFinish(ProStatus.finish.getValue());
			int b = proPoetryService.updateByPrimaryKeySelective(data);
			if (b > 0) {
				ProPoetry proPoetry = proPoetryService.selectByPrimaryKey(ids);
				ProSale proSale = new ProSale();
				proSale.setProNo(proPoetry.getUid());
				proSale.setCreateTyp(proPoetry.getKind());
				proSale.setTyp(RecomType.POEMTY.getValue());
				proSale.setTitle(proPoetry.getName());
				proSale.setSeter(proPoetry.getSeter());
				proSale.setCover(proPoetry.getCover());
				proSale.setLabel(proPoetry.getPurpose());
				proSale.setDescription(proPoetry.getDescription());
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
	@RequiresPermissions("gen:proPoetry:apply")
	@ResponseBody
	public AjaxResult apply(String ids){
		ProPoetry data = new ProPoetry();
		data.setUid(ids);
		data.setFinish(ProStatus.apply.getValue());//
		int b = proPoetryService.updateByPrimaryKeySelective(data);
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
	//@Log(title = "诗歌创作集删除", action = "111")
	@ApiOperation(value = "删除", notes = "删除")
	@PostMapping("/remove")
	@RequiresPermissions("gen:proPoetry:remove")
	@ResponseBody
	public AjaxResult remove(String ids){
		int b=proPoetryService.deleteBatchByPrimaryKey(ids);
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
	public int checkNameUnique(ProPoetry proPoetry){
		int b=proPoetryService.checkNameUnique(proPoetry);
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
        mmap.put("ProPoetry", proPoetryService.selectByPrimaryKey(id));

        return prefix + "/edit";
    }
	
	/**
     * 修改保存
     */
    //@Log(title = "诗歌创作集修改", action = "111")
    @ApiOperation(value = "修改保存", notes = "修改保存")
    @RequiresPermissions("gen:proPoetry:edit")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(ProPoetry record)
    {
        return toAjax(proPoetryService.updateByPrimaryKeySelective(record));
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
   	public ProPoetry edit(@PathVariable("id") String id) {
   		return proPoetryService.selectByPrimaryKey(id);
   	}
    

	
}
