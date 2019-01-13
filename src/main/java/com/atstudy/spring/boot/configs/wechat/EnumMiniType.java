package com.atstudy.spring.boot.configs.wechat;

/**
 * @author huangdexin @ harley
 * @email huangdexin@kuaicto.com
 * @date 2019/1/13 19:01
 */
public enum EnumMiniType {

    PLATFORM("PLATFORM", "平台小程序"),
    MINI_B("MINI_B", "B端小程序"),
    MINI_C("MINI_C", "C端小程序"),

    ;
    private String code;
    private String label;

    EnumMiniType(String code, String label) {
        this.code = code;
        this.label = label;
    }
}
