package com.practice.gamma.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class RabbitConsumer {

    @RabbitListener(queues = {"FirstQueue"})
    public void listen(String message) {
        log.info(message);
    }

}
