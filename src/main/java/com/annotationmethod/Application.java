package com.annotationmethod;

import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

/**
 * Created by rakeshgupta on 9/8/16.
 */
public class Application {
     public static void main(String args[]){
 AnnotationConfigWebApplicationContext acw = new AnnotationConfigWebApplicationContext();
 acw.register(Friend.class);
 acw.register(Test.class);
 acw.refresh();

     Friend ff = (Friend) acw.getBean("friend123");
    //    System.out.println(ff.toString());
     }
}
