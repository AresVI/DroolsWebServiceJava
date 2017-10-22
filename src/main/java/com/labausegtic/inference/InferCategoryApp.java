package com.labausegtic.inference;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * The main class, which Spring Boot uses to bootstrap the application.
 *
 * 
 */
@SpringBootApplication
public class InferCategoryApp {

    public static void main(String[] args) {

        System.getProperties().put("server.port", 8181);

        SpringApplication.run(InferCategoryApp.class, args);

    }

    @Bean
    public KieContainer kieContainer() {
        return KieServices.Factory.get().getKieClasspathContainer();
    }

}
