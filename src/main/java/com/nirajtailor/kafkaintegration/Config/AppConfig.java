package com.nirajtailor.kafkaintegration.Config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
@ConfigurationProperties(prefix = "app.config")
@EnableConfigurationProperties
public class AppConfig {
    public Map<String, String> getKafkaTopics() {
        return kafkaTopics;
    }

    public void setKafkaTopics(Map<String, String> kafkaTopics) {
        this.kafkaTopics = kafkaTopics;
    }

    private Map<String, String> kafkaTopics;
}
