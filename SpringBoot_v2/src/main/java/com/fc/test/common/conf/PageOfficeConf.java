package com.fc.test.common.conf;

//import com.zhuozhengsoft.pageoffice.poserver.Server;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;



@ConfigurationProperties(prefix = "pageoffice")
public class PageOfficeConf {
    private static String posypath;

    private static String popassword;
/*    @Bean
    public ServletRegistrationBean servletRegistrationBean() {

        com.zhuozhengsoft.pageoffice.poserver.Server poserver = new com.zhuozhengsoft.pageoffice.poserver.Server();

        //设置PageOffice注册成功后,license.lic文件存放的目录
        poserver.setSysPath(posypath);
        ServletRegistrationBean srb = new ServletRegistrationBean(poserver);
        srb.addUrlMappings("/poserver.zz");
        srb.addUrlMappings("/posetup.exe");
        srb.addUrlMappings("/pageoffice.js");
        srb.addUrlMappings("/sealsetup.exe");
        return srb;//

    }*/


    /***
     * PageOffice 注册
     * @return
     */
  /*  @Bean
    public ServletRegistrationBean servletRegistrationBean() {
        Server poserver = new Server();
        //设置PageOffice注册成功后,license.lic文件存放的目录
        poserver.setSysPath(posypath);
        ServletRegistrationBean srb = new ServletRegistrationBean(poserver);
        // 下面是把资源文件暴露出来，必须配置，否则页面访问不了
        srb.addUrlMappings("/poserver.zz", "/posetup.exe", "/pageoffice.js", "/jquery.min.js", "/pobstyle.css", "/sealsetup.exe");
        return srb;
    }


    *//**

     * 添加印章管理程序Servlet（可选）

     * @return

     *//*

    @Bean

    public ServletRegistrationBean servletRegistrationBean2() {

        com.zhuozhengsoft.pageoffice.poserver.AdminSeal adminSeal = new com.zhuozhengsoft.pageoffice.poserver.AdminSeal();
        adminSeal.setAdminPassword(popassword);//设置印章管理员admin的登录密码
        //设置印章数据库文件poseal.db存放目录，该文件在当前demo的“集成文件”夹中
        adminSeal.setSysPath(posypath);
        ServletRegistrationBean srb = new ServletRegistrationBean(adminSeal);
        srb.addUrlMappings("/adminseal.zz");
        srb.addUrlMappings("/sealimage.zz");
        srb.addUrlMappings("/loginseal.zz");
        return srb;//

    }*/


    public static String getPosypath() {
        return posypath;
    }

    public static void setPosypath(String posypath) {
        PageOfficeConf.posypath = posypath;
    }

    public static String getPopassword() {
        return popassword;
    }

    public static void setPopassword(String popassword) {
        PageOfficeConf.popassword = popassword;
    }
}
