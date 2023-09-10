package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example")
public class ProjectConfig {

//    @Bean
//    Parrot parrot() {
//        var p = new Parrot();
//        p.setName("Koko");
//        return p;
//    }

//    @Bean
//    String hello() {
//        return "Hello";
//    }

    @Bean
    int ten() {
        return 10;
    }
}
