package com.company.payRoll;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Manager manager = new Manager(35000.50);
        //StaffMember staffMember = new StaffMember("rikki","Knight","123EA",8.4 );
        SalesRep srep = new SalesRep();
        srep.display();
        srep.getHoursWorked();
        srep.calculatedSalary(0);

    }
}

