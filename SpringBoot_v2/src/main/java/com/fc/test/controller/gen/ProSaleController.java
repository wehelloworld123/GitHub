package com.fc.test.controller.gen;

import com.fc.test.model.auto.ProSaleExample;
import com.fc.test.shiro.util.ShiroUtils;
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
import com.fc.test.model.auto.ProSale;
import com.fc.test.model.custom.TableSplitResult;
import com.fc.test.model.custom.Tablepar;
import com.fc.test.model.custom.TitleVo;
import com.fc.test.service.ProSaleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "作品上架表")
@Controller
@RequestMapping("/ProSaleController")
public class ProSaleController extends BaseController{
	
	private String prefix = "gen/proSale";
	@Autowired
	private ProSaleService proSaleService;
	
	/**
	 * 分页跳转
	 */
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/view")
	@RequiresPermissions("gen:proSale:view")
    public String view(ModelMap model)
    {	
		String str="作品上架表";
		setTitle(model, new TitleVo("列表", str+"管理", true,"欢迎进入"+str+"页面", true, false));
        return prefix + "/list";
    }
	
	/**
	 * 分页查询
	 */
	//@Log(title = "作品上架表集合查询", action = "111")
	@ApiOperation(value = "分页查询", notes = "分页查询")
	@PostMapping("/list")
	@RequiresPermissions("gen:proSale:list")
	@ResponseBody
	public Object list(Tablepar tablepar,ProSale record){
		String userId = ShiroUtils.getUserId();
		record.setCreateBy(userId);
		PageInfo<ProSale> page=proSaleService.list(tablepar,record) ; 
		TableSplitResult<ProSale> result=new TableSplitResult<ProSale>(page.getPageNum(), page.getTotal(), page.getList()); 
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
	//@Log(title = "作品上架表新增", action = "111")
   	@ApiOperation(value = "新增", notes = "新增")
	@PostMapping("/add")
	@RequiresPermissions("gen:proSale:add")
	@ResponseBody
	public AjaxResult add(ProSale proSale){
		int b=proSaleService.insertSelective(proSale);
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
	//@Log(title = "作品上架表删除", action = "111")
	@ApiOperation(value = "删除", notes = "删除")
	@PostMapping("/remove")
	@RequiresPermissions("gen:proSale:remove")
	@ResponseBody
	public AjaxResult remove(String ids){
		int b=proSaleService.deleteBatchByPrimaryKey(ids);
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
	public int checkNameUnique(ProSale proSale){
		int b=proSaleService.checkNameUnique(proSale);
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
        mmap.put("ProSale", proSaleService.selectByPrimaryKey(id));

        return prefix + "/edit";
    }
	
	/**
     * 修改保存
     */
    //@Log(title = "作品上架表修改", action = "111")
    @ApiOperation(value = "修改保存", notes = "修改保存")
    @RequiresPermissions("gen:proSale:edit")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(ProSale record)
    {
    	ProSale proSale = new ProSale();
    	proSale.setId(record.getId());
		proSale.setProNo(record.getProNo());
		proSale.setDescription(record.getDescription());
		proSale.setSaleAmt(proSale.getSaleAmt());
		proSale.setDeadline(proSale.getDeadline());
		proSale.setSaleStatus("1");
		ProSaleExample example = new ProSaleExample();
		example.createCriteria().andSaleStatusEqualTo("0");//未上架
		example.createCriteria().andIsDelEqualTo(0);
        return toAjax(proSaleService.updateByExample(proSale,example));
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
   	public ProSale edit(@PathVariable("id") String id) {
   		return proSaleService.selectByPrimaryKey(id);
   	}
    

	
}
