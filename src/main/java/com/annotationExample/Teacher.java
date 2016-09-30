package com.annotationExample;

import com.spring.sample.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by rakeshgupta on 9/6/16.
 */

@Component
public class Teacher {


    private Student student;

    public Student getStudent() {
        return student;
    }



    @Autowired
    public Teacher(Student student123) {
        System.out.println(student123.getId());
        System.out.println(student123.getName());
        System.out.println(student123.getMobNo());
    }

    @Autowired
    public void setStudent(Student student) {
        this.student = student;
        System.out.println("From Autowired method");
    }

    @Autowired
    public void myData(Student student){
        System.out.println("From myData method");
    }
}
