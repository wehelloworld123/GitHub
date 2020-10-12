package com.fc.test.controller.gen;

import com.fc.test.shiro.util.ShiroUtils;
import com.fc.test.util.StringUtils;
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
import com.fc.test.model.auto.ProPaintPart;
import com.fc.test.model.custom.TableSplitResult;
import com.fc.test.model.custom.Tablepar;
import com.fc.test.model.custom.TitleVo;
import com.fc.test.service.ProPaintPartService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Api(value = "绘画作品分集")
@Controller
@RequestMapping("/ProPaintPartController")
public class ProPaintPartController extends BaseController{
	
	private String prefix = "gen/proPaintPart";
	@Autowired
	private ProPaintPartService proPaintPartService;
	
	/**
	 * 分页跳转
	 */
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/view2")
	@RequiresPermissions("gen:proPaint:view")
    public String view2(ModelMap model,String uid)
    {
		model.addAttribute("paintId",uid);
		String str="绘画作品分集";
		setTitle(model, new TitleVo("列表", str+"管理", true,"欢迎进入"+str+"页面", true, false));
        return prefix + "/list2";
    }
	/**
	 * 字典数据表集合查询
	 * @param tablepar
	 * @param searchText
	 * @param dictId
	 * @return
	 */
	//@Log(title = "字典数据表集合查询", action = "1")
/*	@ApiOperation(value = "分页查询", notes = "分页查询")
	@PostMapping("/list")
	@RequiresPermissions("system:dictData:list")
	@ResponseBody
	public Object list(Tablepar tablepar,String searchText,String dictId){
		PageInfo<ProPaintPart> page=proPaintPartService.list(tablepar,searchText,dictId) ;
		TableSplitResult<ProPaintPart> result=new TableSplitResult<ProPaintPart>(page.getPageNum(), page.getTotal(), page.getList());
		return  result;
	}*/
	/**
	 * 分页查询
	 */
	//@Log(title = "绘画作品分集集合查询", action = "111")
	@ApiOperation(value = "分页查询", notes = "分页查询")
	@PostMapping("/list2")
	@RequiresPermissions("gen:proPaintPart:list2")
	@ResponseBody
	public Object list2(Tablepar tablepar,ProPaintPart record,String paintId){
		System.out.println("--------------------");
		System.out.println(tablepar);
		System.out.println(paintId);
		record.setPaintId(paintId);
		PageInfo<ProPaintPart> page=proPaintPartService.list(tablepar,record) ; 
		TableSplitResult<ProPaintPart> result=new TableSplitResult<ProPaintPart>(page.getPageNum(), page.getTotal(), page.getList()); 
		return  result;
	}

	/**
	 * 分页跳转
	 */
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/view")
	@RequiresPermissions("gen:proPaintPart:view")
	public String view(ModelMap model)
	{
		String str="绘画作品未完成分集";
		setTitle(model, new TitleVo("列表", str+"管理", true,"欢迎进入"+str+"页面", true, false));
		return prefix + "/list";
	}
	/**
	 * 字典数据表集合查询
	 * @param tablepar
	 * @param searchText
	 * @param dictId
	 * @return
	 */
	//@Log(title = "字典数据表集合查询", action = "1")
/*	@ApiOperation(value = "分页查询", notes = "分页查询")
	@PostMapping("/list")
	@RequiresPermissions("system:dictData:list")
	@ResponseBody
	public Object list(Tablepar tablepar,String searchText,String dictId){
		PageInfo<ProPaintPart> page=proPaintPartService.list(tablepar,searchText,dictId) ;
		TableSplitResult<ProPaintPart> result=new TableSplitResult<ProPaintPart>(page.getPageNum(), page.getTotal(), page.getList());
		return  result;
	}*/
	/**
	 * 分页查询
	 */
	//@Log(title = "绘画作品分集集合查询", action = "111")
	@ApiOperation(value = "分页查询", notes = "分页查询")
	@PostMapping("/list")
	@RequiresPermissions("gen:proPaintPart:list")
	@ResponseBody
	public Object list(Tablepar tablepar,ProPaintPart record){
		record.setCreateBy(ShiroUtils.getUserId());
		record.setIsDel(0);
		record.setRoot(0);
		record.setFinish(0);
		record.setLock(0);
		PageInfo<ProPaintPart> page=proPaintPartService.listByCreateBy(tablepar,record) ;
		TableSplitResult<ProPaintPart> result=new TableSplitResult<ProPaintPart>(page.getPageNum(), page.getTotal(), page.getList());
		return  result;
	}


	/**
     * 新增跳转
     */
    @ApiOperation(value = "新增跳转", notes = "新增跳转")
    @GetMapping("/add")
    public String add(ModelMap modelMap,String paintId)
    {
    	modelMap.addAttribute("paintId",paintId);
        return prefix + "/add";
    }
	
