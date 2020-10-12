package com.fc.test.controller.custmanage;

import com.fc.test.common.base.BaseController;
import com.fc.test.common.domain.AjaxResult;
import com.fc.test.common.enums.ProStatus;
import com.fc.test.model.auto.ProPoemset;
import com.fc.test.model.custom.TableSplitResult;
import com.fc.test.model.custom.Tablepar;
import com.fc.test.model.custom.TitleVo;
import com.fc.test.service.ProPoemsetService;
import com.fc.test.shiro.util.ShiroUtils;
import com.fc.test.util.CaculateUtils;
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

@Api(value = "诗歌作品分集")
@Controller
@RequestMapping("/ProPoemsetManageController")
public class ProPoemsetManageController extends BaseController{
	
	private String prefix = "manage/proPoemset";
	@Autowired
	private ProPoemsetService proPoemsetService;
	
	/**
	 * 分页跳转
	 */
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/view")
	@RequiresPermissions("gen:proPoemsetManage:view")
    public String view(ModelMap model)
    {	
		String str="诗歌作品分集";
		setTitle(model, new TitleVo("列表", str+"管理", true,"欢迎进入"+str+"页面", true, false));
        return prefix + "/list";
    }
	
	/**
	 * 分页查询
	 */
	//@Log(title = "诗歌作品分集集合查询", action = "111")
	@ApiOperation(value = "分页查询", notes = "分页查询")
	@PostMapping("/list")
	@RequiresPermissions("gen:proPoemsetManage:list")
	@ResponseBody
	public Object list(Tablepar tablepar,ProPoemset record){
		if(!CaculateUtils.isEmpty(record.getPoetryId())){
			record.setPoetryId(null);
		}
		record.setIsDel(0);
		PageInfo<ProPoemset> page=proPoemsetService.listByCreateBy(tablepar,record) ;
		TableSplitResult<ProPoemset> result=new TableSplitResult<ProPoemset>(page.getPageNum(), page.getTotal(), page.getList()); 
		return  result;
	}

	/**
	 * 分页跳转
	 */
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/view2")
	@RequiresPermissions("gen:proPoemsetManage:view")
	public String view2(ModelMap model,String uid)
	{
		model.addAttribute("poetryId",uid);
		String str="诗歌作品分集";
		setTitle(model, new TitleVo("列表", str+"管理", true,"欢迎进入"+str+"页面", true, false));
		return prefix + "/list2";
	}

	/**
	 * 完成
	 * @param ids
	 * @return
	 */
	//@Log(title = "绘画作品分集完成", action = "111")
	@ApiOperation(value = "完成", notes = "完成")
	@PostMapping("/finish")
	@RequiresPermissions("gen:proPoemsetManage:finish")
	@ResponseBody
	public AjaxResult finish(Integer ids){
		ProPoemset data = new ProPoemset();
		data.setId(new Long(ids));
		data.setFinish(ProStatus.finish.getValue());
		int b = proPoemsetService.updateByPrimaryKeySelective(data);
		if(b>0){
			return success();
		}else{
			return error();
		}
	}

	/**
	 * 分页查询
	 */
	//@Log(title = "绘画作品分集集合查询", action = "111")
	@ApiOperation(value = "分页查询", notes = "分页查询")
	@PostMapping("/list2")
	@RequiresPermissions("gen:proPoemsetManage:list2")
	@ResponseBody
	public Object list2(Tablepar tablepar,ProPoemset record,String poetryId){

		record.setPoetryId(poetryId);
		PageInfo<ProPoemset> page=proPoemsetService.list(tablepar,record) ;
		TableSplitResult<ProPoemset> result=new TableSplitResult<ProPoemset>(page.getPageNum(), page.getTotal(), page.getList());
		return  result;
	}

	/**
	 * 检查Name
	 * @param tsysUser
	 * @return
	 */
	@ApiOperation(value = "查询根信息", notes = "查询根信息")
	@PostMapping("/queryRootInfo")
	@ResponseBody
	public AjaxResult queryRootInfo(ProPoemset proPoemset,String poetryId){
		proPoemset.setPoetryId(poetryId);
		Map<String,Object> resultMap = new HashMap<>();
		List<Map<String,Object>> resList = new ArrayList<>();
		if(proPoemset.getRoot()==1){//根
			List<Map<String,Object>> list= proPoemsetService.queryRootInfo(proPoemset);
			if(list!=null&&list.size()>0){
				resultMap.put("minIndex",list.size());
				resultMap.put("maxIndex",list.get(0).get("parts"));
			}
			return AjaxResult.successData(200,resultMap);
		}else if(proPoemset.getRoot()==0){
			List<Map<String,Object>> list= proPoemsetService.queryNoRootChaptInfo(proPoemset);
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
     * 新增跳转
     */
    @ApiOperation(value = "新增跳转", notes = "新增跳转")
    @GetMapping("/add")
    public String add(ModelMap modelMap,String poetryId)
    {
		modelMap.addAttribute("poetryId",poetryId);
        return prefix + "/add";
    }
	
	/**
     * 新增
     */
	//@Log(title = "诗歌作品分集新增", action = "111")
   	@ApiOperation(value = "新增", notes = "新增")
	@PostMapping("/add")
	@RequiresPermissions("gen:proPoemsetManage:add")
	@ResponseBody
	public AjaxResult add(ProPoemset proPoemset){
		int b=proPoemsetService.insertSelective(proPoemset);
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
	//@Log(title = "诗歌作品分集删除", action = "111")
	@ApiOperation(value = "删除", notes = "删除")
	@PostMapping("/remove")
	@RequiresPermissions("gen:proPoemsetManage:remove")
	@ResponseBody
	public AjaxResult remove(String ids){
		ProPoemset data = new ProPoemset();
		data.setId(new Long(ids));
		data.setIsDel(1);
		int b = proPoemsetService.updateByPrimaryKeySelective(data);
		//int b=proPoemsetService.deleteByPrimaryKey(ids);
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
	public int checkNameUnique(ProPoemset proPoemset){
		int b=proPoemsetService.checkNameUnique(proPoemset);
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
        mmap.put("ProPoemset", proPoemsetService.selectByPrimaryKey(id));

        return prefix + "/edit";
    }
	
	/**
     * 修改保存
     */
    //@Log(title = "诗歌作品分集修改", action = "111")
    @ApiOperation(value = "修改保存", notes = "修改保存")
    @RequiresPermissions("gen:proPoemsetManage:edit")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(ProPoemset record)
    {
        return toAjax(proPoemsetService.updateByPrimaryKeySelective(record));
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
   	public ProPoemset edit(@PathVariable("id") String id) {
   		return proPoemsetService.selectByPrimaryKey(id);
   	}
    

	
}
