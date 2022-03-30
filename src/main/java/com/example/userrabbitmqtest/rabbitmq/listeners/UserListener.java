package com.example.userrabbitmqtest.rabbitmq.listeners;

import lombok.extern.java.Log;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Log
@Component
@EnableRabbit
public class UserListener {
    @RabbitListener(queues = "queue1")
    public void processQueue1(String message) {
        log.info("received from queue 1: " + message);
    }
}
