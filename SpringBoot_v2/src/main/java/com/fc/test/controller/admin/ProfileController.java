package com.fc.test.controller.admin;

import java.util.List;

import com.fc.test.common.base.BaseController;
import com.fc.test.common.domain.AjaxResult;
import com.fc.test.model.auto.*;
import com.fc.test.model.custom.TableSplitResult;
import com.fc.test.model.custom.Tablepar;
import com.fc.test.model.custom.TitleVo;
import com.fc.test.service.ProLiterService;
import com.fc.test.service.ProPaintService;
import com.fc.test.service.ProPoetryService;
import com.fc.test.service.SysUserService;
import com.fc.test.shiro.util.ShiroUtils;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 资料Controller
 * @author xuyong
 * @date: 2020年7月18日 下午8:08:21
 */
@Api(value = "用户资料")
@Controller
@RequestMapping("/profile")
public class ProfileController  extends BaseController{

    //跳转页面参数
    private String prefix = "admin";

    @Autowired
    private SysUserService sysUserService;
    @Autowired
    private ProLiterService proLiterService;
    @Autowired
    private ProPaintService proPaintService;
    @Autowired
    private ProPoetryService proPoetryService;
    /**
     * 资料展示
     * @param model
     * @return
     * @author xuyong
     * @Date 2019年11月11日 下午3:43:51
     */
    @ApiOperation(value = "分页跳转", notes = "分页跳转")
    @GetMapping("/view")
    @RequiresPermissions("system:profile:view")
    public String view(ModelMap model)
    {
        String str="资料";
        String userId = ShiroUtils.getUserId();
        TsysUser tsysUser = sysUserService.selectByPrimaryKey(userId);
        ProLiterExample proLiterExample = new ProLiterExample();
        proLiterExample.createCriteria().andCreateByEqualTo(userId);
        proLiterExample.createCriteria().andFinishEqualTo(1);
        Long count1 =proLiterService.countByExample(proLiterExample);

        ProPaintExample proPaintExample = new ProPaintExample();
        proPaintExample.createCriteria().andCreateByEqualTo(userId);
        proPaintExample.createCriteria().andFinishEqualTo(1);
        Long count2 =proPaintService.countByExample(proPaintExample);

        ProPoetryExample proPoetryExample = new ProPoetryExample();
        proPoetryExample.createCriteria().andCreateByEqualTo(userId);
        proPoetryExample.createCriteria().andFinishEqualTo(1);
        Long count3 =proPoetryService.countByExample(proPoetryExample);
        tsysUser.setPassword(null);
        model.put("userEntity",tsysUser);
        model.put("literature",count1);
        model.put("painting",count2);
        model.put("poetry",count3);
        setTitle(model, new TitleVo("列表", str+"管理", true,"欢迎进入"+str+"页面", true, false));
        return prefix+"/profile";
    }

    /**
     * 分页查询
     */
    //@Log(title = "文学创作信息表集合查询", action = "111")
    @ApiOperation(value = "分页查询", notes = "分页查询")
    @PostMapping("/list")
    @RequiresPermissions("system:profile:list")
    @ResponseBody
    public Object list(Tablepar tablepar){
        return  AjaxResult.success();
    }

}
