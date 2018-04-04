package com.zhibo.springcloud.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoProviderApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(DemoProviderApplication.class, args);
        DemoConfig demoConfig = applicationContext.getBean(DemoConfig.class);
        System.out.println(demoConfig.getName());
        System.out.println(demoConfig.getAge());
    }
}
