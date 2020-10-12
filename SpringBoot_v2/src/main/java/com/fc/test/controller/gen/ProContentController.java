package com.fc.test.controller.gen;

import com.fc.test.constant.ProjectConstant;
import com.fc.test.model.auto.ProCharpt;
import com.fc.test.model.auto.UserClient;
import com.fc.test.model.auto.UserClientExample;
import com.fc.test.model.custom.messagePush.PushMessage;
import com.fc.test.service.ProCharptService;
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
import com.fc.test.model.auto.ProContent;
import com.fc.test.model.custom.TableSplitResult;
import com.fc.test.model.custom.Tablepar;
import com.fc.test.model.custom.TitleVo;
import com.fc.test.service.ProContentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.List;
import java.util.Map;

@Api(value = "文学创作内容")
@Controller
@RequestMapping("/ProContentController")
public class ProContentController extends BaseController{
	
	private String prefix = "gen/proContent";
	@Autowired
	private ProContentService proContentService;
	@Autowired
	private UserClientService userClientService;
	@Autowired
	private ProCharptService proCharptService;
	/**
	 * 分页跳转
	 */
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/view")
	@RequiresPermissions("gen:proContent:view")
    public String view(ModelMap model)
    {	
		String str="文学创作内容";
		setTitle(model, new TitleVo("列表", str+"管理", true,"欢迎进入"+str+"页面", true, false));
        return prefix + "/list";
    }
	
	/**
	 * 分页查询
	 */
	//@Log(title = "文学创作内容集合查询", action = "111")
	@ApiOperation(value = "分页查询", notes = "分页查询")
	@PostMapping("/list")
	@RequiresPermissions("gen:proContent:list")
	@ResponseBody
	public Object list(Tablepar tablepar,ProContent record){
		record.setCreateBy(ShiroUtils.getUserId());
		PageInfo<ProContent> page=proContentService.list(tablepar,record) ; 
		TableSplitResult<ProContent> result=new TableSplitResult<ProContent>(page.getPageNum(), page.getTotal(), page.getList()); 
		return  result;
	}



	/**
	 * 分页跳转
	 */
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/view2")
	@RequiresPermissions("gen:proCharpt:view")
	public String view2(ModelMap model,Integer no)
	{
		model.addAttribute("charpId",no);
		String str="文章创作内容";
		setTitle(model, new TitleVo("列表", str+"管理", true,"欢迎进入"+str+"页面", true, false));
		return prefix + "/list2";
	}

	/**
	 * 分页查询
	 */
	//@Log(title = "诗歌作品分集集合查询", action = "111")
	@ApiOperation(value = "分页查询", notes = "分页查询")
	@PostMapping("/list2")
	@RequiresPermissions("gen:proContent:list2")
	@ResponseBody
	public Object list2(Tablepar tablepar,ProContent record,Integer charpId){
		System.out.println("--------------------");
		System.out.println(tablepar);
		System.out.println(charpId);
		record.setCharpId(new Long(charpId));
		//record.setCreateBy(ShiroUtils.getUserId());
		record.setLikes(100);
		record.setRecomNo(40);
		record.setViews(1);
		PageInfo<ProContent> page=proContentService.queryRecomContentList(tablepar,record) ;
		TableSplitResult<ProContent> result=new TableSplitResult<ProContent>(page.getPageNum(), page.getTotal(), page.getList());
		return  result;
	}


	/**
	 * 分页跳转
	 */
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/view3")
	@RequiresPermissions("gen:proCharpt:view")
	public String view3(ModelMap model,Integer no)
	{
		model.addAttribute("charpId",no);
		String str="文章创作内容";
		setTitle(model, new TitleVo("列表", str+"管理", true,"欢迎进入"+str+"页面", true, false));
		return prefix + "/list3";
	}

