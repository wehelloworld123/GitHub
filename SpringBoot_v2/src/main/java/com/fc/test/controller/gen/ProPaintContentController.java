package com.fc.test.controller.gen;

import com.fc.test.constant.ProjectConstant;
import com.fc.test.model.auto.ProPaintPart;
import com.fc.test.model.auto.UserClient;
import com.fc.test.model.auto.UserClientExample;
import com.fc.test.model.custom.messagePush.PushMessage;
import com.fc.test.service.ProPaintPartService;
import com.fc.test.service.UserClientService;
import com.fc.test.shiro.util.ShiroUtils;
import com.fc.test.util.DateUtils;
import com.fc.test.util.GeTuiUtil;
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
import com.fc.test.model.auto.ProPaintContent;
import com.fc.test.model.custom.TableSplitResult;
import com.fc.test.model.custom.Tablepar;
import com.fc.test.model.custom.TitleVo;
import com.fc.test.service.ProPaintContentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.List;
import java.util.Map;

@Api(value = "绘画创作内容")
@Controller
@RequestMapping("/ProPaintContentController")
public class ProPaintContentController extends BaseController{
	
	private String prefix = "gen/proPaintContent";
	@Autowired
	private ProPaintContentService proPaintContentService;
	@Autowired
	private UserClientService userClientService;
	@Autowired
	private ProPaintPartService proPaintPartService;

	/**
	 * 分页跳转
	 */
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/view")
	@RequiresPermissions("gen:proPaintContent:view")
    public String view(ModelMap model)
    {	
		String str="绘画创作内容";
		setTitle(model, new TitleVo("列表", str+"管理", true,"欢迎进入"+str+"页面", true, false));
        return prefix + "/list";
    }
	
	/**
	 * 分页查询
	 */
	//@Log(title = "绘画创作内容集合查询", action = "111")
	@ApiOperation(value = "分页查询", notes = "分页查询")
	@PostMapping("/list")
	@RequiresPermissions("gen:proPaintContent:list")
	@ResponseBody
	public Object list(Tablepar tablepar,ProPaintContent record){
		PageInfo<ProPaintContent> page=proPaintContentService.list(tablepar,record) ; 
		TableSplitResult<ProPaintContent> result=new TableSplitResult<ProPaintContent>(page.getPageNum(), page.getTotal(), page.getList()); 
		return  result;
	}

	/**
	 * 分页跳转
	 */
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/view2")
	@RequiresPermissions("gen:proPaintPart:view")
	public String view2(ModelMap model,Integer no)
	{
		model.addAttribute("partId",no);
		String str="绘画创作内容";
		setTitle(model, new TitleVo("列表", str+"管理", true,"欢迎进入"+str+"页面", true, false));
		return prefix + "/list2";
	}

	/**
	 * 分页查询
	 */
	//@Log(title = "绘画作品分集集合查询", action = "111")
	@ApiOperation(value = "分页查询", notes = "分页查询")
	@PostMapping("/list2")
	@RequiresPermissions("gen:proPaintContent:list2")
	@ResponseBody
	public Object list2(Tablepar tablepar,ProPaintContent record,Integer partId){
		System.out.println("--------------------");
		System.out.println(tablepar);
		System.out.println(partId);
		record.setPartId(partId);
		//record.setCreateBy(ShiroUtils.getUserId());
		record.setLikes(100);
		record.setRecomNo(40);
		record.setViews(1);
		PageInfo<ProPaintContent> page=proPaintContentService.queryRecomContentList(tablepar,record) ;
		TableSplitResult<ProPaintContent> result=new TableSplitResult<ProPaintContent>(page.getPageNum(), page.getTotal(), page.getList());
		return  result;
	}
	/**
	 * 分页跳转
	 */
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/view3")
	@RequiresPermissions("gen:proPaintPart:view")
	public String view3(ModelMap model,Integer no)
	{
		model.addAttribute("partId",no);
		String str="绘画创作内容";
		setTitle(model, new TitleVo("列表", str+"管理", true,"欢迎进入"+str+"页面", true, false));
		return prefix + "/list3";
	}

