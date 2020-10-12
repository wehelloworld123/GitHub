package com.fc.test.controller.messagePush;

import com.fc.test.common.base.BaseController;
import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.messaging.simp.SimpMessageType;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Api(value = "文学创作内容")
@Controller
@RequestMapping("/CheckCenterController")
public class CheckCenterController  extends BaseController {
    /**
     * session操作类

     @Autowired
     SocketSessionRegistry webAgentSessionRegistry;	 */
    /**
     * 消息发送工具
     */
/*    @Autowired
    private SimpMessagingTemplate template;

    @RequestMapping(value = "/index")
    public String index() {
        template.convertAndSendToUser("userId", "/topic/greetings", "我的消息");
        return "/index";
    }

    *//**
     * 用户广播
     * 发送消息广播  用于内部发送使用
     *
     * @param request
     * @return
     *//*
    @MessageMapping("/change-notice1")
    public void greeting1(String value) {
        this.template.convertAndSend("/topic/notice", value);
    }
    @MessageMapping("/change-notice")
    @SendTo("/topic/notice")
    public String greeting(String value) {
        return value;
    }


    *//**
     * 同样的发送消息   只不过是ws版本  http请求不能访问
     *
     * @param message
     * @return
     * @throws Exception
     *//*
    @MessageMapping("/msg/hellosingle")
    public void greeting2(String userId) throws Exception {
        //这里没做校验
        template.convertAndSendToUser(userId, "/topic/greetings", "我的消息");
    }*/

}
