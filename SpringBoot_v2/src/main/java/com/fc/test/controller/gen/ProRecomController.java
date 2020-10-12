package com.fc.test.controller.gen;

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
import com.fc.test.model.auto.ProRecom;
import com.fc.test.model.custom.TableSplitResult;
import com.fc.test.model.custom.Tablepar;
import com.fc.test.model.custom.TitleVo;
import com.fc.test.service.ProRecomService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Api(value = "创作推荐表")
@Controller
@RequestMapping("/ProRecomController")
public class ProRecomController extends BaseController{
	
	private String prefix = "gen/proRecom";
	@Autowired
	private ProRecomService proRecomService;
	
	/**
	 * 分页跳转
	 */
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/view")
	@RequiresPermissions("gen:proRecom:view")
    public String view(ModelMap model)
    {	
		String str="创作推荐表";
		setTitle(model, new TitleVo("列表", str+"管理", true,"欢迎进入"+str+"页面", true, false));
        return prefix + "/list";
    }

	/**
	 * 完成
	 * @param ids
	 * @return
	 */
	//@Log(title = "创作作品推荐", action = "111")
	@ApiOperation(value = "查询", notes = "查询")
	@GetMapping("/queryRecom")
    @RequiresPermissions("gen:proRecom:list")
	@ResponseBody
	public AjaxResult queryRecom(int startIndex,int pageSize,String no){
		List<ProRecom> list = new ArrayList<>();
		if(startIndex<100) {
			list = proRecomService.queryRecomList(no, startIndex, pageSize);
		}
		return AjaxResult.successData(200,list);
	}
	
	/**
	 * 分页查询
	 */
	//@Log(title = "创作推荐表集合查询", action = "111")
	@ApiOperation(value = "分页查询", notes = "分页查询")
	@PostMapping("/list")
	@RequiresPermissions("gen:proRecom:list")
	@ResponseBody
	public Object list(Tablepar tablepar,ProRecom record){
		PageInfo<ProRecom> page=proRecomService.list(tablepar,record) ; 
		TableSplitResult<ProRecom> result=new TableSplitResult<ProRecom>(page.getPageNum(), page.getTotal(), page.getList()); 
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
	//@Log(title = "创作推荐表新增", action = "111")
   	@ApiOperation(value = "新增", notes = "新增")
	@PostMapping("/add")
	@RequiresPermissions("gen:proRecom:add")
	@ResponseBody
	public AjaxResult add(ProRecom proRecom){
		int b=proRecomService.insertSelective(proRecom);
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
	//@Log(title = "创作推荐表删除", action = "111")
	@ApiOperation(value = "删除", notes = "删除")
	@PostMapping("/remove")
	@RequiresPermissions("gen:proRecom:remove")
	@ResponseBody
	public AjaxResult remove(String ids){
		int b=proRecomService.deleteBatchByPrimaryKey(ids);
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
	public int checkNameUnique(ProRecom proRecom){
		int b=proRecomService.checkNameUnique(proRecom);
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
        mmap.put("ProRecom", proRecomService.selectByPrimaryKey(id));

        return prefix + "/edit";
    }
	
	/**
     * 修改保存
     */
    //@Log(title = "创作推荐表修改", action = "111")
    @ApiOperation(value = "修改保存", notes = "修改保存")
    @RequiresPermissions("gen:proRecom:edit")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(ProRecom record)
    {
        return toAjax(proRecomService.updateByPrimaryKeySelective(record));
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
   	public ProRecom edit(@PathVariable("id") String id) {
   		return proRecomService.selectByPrimaryKey(id);
   	}
    

	
}
