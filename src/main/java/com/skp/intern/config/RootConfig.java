package com.skp.intern.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RootConfig {
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
