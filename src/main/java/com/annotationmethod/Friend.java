package com.annotationmethod;

/**
 * Created by rakeshgupta on 9/7/16.
 */
public class Friend {

    private int id;

    private String name;

    private String isAlcohalic;

    @Override
    public String toString() {
        return "Friend{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isAlcohalic='" + isAlcohalic + '\'' +
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

    public String getIsAlcohalic() {
        return isAlcohalic;
    }

    public void setIsAlcohalic(String isAlcohalic) {
        this.isAlcohalic = isAlcohalic;
    }


}
