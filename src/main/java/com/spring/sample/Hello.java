package com.spring.sample;

import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by rakeshgupta on 9/5/16.
 */
public class Hello {
    public  static void main(String argsp[]) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

//        Employee employee = (Employee) applicationContext.getBean("demo");
//        System.out.println(employee.getEmpName());
//        System.out.println(employee.getEmpAdd());
//        System.out.println(employee.getEmpId());
//        System.out.println(employee.getMobNo());
//
//
//        Employee employee1 = (Employee) applicationContext.getBean("insertData");
//
//        System.out.println(employee1.toString());
//
//        EmployeeData employeeData = (EmployeeData) applicationContext.getBean("empData");
//
//        System.out.println(employeeData.toString());


//        CollegeData collegeData = (CollegeData) applicationContext.getBean("collegeData");
//
//        System.out.println(collegeData);

//            Student student = (Student) applicationContext.getBean("studentData");
//            System.out.println(student.toString());
//
//        Registration registration = (Registration)applicationContext.getBean("registrationData");
//
//        System.out.println(registration)

        AutowireHelper autowireHelper = (AutowireHelper) applicationContext.getBean("autowire");
        autowireHelper.autowirePrintMethod();

    }
}
