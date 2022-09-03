package com.alterra.queueloging.Services;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alterra.queueloging.config.MessagingConfig;

@Service
public class UserService {
    

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void send(String payload){
        rabbitTemplate.convertAndSend(MessagingConfig.EXCHANGE, MessagingConfig.ROUTING_KEY, payload);
    }
}
