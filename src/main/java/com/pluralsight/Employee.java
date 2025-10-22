package com.pluralsight;

import java.time.LocalDateTime;

public class Employee {

    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double startTime;//added this property because its needed for the punchIn methods

    //create constructor
    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
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

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    //derived getters
    public double getTotalPay(){
        double standardPay = this.getHoursWorked() * this.getPayRate();
        double overtimePay = this.getOvertime() * 1.5;
        return standardPay + overtimePay;
    }

    public double regularHours(){
        if(this.getHoursWorked() > 40){
            return 40;
        }
        return this.getHoursWorked();
    }

    public double getOvertime(){
        //create an if statement that calculates the overtime hours
        if(this.getHoursWorked() > 40){
            return getHoursWorked() - 40;
        }
        return 0;
    }
    //this method starts the time
    public void punchIn(double time){
        this.startTime = time;
    }

    public void punchOut(double time){
        this.hoursWorked += time - this.startTime;//intelliJ gave me a suggestion to change my datatype for hoursWorked, from int to double, to stay consistent
    }

    //overloading methods that uses current time
    public void punchIn(){
        LocalDateTime now = LocalDateTime.now();
        double currentTime = now.getHour() + (now.getMinute()/60.0); //we are converting the minutes to correspond to fractional format, ex. 2:30 is converted to 14.5

        this.punchIn(currentTime);
    }

    //overloading method
    public void punchOut(){
        LocalDateTime now = LocalDateTime.now();
        double currentTime = now.getHour() + (now.getMinute()/60.0);

        this.punchOut(currentTime);
    }
}
