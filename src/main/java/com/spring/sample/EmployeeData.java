package com.spring.sample;

/**
 * Created by rakeshgupta on 9/5/16.
 */
public class EmployeeData {

    private String empManagement;

    private int noOfEmp;

    private Employee employee;

    @Override
    public String toString() {
        return "EmployeeData{" +
                "empManagemet='" + empManagement + '\'' +
                ", noOfEmp=" + noOfEmp +
                ", employee=" + employee +
                '}';
    }

    public String getEmpManagement() {
        return empManagement;
    }

    public void setEmpManagement(String empManagement) {
        this.empManagement = empManagement;
    }

    public int getNoOfEmp() {
        return noOfEmp;
    }

    public void setNoOfEmp(int noOfEmp) {
        this.noOfEmp = noOfEmp;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
