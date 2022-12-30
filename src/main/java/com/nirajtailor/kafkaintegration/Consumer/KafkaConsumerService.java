package com.nirajtailor.kafkaintegration.Consumer;

import com.nirajtailor.kafkaintegration.Config.AppConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumerService.class);

    @KafkaListener(topics = "dev-FirstTopic", groupId = "group-id")
    public void consume(Object message){
        LOGGER.info("received message : {}", message);
    }
}

    /**
     * We can also use the @KafkaListener annotation at class level.
     * If we do so, we need to specify @KafkaHandler at the method level:
     */
