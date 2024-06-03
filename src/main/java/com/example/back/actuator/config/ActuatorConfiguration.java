package com.example.back.actuator.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.actuate.web.exchanges.HttpExchangeRepository;
import org.springframework.boot.actuate.web.exchanges.InMemoryHttpExchangeRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ActuatorConfiguration {

    @Value("${spring.traces.limit}")
    private String limit;

    @Bean
    public HttpExchangeRepository httpTraceRepository()
    {
        InMemoryHttpExchangeRepository repository = new InMemoryHttpExchangeRepository();
        repository.setCapacity(Integer.parseInt(limit));
        return repository;
    }
}
