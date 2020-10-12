package com.fc.test.controller.custmanage;

import com.fc.test.common.base.BaseController;
import com.fc.test.common.conf.V2Config;
import com.fc.test.common.domain.AjaxResult;
import com.fc.test.common.enums.ProStatus;
import com.fc.test.common.enums.RecomType;
import com.fc.test.constant.ProjectConstant;
import com.fc.test.model.auto.ProCharpt;
import com.fc.test.model.auto.ProCharptExample;
import com.fc.test.model.auto.ProLiter;
import com.fc.test.model.custom.TableSplitResult;
import com.fc.test.model.custom.Tablepar;
import com.fc.test.model.custom.TitleVo;
import com.fc.test.service.ProCharptService;
import com.fc.test.service.ProLiterService;
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

@Api(value = "文学创作信息表")
@Controller
@RequestMapping("/ProLiterManageController")
public class ProLiterManageController extends BaseController{
	
	private String prefix = "manage/proLiter";
	@Autowired
	private ProLiterService proLiterService;
	@Autowired
	private ProCharptService proCharptService;
	/**
	 * 分页跳转
	 */
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/view")
	@RequiresPermissions("gen:proLiterManage:view")
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
	@RequiresPermissions("gen:proLiterManage:list")
	@ResponseBody
	public Object list(Tablepar tablepar,ProLiter record){
		record.setFinish(ProStatus.apply.getValue());
		PageInfo<ProLiter> page=proLiterService.list(tablepar,record) ; 
		TableSplitResult<ProLiter> result=new TableSplitResult<ProLiter>(page.getPageNum(), page.getTotal(), page.getList()); 
		return  result;
	}


	/**
	 * 分页跳转
	 */
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/view2")
	@RequiresPermissions("gen:proLiterManage:view")
	public String view2(ModelMap model)
	{
		String str="绘画创作集";
		setTitle(model, new TitleVo("列表", str+"管理", true,"欢迎进入"+str+"页面", true, false));
		return prefix + "/list2";
	}
	/**
	 * 分页查询
	 */
	//@Log(title = "文学创作集集合查询", action = "111")
	@ApiOperation(value = "分页查询", notes = "分页查询")
	@PostMapping("/list2")
	@RequiresPermissions("gen:proLiterManage:list2")
	@ResponseBody
	public Object list2(Tablepar tablepar,ProLiter record){
		record.setFinish(ProStatus.apply.getValue());
		record.setIsDel(0);
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
	 * 完成
	 * @param ids
	 * @return
	 */
	//@Log(title = "文学作品集完成", action = "111")
	@ApiOperation(value = "完成", notes = "完成")
	@PostMapping("/finish")
	@RequiresPermissions("gen:proLiterManage:finish")
	@ResponseBody
	public AjaxResult finish(String ids){
		ProLiter data = new ProLiter();
		data.setUid(ids);
		data.setFinish(ProStatus.noFinish.getValue());//
		int b = proLiterService.updateByPrimaryKeySelective(data);
		if(b>0){
			ProCharpt proPaintPart = new ProCharpt();
			proPaintPart.setFinish(0);
			proPaintPart.setBookId(ids);
			ProCharptExample example = new ProCharptExample();
			proCharptService.updateByExample(proPaintPart,example);
			return success();
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
	@ApiOperation(value = "打回", notes = "打回")
	@PostMapping("/lose")
	@RequiresPermissions("gen:proPaintManage:lose")
	@ResponseBody
	public AjaxResult lose(String ids){
		ProLiter data = new ProLiter();
		data.setUid(ids);
		data.setFinish(ProStatus.edit.getValue());//
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
	@RequiresPermissions("gen:proLiterManage:remove")
	@ResponseBody
	public AjaxResult remove(String ids){
		ProLiter data = new ProLiter();
		data.setUid(ids);
		data.setIsDel(1);
		int b=proLiterService.updateByPrimaryKeySelective(data);
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
    @RequiresPermissions("gen:proLiterManage:edit")
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
