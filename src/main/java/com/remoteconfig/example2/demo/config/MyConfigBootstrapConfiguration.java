package com.remoteconfig.example2.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigBootstrapConfiguration {

    @Bean
    public MyPropertySourceLocator myPropertySourceLocator(){
        return new MyPropertySourceLocator();
    }
}