package com.company.payRoll;

public abstract class StaffMember {
    private String firstName;
    private String lastName;
    private String deptNumber;
    private double hoursWorked;

    //public abstract void calculateSalary();
    public abstract void calculatedSalary(double salary);

    //Default Constructor
    public StaffMember() {
    }

    //Constructor
    public StaffMember(String firstName, String lastName,
                       String deptNumber,
                       double hoursWorked) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.deptNumber = deptNumber;
        this.hoursWorked = hoursWorked;
    }
    //Getters & Setters
    public String getFirstName() {return firstName;}
    public void setFirstName(String firstName) {this.firstName = firstName;}
    public String getLastName() {return lastName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public double getHoursWorked() {return hoursWorked;}
    public void setHoursWorked(double hoursWorked) {this.hoursWorked = hoursWorked;}
    public String getDeptNumber() {return deptNumber;}
    public void setDeptNumber(String deptNumber) {this.deptNumber = deptNumber;}

    public void display() {
        System.out.println("First Name is: " + firstName);
        System.out.println("Last Name is: " + lastName);
        System.out.println("The Department Number is: " + deptNumber);
        System.out.println("Hours Worked is: " + hoursWorked);
    }

}
