package com.namespaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by rakeshgupta on 9/13/16.
 */
public class Administrator {

    public static void main(String args[]){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("namespaces.xml");

        King king = applicationContext.getBean("kingBean", King.class);
        System.out.print(king);


    }

}
