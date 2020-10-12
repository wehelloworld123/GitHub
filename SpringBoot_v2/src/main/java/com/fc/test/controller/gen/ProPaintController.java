package com.fc.test.controller.gen;

import com.fc.test.common.conf.V2Config;
import com.fc.test.common.enums.ProStatus;
import com.fc.test.common.enums.RecomType;
import com.fc.test.constant.ProjectConstant;
import com.fc.test.model.auto.ProPaintPart;
import com.fc.test.model.auto.ProSale;
import com.fc.test.service.ProPaintPartService;
import com.fc.test.service.ProSaleService;
import com.fc.test.shiro.util.ShiroUtils;
import com.fc.test.util.DateUtils;
import com.fc.test.util.QRCodeUtil;
import com.fc.test.util.SnowflakeIdWorker;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import com.github.pagehelper.PageInfo;
import com.fc.test.common.base.BaseController;
import com.fc.test.common.domain.AjaxResult;
import com.fc.test.model.auto.ProPaint;
import com.fc.test.model.custom.TableSplitResult;
import com.fc.test.model.custom.Tablepar;
import com.fc.test.model.custom.TitleVo;
import com.fc.test.service.ProPaintService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

@Api(value = "绘画创作集")
@Controller
@RequestMapping("/ProPaintController")
public class ProPaintController extends BaseController{
	
	private String prefix = "gen/proPaint";
	@Autowired
	private ProPaintService proPaintService;

	@Autowired
	private ProPaintPartService proPaintPartService;
	@Autowired
	private ProSaleService proSaleService;
	/**
	 * 分页跳转
	 */
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/view")
	@RequiresPermissions("gen:proPaint:view")
    public String view(ModelMap model)
    {
		String str="绘画创作集";
		setTitle(model, new TitleVo("列表", str+"管理", true,"欢迎进入"+str+"页面", true, false));
        return prefix + "/list";
    }

