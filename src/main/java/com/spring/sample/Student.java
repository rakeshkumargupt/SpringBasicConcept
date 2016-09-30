package com.spring.sample;

import java.util.Map;

/**
 * Created by rakeshgupta on 9/5/16.
 */
public class Student {
    private int id;

    private String name;

    private String mobNo;

    private String add;

    private Map<Integer, String > map;

    public Map<Integer, String> getMap() {
        return map;
    }

    public void setMap(Map<Integer, String> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mobNo='" + mobNo + '\'' +
                ", add='" + add + '\'' +
                ", map=" + map +
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

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }
}
