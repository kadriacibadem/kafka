package com.example.demo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Receive {

    @KafkaListener(topics = "test", groupId = "receive-group")
    public void receiveMessage(User user) {
        System.out.println("Received Message in group foo: " + user);
    }
}
