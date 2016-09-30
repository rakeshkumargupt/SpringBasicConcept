package com.annotationExample;

import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

/**
 * Created by rakeshgupta on 9/6/16.
 */
public class Application {

    public static void main(String args[]) {

   AnnotationConfigWebApplicationContext acw =
           new AnnotationConfigWebApplicationContext();
   acw.register(Student.class);
   acw.register(Teacher.class);
   acw.refresh();

   Student student1 = (Student)acw.getBean("student123");

    }
}
