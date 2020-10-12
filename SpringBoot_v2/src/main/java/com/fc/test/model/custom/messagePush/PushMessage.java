package com.fc.test.model.custom.messagePush;

import lombok.Data;

@Data
public class PushMessage {
    private String title;
    private String content;
    // 用户角色
    private String userRole;

    public PushMessage(String title, String content, String userRole) {
        this.title = title;
        this.content = content;
        this.userRole = userRole;
    }

    public PushMessage() {
        super();
    }
}
