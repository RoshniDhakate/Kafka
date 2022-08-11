package com.demo.example.controller;




import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.example.producer.KafkaProducer;

@RestController
@RequestMapping("/api/v1/kafka")
public class KafkaProducerController {

    private KafkaProducer kafkaProducer;

    public KafkaProducerController(KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @GetMapping("/publish")
    public ResponseEntity<String> publish(@RequestParam("message") String message,@RequestParam("topic") String topic){
        kafkaProducer.sendMessage(topic,message);
        return ResponseEntity.ok("Message sent to kafka topic");
    }
}
