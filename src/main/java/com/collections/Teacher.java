package com.collections;

import java.util.Arrays;
import java.util.List;

/**
 * Created by rakeshgupta on 9/13/16.
 */
public class Teacher {
    private int id;

    private String name;

    private String address;

    private String[] mobNo;

    private Object[] objects;

    private List<Object> list;

    public Teacher(int id, String name, String address, String[] mobNo, Object[] objects, List<Object> list) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.mobNo = mobNo;
        this.objects = objects;
        this.list = list;
    }

    public String[] getMobNo() {
        return mobNo;
    }

    public void setMobNo(String[] mobNo) {
        this.mobNo = mobNo;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", mobNo=" + Arrays.toString(mobNo) +
                ", objects=" + Arrays.toString(objects) + "\n" +
                ", list=" + list + "\n" +
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
