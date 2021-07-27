package com.example.springjdbc2.config;

import com.example.springjdbc2.Service.DummyService;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevConfig {

    @Value("${service.name}")
private String serviceName;


    @Bean
    public DummyService dummyService(){
        return new DummyService(serviceName);
    }

}
