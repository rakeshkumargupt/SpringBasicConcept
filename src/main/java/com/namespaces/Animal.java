package com.namespaces;

import java.util.Arrays;

/**
 * Created by rakeshgupta on 9/13/16.
 */
public class Animal {

    private int name;

    private String kFieldName;

    private String weight;

    private Object[] objects;

    public Object[] getObjects() {
        return objects;
    }

    public void setObjects(Object[] objects) {
        this.objects = objects;
    }

    public Animal(int name, String kFieldName, String weight, Object[] objects) {
        this.name = name;
        this.kFieldName = kFieldName;
        this.weight = weight;
        this.objects = objects;
    }

    public Animal() {
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name=" + name +
                ", kFieldName='" + kFieldName + '\'' +
                ", weight='" + weight + '\'' +
                ", objects=" + Arrays.toString(objects) +
                '}';
    }

    public Animal(int name, String kFieldName, String weight) {
        this.name = name;
        this.kFieldName = kFieldName;
        this.weight = weight;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public String getkFieldName() {
        return kFieldName;
    }

    public void setkFieldName(String kFieldName) {
        this.kFieldName = kFieldName;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}
