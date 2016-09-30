package com.collections;

/**
 * Created by rakeshgupta on 9/13/16.
 */
public class Rani {
    private int id;

    private String name;

    private int mobNo;

    public Rani(int id, String name, int mobNo) {
        this.id = id;
        this.name = name;
        this.mobNo = mobNo;
    }

    @Override
    public String toString() {
        return "\n" + "Rani{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mobNo=" + mobNo +
                '}';
    }
}
