package com.github.yasar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

    @Autowired
    KafkaTemplate kafkaTemplate;
    String Topic_name = "demo_topic";


    public void sendData(String Message){
        kafkaTemplate.send(Topic_name, Message);
    }

}
