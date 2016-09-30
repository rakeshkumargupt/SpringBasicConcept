package com.spring.sample;

/**
 * Created by rakeshgupta on 9/6/16.
 */
public class AutowireHelper {

//    public AutowireHelper() {
//
//    }

    Registration registration;
    Employee employee;


    public Registration getRegistration() {
        return registration;
    }

    public void setRegistration(Registration registration) {
        this.registration = registration;
    }

    public void autowirePrintMethod(){
        registration.printData();
    }
}
