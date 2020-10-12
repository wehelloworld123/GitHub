package com.fc.test.controller;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fc.test.common.base.BaseController;
import com.fc.test.common.conf.V2Config;
import com.fc.test.common.domain.AjaxResult;
import com.fc.test.common.enums.RoleEnum;
import com.fc.test.constant.ProjectConstant;
import com.fc.test.model.auto.*;
import com.fc.test.model.custom.BootstrapTree;
import com.fc.test.model.custom.Tablepar;
import com.fc.test.model.custom.TitleVo;
import com.fc.test.model.custom.email.MailSenderInfo;
import com.fc.test.service.ProSaleService;
import com.fc.test.shiro.util.ShiroUtils;
import com.fc.test.util.CaculateUtils;
import com.fc.test.util.SimpleEmailUtil;
import com.fc.test.util.StringUtils;
import com.github.pagehelper.PageInfo;
import com.google.code.kaptcha.Constants;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * 后台方法
 * @ClassName: HomeController
 * @author fuce
 * @date 2019-10-21 00:10
 *
 */
@Controller
@RequestMapping("/admin")
public class AdminController extends BaseController{
	private static Logger logger=LoggerFactory.getLogger(AdminController.class);

	@Autowired
	private ProSaleService proSaleService;

	private String prefix = "admin";
	
	@ApiOperation(value="首页",notes="首页")
	@GetMapping("/index")
	public String index(HttpServletRequest request) {
    	//获取菜单栏
    	BootstrapTree bootstrapTree= sysPermissionService.getbooBootstrapTreePerm(ShiroUtils.getUserId());
    	request.getSession().setAttribute("bootstrapTree", bootstrapTree);
    	request.getSession().setAttribute("sessionUserName",ShiroUtils.getUser().getNickname());
    	//获取公告信息
    	List<SysNotice>  notices=sysNoticeService.getuserNoticeNotRead(ShiroUtils.getUser(),0);
    	request.getSession().setAttribute("notices",notices);
		return prefix+"/index";
	}
	
	@ApiOperation(value="局部刷新区域",notes="局部刷新区域")
	@GetMapping("/main")
	public String main(ModelMap map,Integer pageNum,Integer pageSize) {
		ProSale record = new ProSale();
		record.setSaleStatus("0");
		Tablepar tablepar = new Tablepar();
		tablepar.setPageNum(pageNum);
		tablepar.setPageSize(pageSize);

		PageInfo<ProSale> pageInfo = proSaleService.listByExample(tablepar,record);
		List<ProSale> list = pageInfo.getList();
		List<ProSale> proSale1 = new ArrayList<>();
		List<ProSale> proSale2 = new ArrayList<>();
		List<ProSale> proSale3 = new ArrayList<>();
		for(int i =0;i<list.size();i++){
			if(i<4){
				proSale1.add(list.get(i));
			}else if(i<8){
				proSale2.add(list.get(i));
			}else if(i<12){
				proSale3.add(list.get(i));
			}

		}
		map.addAttribute("proSale1",proSale1);
		map.addAttribute("proSale2",proSale2);
		map.addAttribute("proSale3",proSale3);
		setTitle(map, new TitleVo("首页", "首页", true,"欢迎进入", true, false));
		return prefix+"/main";
	}
	
	/**
	 * 请求到登陆界面
	 * @param modelMap
	 * @return
	 */
	@ApiOperation(value="请求到登陆界面",notes="请求到登陆界面")
	@GetMapping("/login")
    public String login(ModelMap modelMap) {
        try {
            if ((null != SecurityUtils.getSubject() && SecurityUtils.getSubject().isAuthenticated()) || SecurityUtils.getSubject().isRemembered()) {

            	return "redirect:/"+prefix+"/index";
            } else {
            	System.out.println("--进行登录验证..验证开始"); 

            	modelMap.put("RollVerification", V2Config.getRollVerification());
            	System.out.println("V2Config.getRollVerification()>>>"+V2Config.getRollVerification());
                return "login";
            }
        } catch (Exception e) {
        		e.printStackTrace();
        }
        return "login";
    }
	/**
	 * 请求到忘记密码界面
	 * @param modelMap
	 * @return
	 */
	@ApiOperation(value="请求到忘记密码界面",notes="请求到忘记密码界面")
	@GetMapping("/forget")
	public String forget(ModelMap modelMap,Integer page) {
		if(page!=null) {
			modelMap.put("page", page);
		}else{
			modelMap.put("page", 0);
		}
		return "forget";
	}


