package com.demo.example.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafKaConsumer4 {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafKaConsumer4.class);

    @KafkaListener(topics = "testTopic1",
                    groupId = "group_id1")
    public void consume(String message){
        LOGGER.info(String.format("Message received -> %s", message));
    }
}
