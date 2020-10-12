package com.fc.test.common.enums;

import java.io.Serializable;

public enum CreateKind implements Serializable {
    HISTORY(1),
    LITERATURE(2),
    THINKING(3),
    GAME(4),
    ROMANTIC(5),
    PSYCHOLOGY(6),
    INCLUDED(0);//自由创作
    private final int value;

    CreateKind(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
    public static CreateKind valueOf(int value) {
        switch (value) {
            case 0:
                return CreateKind.INCLUDED;
            case 1:
                return CreateKind.HISTORY;
            case 2:
                return CreateKind.LITERATURE;
            case 3:
                return CreateKind.THINKING;
            case 4:
                return CreateKind.GAME;
            case 5:
                return CreateKind.ROMANTIC;
            case 6:
                return CreateKind.PSYCHOLOGY;
            default:
                return null;
        }
    }
    public static String valueOfName(int value) {
        switch (value) {
            case 0:
                return "自由创作";
            case 1:
                return "历史";
            case 2:
                return "文学";
            case 3:
                return "思想";
            case 4:
                return "游戏";
            case 5:
                return "游戏";
            case 6:
                return "心理";
            default:
                return null;
        }
    }
}
