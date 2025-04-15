package org.example;
import java.util.*;


public class Calculator {
    Scanner scanner = new Scanner(System.in);

    int monthlySalary, cap = 10000;


    public void salary(){

        System.out.printf("Enter your monthly Salary: ");
        monthlySalary = scanner.nextInt();
        if (monthlySalary < 1000){
            System.out.println("I want to learn more\n");
            monthlySalary = cap - monthlySalary;
            System.out.printf("I need more %d to reach %d\n", monthlySalary, cap);
        }else if (monthlySalary >= 2000 && monthlySalary < 5000){
            System.out.println("Just getting started");
            monthlySalary = cap - monthlySalary;
            System.out.printf("I need more %d to reach %d\n", monthlySalary, cap);
        }else if (monthlySalary >= 5000 && monthlySalary <10000){
            System.out.println("Now we are talking");
            monthlySalary = cap - monthlySalary;
            System.out.printf("I need more %d to reach %d\n", monthlySalary, cap);
        }else if (monthlySalary == cap){
            System.out.println("This is what im talking about");
        }else{
            System.out.println("Im drowning in a sea full of liquid gold");
        }

    }





}