	/**
	 * 分页查询
	 */
	//@Log(title = "绘画作品分集集合查询", action = "111")
	@ApiOperation(value = "分页查询", notes = "分页查询")
	@PostMapping("/list3")
	@RequiresPermissions("gen:proPaintContent:list3")
	@ResponseBody
	public Object list3(Tablepar tablepar,ProPaintContent record,Integer partId){
		System.out.println("--------------------");
		System.out.println(tablepar);
		System.out.println(partId);
		record.setPartId(partId);
		PageInfo<ProPaintContent> page=proPaintContentService.queryAdoptContentList(tablepar,record) ;
		TableSplitResult<ProPaintContent> result=new TableSplitResult<ProPaintContent>(page.getPageNum(), page.getTotal(), page.getList());
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
	//@Log(title = "绘画创作内容新增", action = "111")
   	@ApiOperation(value = "新增", notes = "新增")
	@PostMapping("/add")
	@RequiresPermissions("gen:proPaintContent:add")
	@ResponseBody
	public AjaxResult add(ProPaintContent proPaintContent){
		int b=proPaintContentService.insertSelective(proPaintContent);
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
	//@Log(title = "绘画创作内容删除", action = "111")
	@ApiOperation(value = "删除", notes = "删除")
	@PostMapping("/remove")
	@RequiresPermissions("gen:proPaintContent:remove")
	@ResponseBody
	public AjaxResult remove(String ids){
		int b=proPaintContentService.deleteBatchByPrimaryKey(ids);
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
	public int checkNameUnique(ProPaintContent proPaintContent){
		int b=proPaintContentService.checkNameUnique(proPaintContent);
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
        mmap.put("ProPaintContent", proPaintContentService.selectByPrimaryKey(id));

        return prefix + "/edit";
    }
	
	/**
	 * 修改保存
	 */
	//@Log(title = "绘画创作内容修改", action = "111")
	@ApiOperation(value = "修改保存", notes = "修改保存")
	@RequiresPermissions("gen:proPaintContent:edit")
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(ProPaintContent record)
	{
		return toAjax(proPaintContentService.updateByPrimaryKeySelective(record));
	}

	/**
	 * 采纳
	 */
	//@Log(title = "采纳", action = "111")
	@ApiOperation(value = "采纳", notes = "采纳")
	@RequiresPermissions("gen:proPaintContent:list2")
	@PostMapping("/adopt")
	@ResponseBody
	public AjaxResult adopt(String no,Integer partId)
	{
		if(!StringUtils.isEmpty(no)&&partId!=null) {
			ProPaintContent record = new ProPaintContent();
			record.setNo(no);
			record.setAdopt(1);
			record.setPartId(partId);
			int i = proPaintContentService.selectAdoptCount(record);
			if (i == 0) {
				ProPaintContent proContent = proPaintContentService.selectByPrimaryKey(no);
				Map<String,Object> map = proPaintPartService.queryProductInfoByChaptId(new ProPaintPart(new Long(partId)));
				if(!StringUtils.isEmpty(proContent.getCreateBy())) {
					UserClientExample example = new UserClientExample();
					example.createCriteria().andUserIdEqualTo(proContent.getCreateBy());
					example.createCriteria().andIsDelEqualTo(0);
					List<UserClient> list = userClientService.selectByExample(example);
					PushMessage pushMessage = new PushMessage();
					pushMessage.setTitle(ProjectConstant.SYS_TITLE);
					String paintName = map.get("seter")+"-"+map.get("paintName");
					String title = (String) map.get("subject");
					String context = "您的作品 《" + proContent.getTitle() + "》被《" + paintName + "》章节：" + title + "邀请采纳!";
					pushMessage.setContent(context);
					GeTuiUtil.sendMessageAndroid(pushMessage, list);
					GeTuiUtil.sendMessageIos(pushMessage, list);
					record.setlUpdateDat(DateUtils.getNowDate());
				}else{
					return toAjax(0);
				}
				return toAjax(proPaintContentService.updateByPrimaryKeySelective(record));
			} else {
				return toAjax(0);
			}
		}else {
			return toAjax(0);
		}
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
   	public ProPaintContent edit(@PathVariable("id") String id) {
   		return proPaintContentService.selectByPrimaryKey(id);
   	}
    

	
}
