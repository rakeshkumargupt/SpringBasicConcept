package com.collections;

import java.util.Map;

/**
 * Created by rakeshgupta on 9/13/16.
 */
public class Pooja {
    private int id;

    private String name;

    private int mobNo;

    private Map<String,Rani> mapRani;

    public Pooja(int id, String name, int mobNo, Map<String, Rani> mapRani) {
        this.id = id;
        this.name = name;
        this.mobNo = mobNo;
        this.mapRani = mapRani;
    }

    @Override
    public String toString() {
        return "Pooja{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mobNo=" + mobNo +
                ", mapRani=" + mapRani +
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

    public int getMobNo() {
        return mobNo;
    }

    public void setMobNo(int mobNo) {
        this.mobNo = mobNo;
    }
}
