package com.fc.test.model.custom.messagePush;

import lombok.Data;

@Data
public class AppPush {
    private String appid;//appid
    private String appkey;//appkey
    private String clientid;//clientid
    private String userId;//账户
    private String userRole;//用户角色

    public AppPush(String appid, String appkey, String clientid, String userId, String userRole) {
        this.appid = appid;
        this.appkey = appkey;
        this.clientid = clientid;
        this.userId = userId;
        this.userRole = userRole;
    }

    public AppPush() {
        super();
    }
}
