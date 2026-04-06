package com.example.demo;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

import java.util.logging.Logger;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.kafka.support.KafkaHeaders;

@Service
@Slf4j
public class KafkaConsumerService {

    @KafkaListener(topics = "test-topic", groupId = "test-group")
    public void consume(String message,
                        @Header(KafkaHeaders.OFFSET) long offset,
                        @Header(KafkaHeaders.RECEIVED_PARTITION) int partition) {

        log.info("Received msg: {}", message +
                " | offset= {}", offset +
                " | partition= {}", partition);
    }
}