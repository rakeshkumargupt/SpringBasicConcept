package com.spring.sample;

/**
 * Created by rakeshgupta on 9/5/16.
 */


public class Employee {


    private int empId;

    private String empName;

    private String mobNo;

    private String empAdd;




    public Employee() {
    }

    public Employee(int empId, String empName, String mobNo, String empAdd) {
        this.empId = empId;
        this.empName = empName;
        this.mobNo = mobNo;
        this.empAdd = empAdd;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", mobNo='" + mobNo + '\'' +
                ", empAdd='" + empAdd + '\'' +
                '}';
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }

    public String getEmpAdd() {
        return empAdd;
    }

    public void setEmpAdd(String empAdd) {
        this.empAdd = empAdd;
    }
}
