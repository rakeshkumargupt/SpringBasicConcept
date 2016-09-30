package com.annotationconstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * Created by rakeshgupta on 9/9/16.
 */
@Component
public class FaizaNoor {

    private int mobNo;

    private String company;

    private String collegeous;


    @Autowired
    private NehaKumari nehaKumari;

    @Autowired
    public FaizaNoor(NehaKumari nehaKumari) {

        System.out.println("SAHI HAI JI....");

        this.nehaKumari = nehaKumari;

        System.out.println(nehaKumari.getId());
        System.out.println(nehaKumari.getName());
        System.out.println(nehaKumari.getBoyFriend());
        System.out.println(nehaKumari.getCompany());
        System.out.println("Sure sahi hai.");
    }

    @Override
    public String toString() {
        return "FaizaNoor{" +
                "mobNo=" + mobNo +
                ", company='" + company + '\'' +
                ", collegeous='" + collegeous + '\'' +
                '}';
    }

    public int getMobNo() {
        return mobNo;
    }

    public void setMobNo(int mobNo) {
        this.mobNo = mobNo;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCollegeous() {
        return collegeous;
    }

    public void setCollegeous(String collegeous) {
        this.collegeous = collegeous;
    }

}
