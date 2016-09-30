package com.namespaces;

/**
 * Created by rakeshgupta on 9/13/16.
 */
public class King {
    private int kId;

    private String kName;

    private String kField;

    private Animal animal;

    @Override
    public String toString() {
        return "King{" +
                "kId=" + kId +
                ", kName='" + kName + '\'' +
                ", kField='" + kField + '\'' +
                ", animal=" + animal +
                '}';
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public King() {
    }

    public int getkId() {
        return kId;
    }

    public void setkId(int kId) {
        this.kId = kId;
    }

    public String getkName() {
        return kName;
    }

    public void setkName(String kName) {
        this.kName = kName;
    }

    public String getkField() {
        return kField;
    }

    public void setkField(String kField) {
        this.kField = kField;
    }
}


