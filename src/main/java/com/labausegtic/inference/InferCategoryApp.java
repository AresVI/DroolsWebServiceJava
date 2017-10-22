package com.labausegtic.inference;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * The main class, which Spring Boot uses to bootstrap the application.
 *
 * 
 */
@SpringBootApplication
public class InferCategoryApp {

    private static Logger log = LoggerFactory.getLogger(InferCategoryApp.class);

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(InferCategoryApp.class, args);

        System.getProperties().put("server.port", 8080);

    }

    @Bean
    public KieContainer kieContainer() {
        return KieServices.Factory.get().getKieClasspathContainer();
    }

}
