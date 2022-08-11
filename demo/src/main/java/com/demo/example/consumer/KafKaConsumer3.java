package com.demo.example.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafKaConsumer3 {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafKaConsumer3.class);

    @KafkaListener(topics = "testTopic3",
                    groupId = "group_id2")
    public void consume(String message){
        LOGGER.info(String.format("Message received -> %s", message));
    }
}
