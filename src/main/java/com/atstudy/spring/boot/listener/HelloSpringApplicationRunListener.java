package com.atstudy.spring.boot.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: hdxin
 * Date: 2018-04-30
 * Time: 21:52
 */
public class HelloSpringApplicationRunListener implements SpringApplicationRunListener {
    private Logger logger = LoggerFactory.getLogger(HelloSpringApplicationRunListener.class);

    @Override
    public void starting() {
        logger.info(" ===>> HelloSpringApplicationRunListener.starting() ... ");
    }

    @Override
    public void environmentPrepared(ConfigurableEnvironment environment) {
        logger.info(" ===>> HelloSpringApplicationRunListener.environmentPrepared() ... ");
    }

    @Override
    public void contextPrepared(ConfigurableApplicationContext context) {
        logger.info(" ===>> HelloSpringApplicationRunListener.contextPrepared() ... ");
    }

    @Override
    public void contextLoaded(ConfigurableApplicationContext context) {
        logger.info(" ===>> HelloSpringApplicationRunListener.contextLoaded() ... ");
    }

    @Override
    public void started(ConfigurableApplicationContext context) {
        logger.info(" ===>> HelloSpringApplicationRunListener.started() ... ");
    }

    @Override
    public void running(ConfigurableApplicationContext context) {
        logger.info(" ===>> HelloSpringApplicationRunListener.running() ... ");
    }

    @Override
    public void failed(ConfigurableApplicationContext context, Throwable exception) {
        logger.info(" ===>> HelloSpringApplicationRunListener.contextPrepared() ... ");
    }
}
