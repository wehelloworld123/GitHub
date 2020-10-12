package com.fc.test.controller.custmanage;

import com.fc.test.common.base.BaseController;
import com.fc.test.common.domain.AjaxResult;
import com.fc.test.model.auto.ProPoetryContent;
import com.fc.test.model.custom.TableSplitResult;
import com.fc.test.model.custom.Tablepar;
import com.fc.test.model.custom.TitleVo;
import com.fc.test.service.ProPoetryContentService;
import com.fc.test.util.DateUtils;
import com.fc.test.util.StringUtils;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Api(value = "诗歌创作内容")
@Controller
@RequestMapping("/ProPoetryContentManageController")
public class ProPoetryContentManageController extends BaseController{
	
	private String prefix = "manage/proPoetryContent";
	@Autowired
	private ProPoetryContentService proPoetryContentService;
	
	/**
	 * 分页跳转
	 */
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/view")
	@RequiresPermissions("gen:proPoetryContentManage:view")
    public String view(ModelMap model)
    {	
		String str="诗歌创作内容";
		setTitle(model, new TitleVo("列表", str+"管理", true,"欢迎进入"+str+"页面", true, false));
        return prefix + "/list";
    }
	
	/**
	 * 分页查询
	 */
	//@Log(title = "诗歌创作内容集合查询", action = "111")
	@ApiOperation(value = "分页查询", notes = "分页查询")
	@PostMapping("/list")
	@RequiresPermissions("gen:proPoetryContentManage:list")
	@ResponseBody
	public Object list(Tablepar tablepar,ProPoetryContent record){
		PageInfo<ProPoetryContent> page=proPoetryContentService.list(tablepar,record) ; 
		TableSplitResult<ProPoetryContent> result=new TableSplitResult<ProPoetryContent>(page.getPageNum(), page.getTotal(), page.getList()); 
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
	//@Log(title = "诗歌创作内容新增", action = "111")
   	@ApiOperation(value = "新增", notes = "新增")
	@PostMapping("/add")
	@RequiresPermissions("gen:proPoetryContentManage:add")
	@ResponseBody
	public AjaxResult add(ProPoetryContent proPoetryContent){
		int b=proPoetryContentService.insertSelective(proPoetryContent);
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
	//@Log(title = "诗歌创作内容删除", action = "111")
	@ApiOperation(value = "删除", notes = "删除")
	@PostMapping("/remove")
	@RequiresPermissions("gen:proPoetryContentManage:remove")
	@ResponseBody
	public AjaxResult remove(String ids){
		ProPoetryContent data = new ProPoetryContent();
		data.setNo(ids);
		data.setIsDel(1);
		int b=proPoetryContentService.updateByPrimaryKeySelective(data);
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
	public int checkNameUnique(ProPoetryContent proPoetryContent){
		int b=proPoetryContentService.checkNameUnique(proPoetryContent);
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
        mmap.put("ProPoetryContent", proPoetryContentService.selectByPrimaryKey(id));

        return prefix + "/edit";
    }
	
	/**
     * 修改保存
     */
    //@Log(title = "诗歌创作内容修改", action = "111")
    @ApiOperation(value = "修改保存", notes = "修改保存")
    @RequiresPermissions("gen:proPoetryContentManage:edit")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(ProPoetryContent record)
    {
        return toAjax(proPoetryContentService.updateByPrimaryKeySelective(record));
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
   	public ProPoetryContent edit(@PathVariable("id") String id) {
   		return proPoetryContentService.selectByPrimaryKey(id);
   	}
    

	
}
