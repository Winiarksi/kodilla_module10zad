package com.module.tasks;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Random;

@Configuration
public class FaktoryShape {

    @Bean
    public Shape getShape(){
        return new Circle();
    }

    @Bean
    public Shape getRandomShape(){
        Random random = new Random();
        int value = random.nextInt(2);
        if ( value == 0 ){
            return new Circle();
        } else if ( value == 1 ) {
            return new Square();
        } else {
            return null;
        }
    }

}
