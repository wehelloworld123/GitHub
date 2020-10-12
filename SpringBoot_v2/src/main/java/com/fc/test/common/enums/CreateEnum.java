package com.fc.test.common.enums;

import java.io.Serializable;

public enum CreateEnum implements Serializable {
    PHOTO("01"), INK("02"), OIL("03"), GOUACHE("04"), LANDSCAPE("05"), SKETCH("06"),
    POEM("001"), BRAND("002"),INCLUDED("00");//自由创作
    private final String value;

    CreateEnum(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
   public static CreateEnum valueof(String value) {
        switch (value) {
            case "00":
                return CreateEnum.INCLUDED;
            case "01":
                return CreateEnum.PHOTO;
            case "02":
                return CreateEnum.INK;
            case "03":
                return CreateEnum.OIL;
            case "04":
                return CreateEnum.GOUACHE;
            case "05":
                return CreateEnum.LANDSCAPE;
            case "06":
                return CreateEnum.SKETCH;
            case "001":
                return CreateEnum.POEM;
            case "002":
                return CreateEnum.BRAND;
            default:
                return null;
        }
    }

    public static String valueOfName(String value) {
        switch (value) {
            case "00":
                return "自由创作";
            case "01":
                return "摄影";
            case "02":
                return "水墨";
            case "03":
                return "油墨";
            case "04":
                return "水粉";
            case "05":
                return "山水";
            case "06":
                return "素描";
            case "001":
                return "诗";
            case "002":
                return "词";
            default:
                return null;
        }
    }
}
