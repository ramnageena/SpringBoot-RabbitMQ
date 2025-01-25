package com.rabbitmq.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.rabbitmq.dto.User;
import com.rabbitmq.producer.RabbitMQProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class RabbitMQController {

    @Autowired
    private RabbitMQProducer producer;



    @RequestMapping("/send")
    public String send(@RequestBody User user) throws JsonProcessingException {
        producer.sendMessage(user);
        return "Message sent to RabbitMQ....";
    }
}
