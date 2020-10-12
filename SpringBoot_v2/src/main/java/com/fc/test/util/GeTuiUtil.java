package com.fc.test.util;

import cn.hutool.json.JSONUtil;
import com.fc.test.model.auto.UserClient;
import com.fc.test.model.custom.messagePush.AppPush;
import com.fc.test.model.custom.messagePush.PushMessage;
import com.gexin.fastjson.JSONObject;
import com.gexin.rp.sdk.base.IPushResult;
import com.gexin.rp.sdk.base.impl.AppMessage;
import com.gexin.rp.sdk.base.impl.ListMessage;
import com.gexin.rp.sdk.base.impl.SingleMessage;
import com.gexin.rp.sdk.base.impl.Target;
import com.gexin.rp.sdk.base.payload.APNPayload;
import com.gexin.rp.sdk.exceptions.RequestException;
import com.gexin.rp.sdk.http.IGtPush;
import com.gexin.rp.sdk.template.NotificationTemplate;
import com.gexin.rp.sdk.template.TransmissionTemplate;
import com.gexin.rp.sdk.template.style.Style0;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@ConfigurationProperties(prefix = "getui")
public class GeTuiUtil {
    private static Logger logger = LoggerFactory.getLogger(GeTuiUtil.class);
    //定义常量, appId、appKey、masterSecret 采用本文档 "第二步 获取访问凭证 "中获得的应用配置
    private static String appId;
    private static String appKey;
    private static String masterSecret;
    private static String url;
	//(具体appId、appKey、masterSecret，在个推官网 )

    /**
     * 单个用户android推送
     *
     * @param pushMessage
     * @param appPushList
     * @return
     * @author lxp
     * @date 2019 -09-18 09:25:51
     */
    public static boolean sendMessageAndroid(PushMessage pushMessage, List<UserClient> appPushList) {
        IGtPush push = new IGtPush(appKey, masterSecret);
        TransmissionTemplate template = new TransmissionTemplate();
        template.setAppId(appId);
        template.setAppkey(appKey);
        template.setTransmissionType(2);
        template.setTransmissionContent(pushMessage.getContent());

        // STEP2：设置通知样式
        //Style0 style = new Style0();
        // 设置通知栏标题与内容
        //style.setTitle("系统消息");
        //style.setText(msg);
        // 设置
        //template.setStyle(style);

/*
        SingleMessage message = new SingleMessage();
        message.setOffline(true);
        // 离线有效时间，单位为毫秒，可选
        message.setOfflineExpireTime(24 * 3600 * 1000);
        message.setData(template);
        // 可选，1为wifi，0为不限制网络环境。根据手机处于的网络情况，决定是否下发
        message.setPushNetWorkType(0);*/

        ListMessage message = new ListMessage();
        message.setData(template);
//        message.setAppIdList(appIds);
        message.setOffline(true);
        // 可选，1为wifi，0为不限制网络环境。根据手机处于的网络情况，决定是否下发
        message.setPushNetWorkType(0);
        message.setOfflineExpireTime(1000 * 600);  // 时间单位为毫秒

        String contentId = push.getContentId(message);
        List<Target> targets = new ArrayList<>();
        if(appPushList!=null&&appPushList.size()>0) {
            for(UserClient userClient : appPushList) {
                Target target = new Target();
                target.setAppId(userClient.getAppid());
                target.setClientId(userClient.getClientid());
                targets.add(target);
            }
        }
        IPushResult ret = null;
        try {
            ret = push.pushMessageToList(contentId, targets);
        } catch (RequestException e) {
            e.printStackTrace();
            ret = push.pushMessageToList(contentId, targets);
        }
        if (ret != null && ret.getResponse() != null && ret.getResponse().containsKey("result")) {
            logger.info(ret.getResponse().toString());
            if(ret.getResponse().get("result").toString().equals("ok") && ret.getResponse().containsKey("status")){
                return true;
            }
        }
        return false;
    }

