package com.annotationmethod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfig;

/**
 * Created by rakeshgupta on 9/7/16.
 */
@Configuration
@ComponentScan(basePackages = {"com.annotationmethod"})
public class Test {

    @Autowired
    public Friend friend123;

    private int testId;

    private String name;

    public Test(Friend friend12) {
        System.out.println(friend12.getId());
        System.out.println(friend12.getName());
        System.out.println(friend12.getIsAlcohalic());
    }

    @Override
    public String toString() {
        return "Test{" +
                "testId=" + testId +
                ", name='" + name + '\'' +
                '}';
    }

    public int getTestId() {
        return testId;
    }

    public void setTestId(int testId) {
        this.testId = testId;

    }

    @Bean
    public Test setFriend123(){
        System.out.println("Before setterField method");
        Test test = new Test(friend123());
//        System.out.println(friend123.getId());
//        System.out.println(friend123.getName());
//        System.out.println(friend123.getIsAlcohalic());
        System.out.println("After setterField method");
        return test;
    }

    @Bean
    public Friend friend123(){

        Friend friend = new Friend();
        System.out.println("Before Bean method");
        friend.setId(1);
        friend.setName("MMMM");
        friend.setIsAlcohalic("true");
        System.out.println("After Bean method");
        return friend;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
