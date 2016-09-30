package com.annotationconstructor;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * Created by rakeshgupta on 9/9/16.
 */

@Component
public class NehaKumari {

    private int id = 1;

    private String name = "AAA";

    private String company = " VitalLabs ";

    private String boyFriend = "BBB";

    @Override
    public String toString() {
        return "NehaKumari{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", boyFriend='" + boyFriend + '\'' +
                '}';
    }

    @Bean
    public NehaKumari nehaKumari123(){
        NehaKumari nehaKumari = new NehaKumari();
        nehaKumari.setId(2);
        nehaKumari.setName("NEHA");
        nehaKumari.setCompany("ACCENTURE");
        nehaKumari.setBoyFriend("ZAHEER");
        return nehaKumari;
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

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getBoyFriend() {
        return boyFriend;
    }

    public void setBoyFriend(String boyFriend) {
        this.boyFriend = boyFriend;
    }
}
