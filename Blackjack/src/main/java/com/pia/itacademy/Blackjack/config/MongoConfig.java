package com.pia.itacademy.Blackjack.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(
        basePackages = "com.pia.itacademy.Blackjack.mongodb.repository"
)
public class MongoConfig {
    // Spring Boot configura automáticamente MongoTemplate y conexiones.
}

