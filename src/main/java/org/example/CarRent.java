package org.example;
import java.sql.SQLOutput;
import java.util.*;


public class CarRent {

    static String date, etag, gps , assist;
    static int  age , category;
    static double basicRent = 29.99, totalCost = 0, optionalCost = 0 , surcharge;
    static double tollTag = 3.95, gpsFee = 2.95, roadAssist = 3.95, daysRent;




    public static void rent(){
        Scanner scanner = new Scanner(System.in);

        System.out.printf("\nEnter pick-up date: ");
        date = scanner.next();
        System.out.printf("\nEnter number of days of rental: ");
        daysRent = scanner.nextDouble();

        System.out.printf("\nAdd electronic toll tag at $%.2f per day ? [Y/N]: " , tollTag);
        etag = scanner.next().toLowerCase();
        switch (etag){
            case "y":
                optionalCost +=tollTag;
                break;
            case "n":
                break;
            default:
                System.out.println("Invalid input");
        }
        System.out.printf("\nAdd GPS at $%.2f per day? [Y/N] : ", gpsFee);
        gps = scanner.next().toLowerCase();
        switch (gps){
            case "y":
                optionalCost +=gpsFee;
                break;
            case "n":
                break;
            default:
                System.out.println("Invalid input");
        }
        System.out.printf("\nAdd Roadside assistance at $%.2f per day? [Y/N]: ", roadAssist);
        assist = scanner.next().toLowerCase();
        switch (assist){
            case "y":
                optionalCost +=roadAssist;
                break;
            case "n":
                break;
            default:
                System.out.println("Invalid input");
        }

        System.out.printf("\nEnter your age: ");
        age = scanner.nextInt();
        System.out.println("\nDays to be rented: " + daysRent);
        System.out.printf("Total Optional cost: $%.2f", optionalCost);
        System.out.printf("\nBasic Rental cost: $%.2f: ", basicRent);
        if (age<25){
            category = 1;
        }else{
            category = 2;
        }
        switch (category){
            case 1:

                surcharge = basicRent * .30;
                System.out.printf("\nSurcharge under 25 years old: $%.2f", surcharge);
                System.out.printf("\nTotal after surcharge + optional cost: $%.2f", surcharge + basicRent + optionalCost);
                basicRent = optionalCost + (basicRent + (basicRent * .30));
                break;
            case 2:
                basicRent +=optionalCost;
                System.out.printf("\nTotal after optional cost: $%.2f ", basicRent);
                break;
            default:
        }
        totalCost = basicRent * daysRent;
        System.out.printf("\nTotal rental cost : $%.2f", totalCost);


    }

}
