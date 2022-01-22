package com.epam.spring.homework1;

import com.epam.spring.homework1.config.BeanConfig;
import com.epam.spring.homework1.pet.Pet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Homework1Application {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        Pet pet = context.getBean(Pet.class);
        pet.printPets();
    }

}
