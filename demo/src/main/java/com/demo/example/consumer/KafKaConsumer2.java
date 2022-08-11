package com.demo.example.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafKaConsumer2 {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafKaConsumer2.class);

    @KafkaListener(topics = "testTopic2",
                    groupId = "group_id1")
    public void consume(String message){
        LOGGER.info(String.format("Message received -> %s", message));
    }
}
