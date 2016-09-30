package com.spring.sample;

import java.util.List;

/**
 * Created by rakeshgupta on 9/5/16.
 */
public class CollegeData {

    private int collId;

    private String collName;

    private String collAdd;

    private List<Employee> list;

    public List<Employee> getList() {
        return list;
    }

    public void setList(List<Employee> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "CollegeData{" +
                "collId=" + collId +
                ", collName='" + collName + '\'' +
                ", collAdd=" + collAdd +
                ", list=" + list +
                '}';
    }

    public int getCollId() {
        return collId;
    }

    public void setCollId(int collId) {
        this.collId = collId;
    }

    public String getCollName() {
        return collName;
    }

    public void setCollName(String collName) {
        this.collName = collName;
    }

    public String getCollAdd() {
        return collAdd;
    }

    public void setCollAdd(String collAdd) {
        this.collAdd = collAdd;
    }
}
