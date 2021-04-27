package com.kevinten.senses.interfaces;

import com.kevinten.vrml.core.beans.SpringContextConfigurator;
import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

@SpringBootApplication(scanBasePackages = "com.kevinten.senses.*")
public class SensesApplication implements ApplicationContextAware {

    public static void main(String[] args) {
        SpringApplication.run(SensesApplication.class, args);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringContextConfigurator.setStaticApplicationContext(applicationContext);
    }
}
