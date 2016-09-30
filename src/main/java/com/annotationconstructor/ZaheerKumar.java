package com.annotationconstructor;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

/**
 * Created by rakeshgupta on 9/9/16.
 */

@Configuration
@ComponentScan(basePackages = "com.annotationconstructor")
public class ZaheerKumar {
    public static void main(String args[]){

        AnnotationConfigWebApplicationContext annotationConfigWebApplicationContext=
                new AnnotationConfigWebApplicationContext();
        annotationConfigWebApplicationContext.register(NehaKumari.class);
        annotationConfigWebApplicationContext.register(FaizaNoor.class);
        annotationConfigWebApplicationContext.refresh();

        NehaKumari nehaKumari = (NehaKumari) annotationConfigWebApplicationContext.getBean("nehaKumari123");
        System.out.println(nehaKumari.toString());

    }

}
