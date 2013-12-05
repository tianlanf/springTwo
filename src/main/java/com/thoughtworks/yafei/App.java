package com.thoughtworks.yafei;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args )
    {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContextSpringTwo.xml");

        SweetLover sweetLover = (SweetLover)context.getBean("sweetLover");
        String response = sweetLover.eat();
        System.out.println(response);
    }
}
