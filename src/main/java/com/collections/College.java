package com.collections;

import com.collections.Teacher;

import java.util.Arrays;
import java.util.List;

/**
 * Created by rakeshgupta on 9/13/16.
 */
public class College {
    private int collId;

    private String name;

    private Teacher[] teachers;

    @Override
    public String toString() {
        return "College{" + "\n" +
                "collId=" + collId + "\n" +
                ", name='" + name + '\'' + "\n" +
                ", teachers=" + Arrays.toString(teachers) + "\n" +
                '}';
    }


    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }

    public int getCollId() {
        return collId;
    }

    public void setCollId(int collId) {
        this.collId = collId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
