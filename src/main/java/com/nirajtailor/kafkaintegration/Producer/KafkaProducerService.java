package com.nirajtailor.kafkaintegration.Producer;

import com.nirajtailor.kafkaintegration.Config.BusinessConstants;
import com.nirajtailor.kafkaintegration.Config.AppConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.JdkIdGenerator;

@Service
public class KafkaProducerService {
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaProducerService.class);

    @Autowired
    private KafkaTemplate kafkaTemplate;

    @Autowired
    private AppConfig appConfig;
    public void sendMessage(Object message) {
        LOGGER.info("sent message : {}", message);
//        Map<String, Object> header = new HashMap<>();
//        header.put("kafka_topic", "dev-FirstTopic");
//        Message gm = new GenericMessage(message,header);
        String topic = appConfig.getKafkaTopics().get(BusinessConstants.FIRST_TOPIC);
        kafkaTemplate.send("dev-FirstTopic", new JdkIdGenerator().generateId(), message);
    }
}
