package com.namespaces;

/**
 * Created by rakeshgupta on 9/13/16.
 */
public class Lion {

    private String lName;

    private int lId;

    private String lMobNo;

    public Lion(String lName, int lId, String lMobNo) {
        this.lName = lName;
        this.lId = lId;
        this.lMobNo = lMobNo;
    }

    @Override
    public String toString() {
        return "Lion{" +
                "lName='" + lName + '\'' +
                ", lId=" + lId +
                ", lMobNo='" + lMobNo + '\'' +
                '}';
    }
}
