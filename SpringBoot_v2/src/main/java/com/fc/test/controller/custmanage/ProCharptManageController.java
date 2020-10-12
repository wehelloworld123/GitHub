package com.fc.test.controller.custmanage;

import com.fc.test.common.base.BaseController;
import com.fc.test.common.domain.AjaxResult;
import com.fc.test.common.enums.ProStatus;
import com.fc.test.model.auto.ProCharpt;
import com.fc.test.model.custom.TableSplitResult;
import com.fc.test.model.custom.Tablepar;
import com.fc.test.model.custom.TitleVo;
import com.fc.test.service.ProCharptService;
import com.fc.test.util.StringUtils;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Api(value = "文学作品章节")
@Controller
@RequestMapping("/ProCharptManageController")
public class ProCharptManageController extends BaseController{
	
	private String prefix = "manage/proCharpt";
	@Autowired
	private ProCharptService proCharptService;
	
	/**
	 * 分页跳转
	 */
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/view")
	@RequiresPermissions("gen:proCharptManage:view")
    public String view(ModelMap model)
    {	
		String str="文学作品章节";
		setTitle(model, new TitleVo("列表", str+"管理", true,"欢迎进入"+str+"页面", true, false));
        return prefix + "/list";
    }
	
	/**
	 * 分页查询
	 */
	//@Log(title = "文学作品章节集合查询", action = "111")
	@ApiOperation(value = "分页查询", notes = "分页查询")
	@PostMapping("/list")
	@RequiresPermissions("gen:proCharptManage:list")
	@ResponseBody
	public Object list(Tablepar tablepar,ProCharpt record){
		PageInfo<ProCharpt> page=proCharptService.list(tablepar,record) ; 
		TableSplitResult<ProCharpt> result=new TableSplitResult<ProCharpt>(page.getPageNum(), page.getTotal(), page.getList()); 
		return  result;
	}


	/**
	 * 分页跳转
	 */
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/view2")
	@RequiresPermissions("gen:proCharptManage:view")
	public String view2(ModelMap model,String uid)
	{
		model.addAttribute("bookId",uid);
		String str="诗歌作品分集";
		setTitle(model, new TitleVo("列表", str+"管理", true,"欢迎进入"+str+"页面", true, false));
		return prefix + "/list2";
	}

	/**
	 * 分页查询
	 */
	//@Log(title = "绘画作品分集集合查询", action = "111")
	@ApiOperation(value = "分页查询", notes = "分页查询")
	@PostMapping("/list2")
	@RequiresPermissions("gen:proCharptManage:list2")
	@ResponseBody
	public Object list2(Tablepar tablepar,ProCharpt record,String bookId){
		System.out.println("--------------------");
		System.out.println(tablepar);
		System.out.println(bookId);
		record.setBookId(bookId);
		PageInfo<ProCharpt> page=proCharptService.list(tablepar,record) ;
		TableSplitResult<ProCharpt> result=new TableSplitResult<ProCharpt>(page.getPageNum(), page.getTotal(), page.getList());
		return  result;
	}


	/**
     * 新增跳转
     */
    @ApiOperation(value = "新增跳转", notes = "新增跳转")
    @GetMapping("/add")
    public String add(ModelMap modelMap,String bookId)
    {
		modelMap.addAttribute("bookId",bookId);
        return prefix + "/add";
    }

	
	/**
	 * 删除
	 * @param ids
	 * @return
	 */
	//@Log(title = "文学作品章节删除", action = "111")
	@ApiOperation(value = "删除", notes = "删除")
	@PostMapping("/remove")
	@RequiresPermissions("gen:proCharptManage:remove")
	@ResponseBody
	public AjaxResult remove(String ids){
		ProCharpt data = new ProCharpt();
		data.setId(new Long(ids));
		data.setIsDel(1);
		int b = proCharptService.updateByPrimaryKeySelective(data);
		if(b>0){
			return success();
		}else{
			return error();
		}
	}

	/**
	 * 打回
	 * @param ids
	 * @return
	 */
	//@Log(title = "文学作品分集打回", action = "111")
	@ApiOperation(value = "打回", notes = "打回")
	@PostMapping("/lose")
	@RequiresPermissions("gen:proCharptManage:lose")
	@ResponseBody
	public AjaxResult lose(String ids){
		ProCharpt data = new ProCharpt();
		data.setId(new Long(ids));
		data.setFinish(ProStatus.edit.getValue());//
		int b = proCharptService.updateByPrimaryKeySelective(data);
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
	//@Log(title = "绘画作品分集完成", action = "111")
	@ApiOperation(value = "完成", notes = "完成")
	@PostMapping("/finish")
	@RequiresPermissions("gen:proCharptManage:finish")
	@ResponseBody
	public AjaxResult finish(Integer ids){
		ProCharpt data = new ProCharpt();
		data.setId(new Long(ids));
		data.setFinish(1);
		int b = proCharptService.updateByPrimaryKeySelective(data);
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
	public int checkNameUnique(ProCharpt proCharpt){
		int b=proCharptService.checkNameUnique(proCharpt);
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
        mmap.put("ProCharpt", proCharptService.selectByPrimaryKey(id));

        return prefix + "/edit";
    }
	
	/**
     * 修改保存
     */
    //@Log(title = "文学作品章节修改", action = "111")
    @ApiOperation(value = "修改保存", notes = "修改保存")
    @RequiresPermissions("gen:proCharptManage:edit")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(ProCharpt record)
    {
        return toAjax(proCharptService.updateByPrimaryKeySelective(record));
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
   	public ProCharpt edit(@PathVariable("id") String id) {
   		return proCharptService.selectByPrimaryKey(id);
   	}
    

	
}
