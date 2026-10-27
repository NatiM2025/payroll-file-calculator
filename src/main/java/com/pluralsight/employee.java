package com.pluralsight;

public class employee {
   private int id;
   private String name;
   private double workedHours;

    public employee(int id, double payRate, double workedHours, String name) {
        this.id = id;
        this.payRate = payRate;
        this.workedHours = workedHours;
        this.name = name;
    }

    public double getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(double workedHours) {
        this.workedHours = workedHours;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    double payRate;

    public static void getEmployeeId(){

    }
    public double getGrosspay(double workedHours, double payRate){
        return workedHours * payRate;
    }
}
