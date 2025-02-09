package com.example.Order.KafkaConfig;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;


@Configuration
public class OrderKafka {

    @Bean
    public NewTopic getTopic()
    {
        return TopicBuilder.name("OrderService")
                .build();
    }

}
