package com.fc.test.common.enums;

public enum RoleEnum {
    SEARCH("开发"),
    BUSINESS("业务"),
    DEVOPS("运维"),
    SUPERADMIN("超级管理员"),
    ADMIN("管理员"),
    USER("用户");

    private final String value;

    RoleEnum(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
    public static RoleEnum value(String value) {
        switch (value) {
            case "开发":
                return RoleEnum.SEARCH;
            case "业务":
                return RoleEnum.BUSINESS;
            case "运维":
                return RoleEnum.DEVOPS;
            case "超级管理员":
                return RoleEnum.SUPERADMIN;
            case "管理员":
                return RoleEnum.ADMIN;
            case "用户":
                return RoleEnum.USER;
            default:
                return null;
        }
    }
}