	/**
	 * 完成
	 * @param ids
	 * @return
	 */
	//@Log(title = "绘画作品集完成", action = "111")
	@ApiOperation(value = "完成", notes = "完成")
	@PostMapping("/finish")
	@RequiresPermissions("gen:proPaint:finish")
	@ResponseBody
	public AjaxResult finish(String ids){
		ProPaint data = new ProPaint();
		data.setUid(ids);

		Map<String,Object> map = proPaintService.selectFinPartCount(data);
		if(map!=null&&map.get("count")==map.get("section")) {
			data.setFinish(ProStatus.finish.getValue());
			int b = proPaintService.updateByPrimaryKeySelective(data);
			if (b > 0) {
				ProPaint proPaint = proPaintService.selectByPrimaryKey(ids);
				ProSale proSale = new ProSale();
				proSale.setProNo(proPaint.getUid());
				proSale.setCreateTyp(proPaint.getKind());
				proSale.setTyp(RecomType.PAINTING.getValue());
				proSale.setTitle(proPaint.getName());
				proSale.setSeter(proPaint.getSeter());
				proSale.setCover(proPaint.getCover());
				proSale.setLabel(proPaint.getPurpose());
				proSale.setDescription(proPaint.getDescription());
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
	//@Log(title = "绘画作品集上线", action = "111")
	@ApiOperation(value = "上线", notes = "上线")
	@PostMapping("/apply")
	@RequiresPermissions("gen:proPaint:apply")
	@ResponseBody
	public AjaxResult apply(String ids){
		ProPaint data = new ProPaint();
		data.setUid(ids);
		data.setFinish(ProStatus.apply.getValue());//
		int b = proPaintService.updateByPrimaryKeySelective(data);
		if(b>0){
			return success();
		}else{
			return error();
		}
	}


	/**
	 * 分页查询
	 */
	//@Log(title = "绘画创作集集合查询", action = "111")
	@ApiOperation(value = "分页查询", notes = "分页查询")
	@PostMapping("/list")
	@RequiresPermissions("gen:proPaint:list")
	@ResponseBody
	public Object list(Tablepar tablepar,ProPaint record){
		record.setCreateBy(ShiroUtils.getUserId());
		PageInfo<ProPaint> page=proPaintService.list(tablepar,record) ; 
		TableSplitResult<ProPaint> result=new TableSplitResult<ProPaint>(page.getPageNum(), page.getTotal(), page.getList()); 
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
	//@Log(title = "绘画创作集新增", action = "111")
   	@ApiOperation(value = "新增", notes = "新增")
	@PostMapping("/add")
	@RequiresPermissions("gen:proPaint:add")
	@ResponseBody
	public AjaxResult add(ProPaint proPaint) throws Exception {
		//添加雪花主键id
		String uid = SnowflakeIdWorker.getUUID();

		Date now = DateUtils.getNowDate();//当前时间

		proPaint.setUid(ProjectConstant.PAINTINGPREFIX+ uid);

		String url ="?id="+uid+"&type=0";//生成二维码内容
		String qrFileName = "P"+DateUtils.dateTimeNow()+"code.jpg";//生成二维码文件名

		QRCodeUtil.encode(url, null, V2Config.getDefaultBaseDir()+qrFileName,false);


		String fileUrl = V2Config.getDefaultBaseDir()+qrFileName;//二维码请求路径

		proPaint.setQrCode(fileUrl);
		proPaint.setCreateBy(ShiroUtils.getUserId());
		proPaint.setCreateDat(now);
		proPaint.setlUpdateDat(now);
		proPaint.setIsDel(0);
		int b=proPaintService.insertSelective(proPaint);

		List<ProPaintPart> list = new ArrayList<>();

		for(int i = 0;i<proPaint.getParts();i++){
			ProPaintPart data = new ProPaintPart();
			data.setPartType(proPaint.getKind());
			data.setPaintId(ProjectConstant.PAINTINGPREFIX+ uid);
			data.setRoot(1);//根目录
			data.setRootOrd(i+1);
			data.setFinish(-1);//未编辑
			data.setCreateBy(ShiroUtils.getUserId());
			data.setIsDel(0);
			data.setCreateDat(now);
			data.setlUpdateDat(now);
			list.add(data);
		}
		proPaintPartService.insertSelective(list);

		if(b>0){
			return success();
		}else{
			return error();
		}
	}
	/**
	 * 文件上传
	 * @param file
	 * @return
	 * @author fuce
	 * @Date 2019年11月20日 下午10:18:49
	 */
	//@Log(title = "文件上传", action = "1")
	/*@ApiOperation(value = "文件上传", notes = "文件上传")
	@PostMapping("/upload")
	@ResponseBody
	public AjaxResult updateAvatar(HttpServletRequest request, HttpServletResponse response)
	{

		try
		{
			request.setCharacterEncoding("UTF-8");

			Map<String, Object> json = new HashMap<String, Object>();
			MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;

			*//** 页面控件的文件流* *//*
			MultipartFile file = null;
			Map map =multipartRequest.getFileMap();
			for (Iterator i = map.keySet().iterator(); i.hasNext();) {
				Object obj = i.next();
				file=(MultipartFile) map.get(obj);
				if (!file.isEmpty())
				{
					//保存文件
					String fileUrl=sysDatasService.saveImage(file);
					if(fileUrl!=null){
						return AjaxResult.successData(200, fileUrl);
					}
				}else {
					return error();
				}
			}
			return error();
		}
		catch (Exception e)
		{
			return error(e.getMessage());
		}
	}*/
	/**
	 * 删除
	 * @param ids
	 * @return
	 */
	//@Log(title = "绘画创作集删除", action = "111")
	@ApiOperation(value = "删除", notes = "删除")
	@PostMapping("/remove")
	@RequiresPermissions("gen:proPaint:remove")
	@ResponseBody
	public AjaxResult remove(String ids){
		int b=proPaintService.deleteBatchByPrimaryKey(ids);
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
	public int checkNameUnique(ProPaint proPaint){
		int b=proPaintService.checkNameUnique(proPaint);
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
        mmap.put("ProPaint", proPaintService.selectByPrimaryKey(id));

        return prefix + "/edit";
    }
	
	/**
     * 修改保存
     */
    //@Log(title = "绘画创作集修改", action = "111")
    @ApiOperation(value = "修改保存", notes = "修改保存")
    @RequiresPermissions("gen:proPaint:edit")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(ProPaint record)
    {
        return toAjax(proPaintService.updateByPrimaryKeySelective(record));
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
   	public ProPaint edit(@PathVariable("id") String id) {
   		return proPaintService.selectByPrimaryKey(id);
   	}
    

	
}
