package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;

public class PayrollCalculator {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("employees.csv"));
            System.out.println(bufferedReader.readLine());

            String fileLine;
            while ((fileLine = bufferedReader.readLine()) != null){
                System.out.println(fileLine);
                String[] tokens = fileLine.split("\\|");
                int id = Integer.parseInt(tokens[0]);
                String name = tokens[1];
                double hourWorked = Double.parseDouble(tokens[2]);
                double payRate = Double.parseDouble(tokens[3]);

                employee employee =new employee(id,payRate,hourWorked,name);
                System.out.println("$ " + employee.getGrosspay(hourWorked,payRate));


            }

            } catch (Exception e){
            System.out.println("Something Went wrong :( " + e);
        }

    }
}