	/**
	 * 分页查询
	 */
	//@Log(title = "诗歌作品分集集合查询", action = "111")
	@ApiOperation(value = "分页查询", notes = "分页查询")
	@PostMapping("/list3")
	@RequiresPermissions("gen:proContent:list3")
	@ResponseBody
	public Object list3(Tablepar tablepar,ProContent record,Integer charpId){
		System.out.println("--------------------");
		System.out.println(tablepar);
		System.out.println(charpId);
		record.setCharpId(new Long(charpId));
		PageInfo<ProContent> page=proContentService.queryAdoptContentList(tablepar,record) ;
		TableSplitResult<ProContent> result=new TableSplitResult<ProContent>(page.getPageNum(), page.getTotal(), page.getList());
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
	//@Log(title = "文学创作内容新增", action = "111")
   	@ApiOperation(value = "新增", notes = "新增")
	@PostMapping("/add")
	@RequiresPermissions("gen:proContent:add")
	@ResponseBody
	public AjaxResult add(ProContent proContent){
		int b=proContentService.insertSelective(proContent);
		if(b>0){
			return success();
		}else{
			return error();
		}
	}


	/**
	 * 采纳
	 */
	//@Log(title = "采纳", action = "111")
	@ApiOperation(value = "采纳", notes = "采纳")
	@RequiresPermissions("gen:proContent:list2")
	@PostMapping("/adopt")
	@ResponseBody
	public AjaxResult adopt(String no,String charpId)
	{
		if(!StringUtils.isEmpty(no)&&charpId!=null) {

			ProContent record = new ProContent();
			record.setNo(no);
			record.setAdopt(1);
			record.setCharpId(new Long(charpId));
			int i = proContentService.selectAdoptCount(record);//是否重复采纳
			if (i == 0) {
				ProContent proContent = proContentService.selectByPrimaryKey(no);
				Map<String,Object> map = proCharptService.queryProductInfoByChaptId(new ProCharpt(new Long(charpId)));
				if(!StringUtils.isEmpty(proContent.getCreateBy())) {
					UserClientExample example = new UserClientExample();
					example.createCriteria().andUserIdEqualTo(proContent.getCreateBy());
					example.createCriteria().andIsDelEqualTo(0);
					List<UserClient> list = userClientService.selectByExample(example);
					PushMessage pushMessage = new PushMessage();
					pushMessage.setTitle(ProjectConstant.SYS_TITLE);
					String bookName = (String)map.get("bookName");
					String title = (String)map.get("title");
					String context = "您的作品 《"+proContent.getTitle()+"》被《"+bookName+"》章节："+title+"邀请采纳!";
					pushMessage.setContent(context);
					GeTuiUtil.sendMessageAndroid(pushMessage,list);
					GeTuiUtil.sendMessageIos(pushMessage,list);
					record.setlUpdateDat(DateUtils.getNowDate());
					return toAjax(proContentService.updateByPrimaryKeySelective(record));
				}else {
					return toAjax(0);
				}
			} else {
				return toAjax(0);
			}
		}else {
			return toAjax(0);
		}
	}
	
	/**
	 * 删除
	 * @param ids
	 * @return
	 */
	//@Log(title = "文学创作内容删除", action = "111")
	@ApiOperation(value = "删除", notes = "删除")
	@PostMapping("/remove")
	@RequiresPermissions("gen:proContent:remove")
	@ResponseBody
	public AjaxResult remove(String ids){
		int b=proContentService.deleteBatchByPrimaryKey(ids);
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
	public int checkNameUnique(ProContent proContent){
		int b=proContentService.checkNameUnique(proContent);
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
        mmap.put("ProContent", proContentService.selectByPrimaryKey(id));

        return prefix + "/edit";
    }
	
	/**
     * 修改保存
     */
    //@Log(title = "文学创作内容修改", action = "111")
    @ApiOperation(value = "修改保存", notes = "修改保存")
    @RequiresPermissions("gen:proContent:edit")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(ProContent record)
    {
        return toAjax(proContentService.updateByPrimaryKeySelective(record));
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
   	public ProContent edit(@PathVariable("id") String id) {
   		return proContentService.selectByPrimaryKey(id);
   	}
    

	
}
