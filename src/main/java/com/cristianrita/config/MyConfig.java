package com.cristianrita.config;

import com.cristianrita.services.EmailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean(name = "myEmailServiceBean", initMethod = "initializeEmailService")
    public EmailService emailService() {
        return new EmailService();
    }
}