    /**
     * 单个用户ios推送
     *
     * @param
     * @return
     */
    public static String sendMessageIos(PushMessage pushMessage, List<UserClient> appPushList) {
        IGtPush push = new IGtPush(appKey, masterSecret);

        TransmissionTemplate template = new TransmissionTemplate();
        template.setAppId(appId);
        template.setAppkey(appKey);
        template.setTransmissionContent(pushMessage.getContent());
        // 透传消息设置，1为强制启动应用，客户端接收到消息后就会立即启动应用；2为等待应用启动
        template.setTransmissionType(2);
        //设置ios
        template.setAPNInfo(getAPNPayload(pushMessage.getContent()));

        /*SingleMessage message = new SingleMessage();
        message.setData(template);
        message.setOffline(true);
        //离线有效时间，单位为毫秒，可选
        message.setOfflineExpireTime(24 * 1000 * 3600);
        // 可选，1为wifi，0为不限制网络环境。根据手机处于的网络情况，决定是否下发
        message.setPushNetWorkType(0);*/

        ListMessage message = new ListMessage();
        message.setData(template);
//        message.setAppIdList(appIds);
        message.setOffline(true);
        // 可选，1为wifi，0为不限制网络环境。根据手机处于的网络情况，决定是否下发
        message.setPushNetWorkType(0);
        message.setOfflineExpireTime(1000 * 600);  // 时间单位为毫秒

        String contentId = push.getContentId(message);
        List<Target> targets = new ArrayList<>();
        if(appPushList!=null&&appPushList.size()>0) {
            for(UserClient userClient : appPushList) {
                Target target = new Target();
                target.setAppId(userClient.getAppid());
                target.setClientId(userClient.getClientid());
                targets.add(target);
            }
        }
        IPushResult ret = null;
        try {
            ret = push.pushMessageToList(contentId, targets);
        } catch (RequestException e) {
            e.printStackTrace();
            ret = push.pushMessageToList(contentId, targets);
        }
        if (ret != null) {
            return ret.getResponse().toString();
        } else {
            logger.error("【IOS】个推，服务器异常");
            return "";
        }
    }

    private static APNPayload getAPNPayload(String msg) {
        //封装透传内容
        Map<String, Object> map= (Map<String, Object>) JSONObject.parse(msg);

        APNPayload payload = new APNPayload();
        //在已有数字基础上加1显示，设置为-1时，在已有数字上减1显示，设置为数字时，显示指定数字(设置角标)
        payload.setAutoBadge(String.valueOf(map.get("count")));
        payload.setContentAvailable(1);

        //简单模式APNPayload.SimpleMsg
        //payload.setAlertMsg(new APNPayload.SimpleAlertMsg(msg));
        //字典模式使用下者
        String body = (String) map.get("message");
        payload.setAlertMsg(getDictionaryAlertMsg(body));
        //添加附加信息
        payload.addCustomMsg("message",msg);
        return payload;
    }

    private static APNPayload.DictionaryAlertMsg getDictionaryAlertMsg(String body) {
        APNPayload.DictionaryAlertMsg alertMsg = new APNPayload.DictionaryAlertMsg();
        // iOS8.2以上版本支持
        alertMsg.setTitle("系统消息");

        alertMsg.setBody(body);
        return alertMsg;
    }
    public static void publicPush(PushMessage pushMessage) throws IOException {

        IGtPush push = new IGtPush(url, appKey, masterSecret);

        Style0 style = new Style0();
        // STEP2：设置推送标题、推送内容
        style.setTitle(pushMessage.getTitle());
        style.setText(pushMessage.getContent());
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

   /* public void privatePush(PushMessage pushMessage, List<AppPush> appPushList) {
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
    }*/


    public static Logger getLogger() {
        return logger;
    }

    public static void setLogger(Logger logger) {
        GeTuiUtil.logger = logger;
    }

    public static String getAppId() {
        return appId;
    }

    public static void setAppId(String appId) {
        GeTuiUtil.appId = appId;
    }

    public static String getAppKey() {
        return appKey;
    }

    public static void setAppKey(String appKey) {
        GeTuiUtil.appKey = appKey;
    }

    public static String getMasterSecret() {
        return masterSecret;
    }

    public static void setMasterSecret(String masterSecret) {
        GeTuiUtil.masterSecret = masterSecret;
    }

    public static String getUrl() {
        return url;
    }

    public static void setUrl(String url) {
        GeTuiUtil.url = url;
    }
}
