package com.atstudy.spring.boot.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: hdxin
 * Date: 2018-04-30
 * Time: 19:00
 */
public class HelloApplicationContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {

    private Logger logger = LoggerFactory.getLogger(HelloApplicationContextInitializer.class);

    @Override
    public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
        logger.info(" ===>> HelloApplicationContextInitializer.initialize() ... ");
    }
}
