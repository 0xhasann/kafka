package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {

    private final KafkaProducerService producer;

    public Runner(KafkaProducerService producer) {
        this.producer = producer;
    } 

    @Override
    public void run(String... args) {
        for (int i = 0; i < 5; i++) {
            producer.send("msg-" + i);
        }
    }
}