	/**
     * 新增
     */
	//@Log(title = "绘画作品分集新增", action = "111")
   	@ApiOperation(value = "新增", notes = "新增")
	@PostMapping("/add")
	@RequiresPermissions("gen:proPaintPart:add")
	@ResponseBody
	public AjaxResult add(ProPaintPart proPaintPart){
		proPaintPart.setCreateBy(ShiroUtils.getUserId());
		Map<String,Object> map = proPaintPartService.selectPartCountByPaintId(proPaintPart);
		if(map!=null) {
			if (proPaintPart.getRoot() == 1) {
				if (map.get("parts") == map.get("count")) {
					return AjaxResult.error("分篇已满");
				} else {
					int b = proPaintPartService.insertSelective(proPaintPart);
					if (b > 0) {
						return success();
					} else {
						return error("保存失败");
					}
				}
			} else {
				if (map.get("section") == map.get("count")) {
					return AjaxResult.error("章节已满");
				} else {
					int b = proPaintPartService.insertSelective(proPaintPart);
					if (b > 0) {
						return success();
					} else {
						return error("保存失败");
					}
				}
			}
		}else{
			return error("保存失败");
		}
	}


	
	/**
	 * 删除
	 * @param ids
	 * @return
	 */
	//@Log(title = "绘画作品分集删除", action = "111")
	@ApiOperation(value = "删除", notes = "删除")
	@PostMapping("/remove")
	@RequiresPermissions("gen:proPaintPart:remove")
	@ResponseBody
	public AjaxResult remove(String ids){
		int b=proPaintPartService.deleteBatchByPrimaryKey(ids);
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
	@RequiresPermissions("gen:proPaintPart:finish")
	@ResponseBody
	public AjaxResult finish(Integer ids){
		ProPaintPart data = new ProPaintPart();
		data.setId(new Long(ids));
		data.setFinish(1);
		int b = proPaintPartService.updateByPrimaryKeySelective(data);
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
	@ApiOperation(value = "查询根信息", notes = "查询根信息")
	@PostMapping("/queryRootInfo")
	@ResponseBody
	public AjaxResult queryRootInfo(ProPaintPart proPaintPart,String paintId){
		proPaintPart.setPaintId(paintId);
		Map<String,Object> resultMap = new HashMap<>();
		List<Map<String,Object>> resList = new ArrayList<>();
		if(proPaintPart.getRoot()==1){//根
			List<Map<String,Object>> list= proPaintPartService.queryRootInfo(proPaintPart);
			if(list!=null&&list.size()>0){
				resultMap.put("minIndex",list.size());
				resultMap.put("maxIndex",list.get(0).get("parts"));
			}
			return AjaxResult.successData(200,resultMap);
		}else if(proPaintPart.getRoot()==0){
			List<Map<String,Object>> list= proPaintPartService.queryNoRootChaptInfo(proPaintPart);
			if(list!=null&&list.size()>0){

				for (Map<String,Object> map : list){

					if(!StringUtils.isEmpty((String) map.get("rootId"))){
						String title = map.get("rootOrd")+"."+map.get("subject");
						map.put("title",title);
						resList.add(map);
					}
				}
			}
		}
		return AjaxResult.successData(200,resList);
	}


	/**
	 * 检查Name
	 * @param tsysUser
	 * @return
	 */
	@ApiOperation(value = "检查Name唯一", notes = "检查Name唯一")
	@PostMapping("/checkNameUnique")
	@ResponseBody
	public int checkNameUnique(ProPaintPart proPaintPart){
		int b=proPaintPartService.checkNameUnique(proPaintPart);
		if(b>0){
			return 1;
		}else{
			return 0;
		}
	}


	/**
	 * 检查Name
	 * @param tsysUser
	 * @return
	 */
/*	@ApiOperation(value = "查询绘画分篇序号", notes = "查询绘画分篇序号")
	@PostMapping("/queryPaintPartRoot")
	@ResponseBody
	public AjaxResult queryPaintPartRoot(ProPaintPart proPaintPart){
		int b=proPaintPartService.checkNameUnique(proPaintPart);
		if(b>0){
			return 1;
		}else{
			return 0;
		}
	}*/

	
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
        mmap.put("ProPaintPart", proPaintPartService.selectByPrimaryKey(id));

        return prefix + "/edit";
    }
	
	/**
     * 修改保存
     */
    //@Log(title = "绘画作品分集修改", action = "111")
    @ApiOperation(value = "修改保存", notes = "修改保存")
    @RequiresPermissions("gen:proPaintPart:edit")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(ProPaintPart record)
    {
        return toAjax(proPaintPartService.updateByPrimaryKeySelective(record));
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
   	public ProPaintPart edit(@PathVariable("id") String id) {
   		return proPaintPartService.selectByPrimaryKey(id);
   	}
    

	
}
