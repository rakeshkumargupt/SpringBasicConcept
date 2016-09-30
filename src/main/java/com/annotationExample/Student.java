package com.annotationExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by rakeshgupta on 9/6/16.
 */

@Configuration
 @ComponentScan(basePackageClasses = {Teacher.class})
public class Student {

    private int id;

    private String name;

    private String mobNo;


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mobNo='" + mobNo + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }

    @Bean
    public Student student123(){

        Student student1 = new Student();
        student1.setName("BBBB");
        student1.setId(12);
        student1.setMobNo("9387483");
        System.out.println("From bean method");
        return student1;
    }


}
