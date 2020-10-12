package com.fc.test.controller.custmanage;

import com.fc.test.common.base.BaseController;
import com.fc.test.common.conf.V2Config;
import com.fc.test.common.domain.AjaxResult;
import com.fc.test.common.enums.ProStatus;
import com.fc.test.constant.ProjectConstant;
import com.fc.test.model.auto.ProPoemset;
import com.fc.test.model.auto.ProPoemsetExample;
import com.fc.test.model.auto.ProPoetry;
import com.fc.test.model.custom.TableSplitResult;
import com.fc.test.model.custom.Tablepar;
import com.fc.test.model.custom.TitleVo;
import com.fc.test.service.ProPoemsetService;
import com.fc.test.service.ProPoetryService;
import com.fc.test.shiro.util.ShiroUtils;
import com.fc.test.util.DateUtils;
import com.fc.test.util.QRCodeUtil;
import com.fc.test.util.SnowflakeIdWorker;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Api(value = "诗歌创作集")
@Controller
@RequestMapping("/ProPoetryManageController")
public class ProPoetryManageController extends BaseController{
	
	private String prefix = "manage/proPoetry";
	@Autowired
	private ProPoetryService proPoetryService;
	@Autowired
	private ProPoemsetService proPoemsetService;
	
	/**
	 * 分页跳转
	 */
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/view")
	@RequiresPermissions("gen:proPoetryManage:view")
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
	@RequiresPermissions("gen:proPoetryManage:list")
	@ResponseBody
	public Object list(Tablepar tablepar,ProPoetry record){
		record.setFinish(ProStatus.apply.getValue());
		PageInfo<ProPoetry> page=proPoetryService.list(tablepar,record) ; 
		TableSplitResult<ProPoetry> result=new TableSplitResult<ProPoetry>(page.getPageNum(), page.getTotal(), page.getList()); 
		return  result;
	}


	/**
	 * 分页跳转
	 */
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/view2")
	@RequiresPermissions("gen:proPoetryManage:view")
	public String view2(ModelMap model)
	{
		String str="诗歌创作集";
		setTitle(model, new TitleVo("列表", str+"管理", true,"欢迎进入"+str+"页面", true, false));
		return prefix + "/list2";
	}

	/**
	 * 分页查询
	 */
	//@Log(title = "诗歌创作集集合查询", action = "111")
	@ApiOperation(value = "分页查询", notes = "分页查询")
	@PostMapping("/list2")
	@RequiresPermissions("gen:proPoetryManage:list2")
	@ResponseBody
	public Object list2(Tablepar tablepar,ProPoetry record){
		PageInfo<ProPoetry> page=proPoetryService.list(tablepar,record) ;
		TableSplitResult<ProPoetry> result=new TableSplitResult<ProPoetry>(page.getPageNum(), page.getTotal(), page.getList());
		return  result;
	}
	/**
	 * 打回
	 * @param ids
	 * @return
	 */
	//@Log(title = "诗歌作品集打回", action = "111")
	@ApiOperation(value = "打回", notes = "打回")
	@PostMapping("/lose")
	@RequiresPermissions("gen:proPoetryManage:lose")
	@ResponseBody
	public AjaxResult lose(String ids){
		ProPoetry data = new ProPoetry();
		data.setUid(ids);
		data.setFinish(ProStatus.edit.getValue());//
		int b = proPoetryService.updateByPrimaryKeySelective(data);
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
	@RequiresPermissions("gen:proPoetryManage:finish")
	@ResponseBody
	public AjaxResult finish(String ids){
		ProPoetry data = new ProPoetry();
		data.setUid(ids);
		data.setFinish(ProStatus.noFinish.getValue());//
		int b = proPoetryService.updateByPrimaryKeySelective(data);
		if(b>0){
			ProPoemset proPoemset = new ProPoemset();
			proPoemset.setFinish(0);
			proPoemset.setPoetryId(ids);
			ProPoemsetExample example = new ProPoemsetExample();
			proPoemsetService.updateByExample(proPoemset,example);
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
	@RequiresPermissions("gen:proPoetryManage:remove")
	@ResponseBody
	public AjaxResult remove(String ids){
		ProPoetry data = new ProPoetry();
		data.setUid(ids);
		data.setIsDel(1);
		int b=proPoetryService.deleteByPrimaryKey(ids);
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
    @RequiresPermissions("gen:proPoetryManage:edit")
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
