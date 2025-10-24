package com.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args ) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Dev obj = (Dev) context.getBean("dev"); // more better for spring this will search forb ean name dev in xml
       // int age=obj.getAge(20); instead we let spring do it via spring.xml
       // System.out.println(obj.getAge());

        obj.build();
    }
}
