package com.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by rakeshgupta on 9/13/16.
 */
public class Application {
  public static void main(String args[]){
      ApplicationContext applicationContext = new ClassPathXmlApplicationContext("collectionsdata.xml");

      College college = (College) applicationContext.getBean("collegeBean");
    System.out.print(college);
  }
}
