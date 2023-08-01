package com.example.kafkaproject.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "arbitrary-topic", groupId = "groupId")
    void listener(String data) {
        System.out.println("Listener received: " + data + ".");
    }
}
