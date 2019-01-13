package com.atstudy.spring.boot.configs.wechat;

import java.util.HashMap;
import java.util.Map;

/**
 * @author huangdexin @ harley
 * @email huangdexin@kuaicto.com
 * @date 2019/1/13 19:38
 */
public class CropConfig {

    private String cropid;

    private Map<EnumCropAppType, CropApp> apps = new HashMap<>();

    public String getCropid() {
        return cropid;
    }

    public void setCropid(String cropid) {
        this.cropid = cropid;
    }

    public Map<EnumCropAppType, CropApp> getApps() {
        return apps;
    }

    public void setApps(Map<EnumCropAppType, CropApp> apps) {
        this.apps = apps;
    }
}
