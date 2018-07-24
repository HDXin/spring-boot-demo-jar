package com.atstudy.spring.boot.rabbit;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

@Controller
@RequestMapping("/mq")
public class RabbitmqController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private final static String QUEUE_NAME = "hello";

    @ResponseBody
    @GetMapping("/send")
    public String hello() throws IOException {
        logger.info(" ===>> mq send  ... ");

        ConnectionFactory factory = new ConnectionFactory();
        Connection connection = factory.newConnection("192.168.1.103", 15672);
        Channel channel = connection.createChannel();

        channel.queueDeclare(1, QUEUE_NAME, false);
        String message = "Hello World!";
        channel.basicPublish(1, "", QUEUE_NAME, null, message.getBytes());

        logger.info(" [x] Sent '{}'", message);

        return "mail";
    }

}
