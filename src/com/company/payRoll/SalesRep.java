package com.company.payRoll;

public class SalesRep extends StaffMember {
    private double allowance = 1000;
    Manager manager = new Manager();

    public void calculatedSalary(double salary) {}

    //Default Constructor
    public SalesRep() {
    }

    //Constructor
    public SalesRep(double allowance) {
        this.allowance = allowance;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }


    public void display() {
        StaffMember[] arr;
        // Allocating memory for 2 objects
        // of type student
        arr = new StaffMember[5];

        // Initializing the first element
        // of the array
        arr[0] = new StaffMember("Ricardo", "Knight", "123RFG", 10.5) {

            @Override
            public void calculatedSalary(double salary) {
                salary = getHoursWorked() * 2500 + manager.getBonus();
                System.out.printf("Calculated Salary is: $%,.2f\n" ,salary);
            }

        };

        // Initializing the second element
        // of the array
        arr[1] = new StaffMember("Oshane", "Roberts", "123DSR", 8) {

            @Override
            public void calculatedSalary(double salary) {
                salary = getHoursWorked() * 1500 + allowance;
                System.out.printf("Calculated Salary is: $%,.2f\n" ,salary);
            }

        };

        // Initializing the third element
        // of the array
        arr[2] = new StaffMember("Brandon", "Fearon", "123RTG", 8) {
            @Override
            public void calculatedSalary(double salary) {
                salary = getHoursWorked() * 1500 + allowance;
                System.out.printf("Calculated Salary is: $%,.2f\n" ,salary);
            }

        };

        // Initializing the forth element
        // of the array
        arr[3] = new StaffMember("Doron", "Williams", "126TIF", 5) {
            @Override
            public void calculatedSalary(double salary) {
                salary = getHoursWorked() * 1500 + allowance;
                System.out.printf("Calculated Salary is: $%,.2f\n" ,salary);
            }

        };
        // Initializing the fifth element
        // of the array
        arr[4] = new StaffMember("Kerry", "Smith", "123DDD", 9.2) {
            @Override
            public void calculatedSalary(double salary) {
                salary = getHoursWorked() * 1500 + allowance;
                System.out.printf("Calculated Salary is: $%,.2f\n" ,salary);
            }
        };

        // Displaying the Sales Rep & Manager data
        System.out.println("\033[4;32m\nManager\033[0m");
        arr[0].display();
        arr[0].calculatedSalary(0);
        System.out.println("\033[4;32m\nSales Rep #1\033[0m");
        arr[1].display();
        arr[1].calculatedSalary(0);
        System.out.println("\033[4;32m\nSales Rep #2\033[0m");
        arr[2].display();
        arr[2].calculatedSalary(0);
        System.out.println("\033[4;32m\nSales Rep #3\033[0m");
        arr[3].display();
        arr[3].calculatedSalary(0);
        System.out.println("\033[4;32m\nSales Rep #4\033[0m");
        arr[4].display();
        arr[4].calculatedSalary(0);
    }


}
