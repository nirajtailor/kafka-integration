package com.nirajtailor.kafkaintegration.Resource;

import com.nirajtailor.kafkaintegration.Producer.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/publish")
public class MessageController {

    @Autowired
    private KafkaProducerService kafkaProducerService;

    @PostMapping(value = "/message")
    public ResponseEntity<Object> publish(@RequestBody Object message) {
        kafkaProducerService.sendMessage(message);
        return ResponseEntity.ok().body("message sent to kafka");
    }
}
