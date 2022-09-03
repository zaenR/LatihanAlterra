package com.alterra.queueloging.Services;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.alterra.queueloging.config.MessagingConfig;

@Component
public class ConsumerService {
    
    @RabbitListener(queues = MessagingConfig.QUEUE)
    public void receive(@Payload String message){
        System.out.println("Message received from publisher " +message);
    }
}
