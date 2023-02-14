package com.cristianrita;

import com.cristianrita.config.MyConfig;
import com.cristianrita.services.EmailService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
        EmailService emailService = (EmailService) applicationContext.getBean("myEmailServiceBean");
        emailService.send("test@email.com", "Hello World");
    }
}
