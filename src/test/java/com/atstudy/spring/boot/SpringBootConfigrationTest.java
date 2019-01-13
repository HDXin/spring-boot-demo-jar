package com.atstudy.spring.boot;

import com.alibaba.fastjson.JSONObject;
import com.atstudy.spring.boot.configs.wechat.EnumMiniType;
import com.atstudy.spring.boot.configs.wechat.MiniConfig;
import com.atstudy.spring.boot.configs.wechat.WxConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author huangdexin @ harley
 * @email huangdexin@kuaicto.com
 * @date 2019/1/13 19:21
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootConfigrationTest {

    @Autowired
    private WxConfig wechatConfig;

    @Test
    public void testWechatConfig(){
        MiniConfig miniConfig =  wechatConfig.getMini().get(EnumMiniType.MINI_B);

        System.out.println(" wechatConfig: " + JSONObject.toJSONString(wechatConfig));
    }

}
