package com.example.freeapi;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.support.PersistenceAnnotationBeanPostProcessor;


@SpringBootApplication
public class FreeApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(FreeApiApplication.class, args);

    }

    // Add this method in one of your configuration classes
    @Bean
    public static PersistenceAnnotationBeanPostProcessor persistenceAnnotationBeanPostProcessor() {
        return new PersistenceAnnotationBeanPostProcessor();
    }







}
