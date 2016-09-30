package com.collections;

/**
 * Created by rakeshgupta on 9/13/16.
 */
public class ObjectHelper {
    private int no;

    private String relatedTo;

   @Override
    public String toString() {
        return " " + "\n" +"ObjectHelper{" +
                "no=" + no + "\n" +
                ", relatedTo='" + relatedTo + '\'' + "\n" +
                '}';
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getRelatedTo() {
        return relatedTo;
    }

    public void setRelatedTo(String relatedTo) {
        this.relatedTo = relatedTo;
    }
}
