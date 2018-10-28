package com.module.tasks;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class testMoichWypocin {

    @Test
    public void testShapesCircleClass(){
        // Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.module.tasks");
        // When
        Shape shape = context.getBean(Circle.class);
        String tekst = shape.getName();
        // Then
        System.out.println("First test: " + tekst);
    }

    @Test
    public void testShapesMethodClass(){
        // Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.module.tasks");

        // When
        Shape shape = (Shape)context.getBean("getShape");

        // Then
        System.out.println("Test nr 2: " + shape.getName());
    }


    @Test
    public void testChooseShapeMethodClass(){
        // Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.module.tasks");
        // When
        Shape shape = (Shape)context.getBean("getRandomShape");
        // Then
        System.out.println("Test nr 3: " + shape.getName());
    }
}
