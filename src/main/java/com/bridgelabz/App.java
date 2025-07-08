package com.bridgelabz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("beans.xml");
        Garage garage = (Garage) context.getBean("garage");
        for(Car car : garage.getCars())
        {
            car.start();
        }
    }
}
