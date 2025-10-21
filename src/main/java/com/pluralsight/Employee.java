package com.pluralsight;

public class Employee {

    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private int hoursWorked;

    //create constructor
    public Employee(int employeeId, String name, String department, double payRate, int hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    //create setter/getters
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    //derived getters
    public double getTotalPay(){
        double standardPay = this.getHoursWorked() * this.getPayRate();
        double overtimePay = this.getOvertime() * 1.5;
        return standardPay + overtimePay;
    }

    public int regularHours(){
        if(this.getHoursWorked() > 40){
            return 40;
        }
        return this.getHoursWorked();
    }

    public int getOvertime(){
        //create an if statement that calculates the overtime hours
        if(this.getHoursWorked() > 40){
            return getHoursWorked() - 40;
        }
        return 0;
    }


}
