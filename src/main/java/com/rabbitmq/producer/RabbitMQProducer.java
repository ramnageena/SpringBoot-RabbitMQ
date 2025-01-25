package com.rabbitmq.producer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rabbitmq.dto.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class RabbitMQProducer {

    @Value("${rabbitmq.exchange.name}")
    private String exchangeName;
    @Value("${rabbitmq.routing.key}")
    private String routingKey;

    @Autowired
    RabbitTemplate rabbitTemplate;
    public void sendMessage(User user) throws JsonProcessingException {
        String message = new ObjectMapper().writeValueAsString(user); //ObjectMapper
        log.info("Sending message: {}", message);
        rabbitTemplate.convertAndSend(exchangeName, routingKey, message);
    }

}
