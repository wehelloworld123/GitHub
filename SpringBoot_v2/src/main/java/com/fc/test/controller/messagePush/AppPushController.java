package com.fc.test.controller.messagePush;

import cn.hutool.json.JSONUtil;
import com.fc.test.model.custom.messagePush.AppPush;
import com.fc.test.model.custom.messagePush.PushMessage;
import com.gexin.rp.sdk.base.IPushResult;
import com.gexin.rp.sdk.base.impl.AppMessage;
import com.gexin.rp.sdk.base.impl.ListMessage;
import com.gexin.rp.sdk.base.impl.Target;
import com.gexin.rp.sdk.http.IGtPush;
import com.gexin.rp.sdk.template.NotificationTemplate;
import com.gexin.rp.sdk.template.style.Style0;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AppPushController {

    // STEP1：获取应用基本信息
    private static String appId = "";
    private static String appKey = "";
    private static String masterSecret = "";
    private static String url = "http://sdk.open.api.igexin.com/apiex.htm";

    public static void publicPush(String[] args) throws IOException {

        IGtPush push = new IGtPush(url, appKey, masterSecret);

        Style0 style = new Style0();
        // STEP2：设置推送标题、推送内容
        style.setTitle("请输入通知栏标题");
        style.setText("请输入通知栏内容");
        // 注释采用默认图标
        // style.setLogo("push.png");  // 设置推送图标
        // STEP3：设置响铃、震动等推送效果
        style.setRing(true);  // 设置响铃
        style.setVibrate(true);  // 设置震动

        // STEP4：选择通知模板
        NotificationTemplate template = new NotificationTemplate();
        template.setAppId(appId);
        template.setAppkey(appKey);
        template.setStyle(style);
        // 点击消息打开应用
        template.setTransmissionType(1);
        // 传递自定义消息
        template.setTransmissionContent("自定义消息，可以是json 字符串");


        // STEP5：定义"AppMessage"类型消息对象,设置推送消息有效期等推送参数
        List<String> appIds = new ArrayList<String>();
        appIds.add(appId);
        AppMessage message = new AppMessage();
        message.setData(template);
        message.setAppIdList(appIds);
        message.setOffline(true);
        message.setOfflineExpireTime(1000 * 600);  // 时间单位为毫秒

        // STEP6：执行推送
        IPushResult ret = push.pushMessageToApp(message);
        System.out.println(ret.getResponse().toString());
    }

    public void privatePush(PushMessage pushMessage, List<AppPush> appPushList) {
        IGtPush push = new IGtPush(url, appKey, masterSecret);

        Style0 style = new Style0();
        // STEP2：设置推送标题、推送内容
        style.setTitle(pushMessage.getTitle());
        style.setText(pushMessage.getContent());
//        style.setLogo("push.png"); // 设置推送图标
        // STEP3：设置响铃、震动等推送效果
        style.setRing(true);  // 设置响铃
        style.setVibrate(true);  // 设置震动
        // STEP4：选择通知模板
        NotificationTemplate template = new NotificationTemplate();
        template.setAppId(appId);
        template.setAppkey(appKey);
        template.setStyle(style);
        // 点击消息打开应用
        template.setTransmissionType(1);
        // 传递自定义消息
        template.setTransmissionContent(JSONUtil.toJsonStr(pushMessage));


        // STEP5：定义"AppMessage"类型消息对象,设置推送消息有效期等推送参数
        // 采用toList方案，定义ListMessage消息类型
//        List<String> appIds = new ArrayList<String>();
//        appIds.add(appId);
        ListMessage message = new ListMessage();
        message.setData(template);
//        message.setAppIdList(appIds);
        message.setOffline(true);
        message.setOfflineExpireTime(1000 * 600);  // 时间单位为毫秒

        String contentId = push.getContentId(message);
        // 获取推送目标
        List targets = new ArrayList();
        for (AppPush ap : appPushList) {
            Target target = new Target();
            target.setAppId(appId);
            target.setClientId(ap.getClientid());
            targets.add(target);
        }

        // STEP6：执行推送，不采用toApp方案，采用toList方案
//        IPushResult ret = push.pushMessageToApp(message);
        IPushResult ret = push.pushMessageToList(contentId, targets);
        System.out.println(ret.getResponse().toString());
    }
}
