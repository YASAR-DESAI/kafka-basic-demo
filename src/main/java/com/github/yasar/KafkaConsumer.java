package com.github.yasar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    Logger log = LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics = "demo_topic", groupId = "demo_group")
    public void consume(String message){
            log.info("#Message from topic: "+message);
    }
}
