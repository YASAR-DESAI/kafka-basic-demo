package com.github.yasar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class KafkaController {

    Logger log = LoggerFactory.getLogger(KafkaController.class);

    @Autowired
    KafkaProducer kafkaProducer;

    @GetMapping
    public void sendData(@RequestParam("message") String message){

        log.info("Sending Data");
        kafkaProducer.sendData(message);
        log.info("Data Sent.");
    }
}
