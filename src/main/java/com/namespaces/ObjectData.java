package com.namespaces;

/**
 * Created by rakeshgupta on 9/13/16.
 */
public class ObjectData {

    private int type;

    private String oName;

    private String oData;

    private Lion lion;


    public Lion getLion() {
        return lion;
    }

    public void setLion(Lion lion) {
        this.lion = lion;
    }

    public ObjectData() {
    }

    @Override
    public String toString() {
        return "ObjectData{" +
                "type=" + type +
                ", oName='" + oName + '\'' +
                ", oData='" + oData + '\'' +
                '}';
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getoName() {
        return oName;
    }

    public void setoName(String oName) {
        this.oName = oName;
    }

    public String getoData() {
        return oData;
    }

    public void setoData(String oData) {
        this.oData = oData;
    }
}
