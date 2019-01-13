package com.atstudy.spring.boot.configs.wechat;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import java.util.HashMap;
import java.util.Map;

/**
 * @author huangdexin @ harley
 * @email huangdexin@kuaicto.com
 * @date 2019/1/13 19:14
 */
@Component
@ConfigurationProperties(prefix = "wechat")
public class WxConfig {

    private Map<EnumMiniType, MiniConfig> mini = new HashMap<>();

    private CropConfig crop;

    public Map<EnumMiniType, MiniConfig> getMini() {
        return mini;
    }

    public void setMini(Map<EnumMiniType, MiniConfig> mini) {
        this.mini = mini;
    }

    public CropConfig getCrop() {
        return crop;
    }

    public void setCrop(CropConfig crop) {
        this.crop = crop;
    }
}