	/**
	 * 请求到登陆界面
	 * @param request
	 * @return
	 */
	@ApiOperation(value="请求到注册界面",notes="请求到注册界面")
	@GetMapping("/enroll")
	public String enroll(ModelMap modelMap) {
		return "enroll";
	}
	/**
	 * 请求到登陆界面
	 * @param request
	 * @return
	 */
	@ApiOperation(value="请求到注册界面",notes="请求到注册界面")
	@PostMapping("/enroll")
	@ResponseBody
	public AjaxResult enroll(TsysUser user,String code,RedirectAttributes redirectAttributes,HttpServletRequest request){
		ModelAndView view =new ModelAndView();
		String scode = (String)request.getSession().getAttribute(Constants.KAPTCHA_SESSION_KEY);
		try {
			//判断验证码
			if(StringUtils.isNotEmpty(scode)&&StringUtils.isNotEmpty(code)&&scode.equals(code)){
				List<String> roles = new ArrayList<>();
				List<TsysRole> tsysRoles = sysRoleService.listByName(RoleEnum.USER.getValue());
				if(tsysRoles!=null&&tsysRoles.size()>0){
					for(TsysRole role : tsysRoles) {
						roles.add(role.getId());
					}
				}
				int b=sysUserService.insertUserRoles(user,roles);
				if(b>0){
					return AjaxResult.success();
				}else{
					return AjaxResult.error(500,"注册失败");
				}
			} else {
				System.out.println("V2Config.getRollVerification()>>>"+V2Config.getRollVerification());
				redirectAttributes.addFlashAttribute("message", "验证码不正确");
				return AjaxResult.error(500,"验证码有误");
			}
		} catch (Exception e) {
			throw e;
		}

	}


	/**
	 * 确认账号
	 * @param request
	 * @return
	 */
	@ApiOperation(value="确认账号",notes="确认账号")
	@PostMapping("/confirm")
	@ResponseBody
	public AjaxResult confirm(TsysUser user,String code,RedirectAttributes redirectAttributes,HttpServletRequest request) throws Exception {
		ModelMap view =new ModelMap();
		view.put("page",1);
		String scode = (String)request.getSession().getAttribute(Constants.KAPTCHA_SESSION_KEY);
		try {
			//判断验证码
			if(StringUtils.isNotEmpty(scode)&&StringUtils.isNotEmpty(code)&&scode.equals(code)){
				TsysUserExample tsysUserExample = new TsysUserExample();
				tsysUserExample.createCriteria().andUsernameEqualTo(user.getUsername());
				tsysUserExample.createCriteria().andEmailEqualTo(user.getEmail());
				List<TsysUser> tsysUsers = sysUserService.selectByExample(tsysUserExample);
				if(tsysUsers!=null&&tsysUsers.size()>0){
					MailSenderInfo mailSenderInfo = new MailSenderInfo();
					mailSenderInfo.setMailServerHost(V2Config.getEmail_smtp());
					mailSenderInfo.setMailServerPort(V2Config.getEmail_port());
					mailSenderInfo.setUserName(V2Config.getEmail_account());
					mailSenderInfo.setPassword(V2Config.getEmail_password());
					mailSenderInfo.setFromAddress(V2Config.getEmail_account());
					mailSenderInfo.setValidate(true);
					mailSenderInfo.setToAddress(tsysUsers.get(0).getEmail());
					mailSenderInfo.setSubject("我思 |  重置密码邮箱验证");
					String email_code = CaculateUtils.getNonce_str(6);

					HttpSession session = request.getSession();
					session.setAttribute(ProjectConstant.EMAIL_CODE,email_code);

					session.setAttribute(email_code,tsysUsers.get(0).getId());
					String content = ProjectConstant.EMAIL_TEXT1+ email_code+ProjectConstant.EMAIL_TEXT2;

					mailSenderInfo.setContent(content);
					SimpleEmailUtil sms = new SimpleEmailUtil();
					sms.sendHtmlMail(mailSenderInfo,null);
					return AjaxResult.success();
				}else{
					return AjaxResult.error(500,"账号或邮箱不存在");
				}
			} else {
				System.out.println("V2Config.getRollVerification()>>>"+V2Config.getRollVerification());
				redirectAttributes.addFlashAttribute("message", "验证码不正确");
				return AjaxResult.error(500,"验证码有误");
			}
		} catch (Exception e) {
			logger.error(e.getMessage());
			return AjaxResult.error(500,e.getMessage().substring(500));
		}

	}

