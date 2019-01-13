package com.atstudy.spring.boot.configs.wechat;

/**
 * @author huangdexin @ harley
 * @email huangdexin@kuaicto.com
 * @date 2019/1/13 19:42
 */
public enum EnumCropAppType {

    BOOK("BOOK", "通讯录"),
    ;


    private String code;
    private String label;

    EnumCropAppType(String code, String label) {
        this.code = code;
        this.label = label;
    }
}
