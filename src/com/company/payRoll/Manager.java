package com.company.payRoll;
public class Manager {
    private double bonus=1000;

    //Default Constructor
    public Manager(){}


    //Constructor
    public Manager(double bonus){
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void display(){
        System.out.println("Bonus is: "+bonus);}

}
