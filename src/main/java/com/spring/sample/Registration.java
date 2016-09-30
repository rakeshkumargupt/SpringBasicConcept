package com.spring.sample;

import java.util.Date;

/**
 * Created by rakeshgupta on 9/5/16.
 */
public class Registration {

    private int regNo;

    private String regName;

    private java.util.Date regDate;
    public Registration(){ System.out.println("This is defualt consturtor");
    };

    public void printData(){
        System.out.println("This is by default method without parameter");
    }

    public Registration(int regNo, String regName, Date regDate) {
        this.regNo = regNo;
        this.regName = regName;
        this.regDate = regDate;
    }

    @Override
    public String toString() {
        return "Registration{" +
                "regNo=" + regNo +
                ", regName='" + regName + '\'' +
                ", regDate=" + regDate +
                '}';
    }

    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public String getRegName() {
        return regName;
    }

    public void setRegName(String regName) {
        this.regName = regName;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }
}
