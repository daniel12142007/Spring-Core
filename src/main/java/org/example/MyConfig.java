package org.example;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("org.example")
@PropertySource("classpath:daniel.properties")
public class MyConfig {
    @Bean
    @Scope("prototype")
    public User userBean() {
        return new User();
    }
}