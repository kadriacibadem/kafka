package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class Kafka {
    private final KafkaTemplate kafkaTemplate;


    public void sendMessage(String msg) {
        kafkaTemplate.send("test", new User(1,"kadri","kadri","password"));
    }

}
