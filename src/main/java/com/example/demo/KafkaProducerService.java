package com.example.demo;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;

@Service
@Slf4j
public class KafkaProducerService {

    private final KafkaTemplate<String, String> kafkaTemplate;
    // private static final Logger logger = LoggerFactory.getLogger(KafkaProducerService.class); 

    public KafkaProducerService(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;

    }

    public void send(String msg) {
        kafkaTemplate.send("test-topic", msg);
        log.info("Sent topic msg: {}", msg);
    }
}