	/**
	 * 重置账号
	 * @param request
	 * @return
	 */
	@ApiOperation(value="重置账号",notes="重置账号")
	@PostMapping("/reset")
	@ResponseBody
	public AjaxResult reset(TsysUser user,String code,String emailCode,RedirectAttributes redirectAttributes,HttpServletRequest request){
		ModelAndView view =new ModelAndView();
		logger.info("emailCode:"+emailCode);
		String scode = (String)request.getSession().getAttribute(Constants.KAPTCHA_SESSION_KEY);
		String email_code = (String)request.getSession().getAttribute(ProjectConstant.EMAIL_CODE);
		logger.info("email_code:"+email_code);
		try {
			//判断验证码
			if(StringUtils.isNotEmpty(scode)&&StringUtils.isNotEmpty(code)&&scode.equals(code)){
				if(StringUtils.isNotEmpty(email_code)&&StringUtils.isNotEmpty(emailCode)&&email_code.equals(emailCode)){
					String userId = (String)request.getSession().getAttribute(email_code);
					user.setId(userId);
					logger.info("user:"+user);
					TsysUserExample userExample = new TsysUserExample();
					userExample.createCriteria().andIdEqualTo(user.getId());
					userExample.createCriteria().andIsDelEqualTo(0);
					int b=sysUserService.updateByExampleSelective(user,userExample);
					if(b>0){
						logger.info("success");
						return AjaxResult.success();
					}else{
						logger.info("error");
						return AjaxResult.error(500,"重置失败");
					}

				}else{
					return AjaxResult.error(500,"邮箱确认码失效或不正确");
				}


			} else {
				System.out.println("V2Config.getRollVerification()>>>"+V2Config.getRollVerification());
				redirectAttributes.addFlashAttribute("message", "验证码不正确");
				return AjaxResult.error(500,"验证码有误");
			}
		} catch (Exception e) {
			throw e;
		}

	}
	/**
	 * 用户登陆验证
	 * @param user
	 * @param rcode
	 * @param redirectAttributes
	 * @param rememberMe
	 * @param model
	 * @param request
	 * @return
	 */
	@ApiOperation(value="用户登陆验证",notes="用户登陆验证")
	@PostMapping("/login")
	@ResponseBody
	public AjaxResult login(TsysUser user,String code,RedirectAttributes redirectAttributes,boolean rememberMe,HttpServletRequest request) {
		 //ModelAndView view =new ModelAndView();
		Boolean yz=false;
		if(V2Config.getRollVerification()) {//滚动验证
			yz=true;
		}else {//图片验证
			 String scode = (String)request.getSession().getAttribute(Constants.KAPTCHA_SESSION_KEY);
			 yz=StringUtils.isNotEmpty(scode)&&StringUtils.isNotEmpty(code)&&scode.equals(code);
		}
		 //判断验证码
		 if(yz){
			 String userName = user.getUsername();
			 Subject currentUser = SecurityUtils.getSubject();
			 //是否验证通过
			 if(!currentUser.isAuthenticated()) {
				 UsernamePasswordToken token =new UsernamePasswordToken(userName,user.getPassword());
				 try {
					 if(rememberMe) {
						 token.setRememberMe(true);
					 }
					 //存入用户
					 currentUser.login(token);
					 if(StringUtils.isNotNull(ShiroUtils.getUser())) {
			         	 //跳转到 get请求的登陆方法
			    		 //view.setViewName("redirect:/"+prefix+"/index");
			     		 return  AjaxResult.success();
			     	 }else {
			     		 return  AjaxResult.error(500,"未知账户");
			     	 }
				 }catch (UnknownAccountException uae) {
			            logger.info("对用户[" + userName + "]进行登录验证..验证未通过,未知账户");
			         	return  AjaxResult.error(500,"未知账户");
			        } catch (IncorrectCredentialsException ice) {
			            logger.info("对用户[" + userName + "]进行登录验证..验证未通过,错误的凭证");
			            return AjaxResult.error(500, "用户名或密码不正确");
			        } catch (LockedAccountException lae) {
			            logger.info("对用户[" + userName + "]进行登录验证..验证未通过,账户已锁定");
			            return AjaxResult.error(500,"账户已锁定");
			        } catch (ExcessiveAttemptsException eae) {
			            logger.info("对用户[" + userName + "]进行登录验证..验证未通过,错误次数过多");
			            return AjaxResult.error(500,"用户名或密码错误次数过多");
			        } catch (AuthenticationException ae) {
			            //通过处理Shiro的运行时AuthenticationException就可以控制用户登录失败或密码错误时的情景
			            logger.info("对用户[" + userName + "]进行登录验证..验证未通过,堆栈轨迹如下");
			            ae.printStackTrace();
			            return AjaxResult.error(500,"用户名或密码不正确");
			        }
			 }else {
				 if(StringUtils.isNotNull(ShiroUtils.getUser())) {
		         	 //跳转到 get请求的登陆方法
		    		 //view.setViewName("redirect:/"+prefix+"/index");
		     		 return  AjaxResult.success();
		     	 }else {
		     		 return  AjaxResult.error(500,"未知账户");
		     	 }
			 }
		 }else{
			return AjaxResult.error(500,"验证码不正确!");
		 }
		 
	}
	
