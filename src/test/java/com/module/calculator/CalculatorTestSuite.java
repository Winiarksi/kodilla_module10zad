package com.module.calculator;

import com.module.calculator.Calculator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.module.calculator");
        Calculator calculator = context.getBean(Calculator.class);
        calculator.add(5.0D, 51.0D);
        calculator.sub(5.0D, 51.0D);
        calculator.mull(5.0D, 51.0D);
        calculator.div(5.0D, 51.0D);
    }
}