	/**
	 * 退出登陆
	 * @return
	 */
	@ApiOperation(value="退出登陆",notes="退出登陆")
	@GetMapping("/Loginout")
	public String LoginOut(HttpServletRequest request, HttpServletResponse response){
		//在这里执行退出系统前需要清空的数据
		Subject subject = SecurityUtils.getSubject();
		 //注销
        subject.logout();
        return "redirect:/"+prefix+"/login";
	}
	
	
	
	
	/****页面测试****/
	@ApiOperation(value="404页面",notes="404页面")
	@GetMapping("Out404")
	public String Out404(HttpServletRequest request, HttpServletResponse response){
		
        return "redirect:/error/404";
	}
	
	@GetMapping("Out403")
	@ApiOperation(value="403页面",notes="403页面")
	public String Out403(HttpServletRequest request, HttpServletResponse response){
		
        return "redirect:/error/403";
	}
	
	@ApiOperation(value="500页面",notes="500页面")
	@GetMapping("Out500")
	public String Out500(HttpServletRequest request, HttpServletResponse response){
		
        return "redirect:/error/500";
	}
	
	/**
	 * 权限测试跳转页面
	 * @param request
	 * @param response
	 * @return
	 */
	@ApiOperation(value="权限测试跳转页面",notes="权限测试跳转页面")
	@GetMapping("Outqx")
	@RequiresPermissions("system:user:asd")
	public String Outqx(HttpServletRequest request, HttpServletResponse response){
		
        return "redirect:/error/500";
	}
	/****页面测试EDN****/
}
