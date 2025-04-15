package org.example;
import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class CarCalculator {

    Scanner scanner = new Scanner(System.in);

    static class Option{
        String optName;
        double cost;

        Option(String _optName, double _cost){
            this.optName = _optName;
            this.cost = _cost;
        }
    }
    public void rent() {
        String date;
        double daysRent, basicRent = 29.99, rentUnder25;
        int age;

        System.out.printf("Enter a pick-up date (yyyy-MM-dd): ");
        date = scanner.nextLine();
        System.out.printf("Enter how many days you want to rent a car: ");
        daysRent = scanner.nextDouble();

        Map<Double, Option> newOption = new LinkedHashMap<>();
        newOption.put(1.0, new Option("electronic toll tag", 3.95));
        newOption.put(2.0, new Option("GPS", 2.95));
        newOption.put(3.0, new Option("roadside assistance", 3.95));
        double totalCost = 0;

        for(Map.Entry<Double, Option> entry : newOption.entrySet()){
            Option option = entry.getValue();
            System.out.printf("Do you want " + option.optName + " for $" + option.cost + " per day? [Y/N]:");
            String input = scanner.next().trim().toLowerCase();

            if (input.equals("y")){
                totalCost += option.cost;
            }
        }
        System.out.println("Total option cost: +$" + totalCost);
        System.out.printf("Enter your age: ");
        age = scanner.nextInt();
        if( age < 25 ){
            System.out.println("Basic Car Rental Cost: $" + basicRent + " per day * " + daysRent + " day/s rent");
            System.out.println("Driver under 25 surcharge: %30");
            rentUnder25 =basicRent + (basicRent * .30);
            totalCost = (rentUnder25 + totalCost) * daysRent;

            System.out.printf("Total cost: $%.2f" , totalCost);
        }else{
            System.out.println("Basic Car Rental Cost: $" + basicRent + " per day * " + daysRent + " day/s rent");
            System.out.println("Age is 25 or over: No surcharge ...");
            totalCost = (totalCost + basicRent) * daysRent;
            System.out.printf("\nTotal cost: $%.2f" , totalCost);
        }
    }

//        Map<String, Double> optionsCost = new LinkedHashMap<>();
//        optionsCost.put("electronic toll tag", 3.95);
//        optionsCost.put("GPS", 2.95);
//        optionsCost.put("roadside assistance", 3.95);
//        int totalCost = 0, age;
//        String date;
//        double daysRent, basicRent = 29.99;

//        System.out.printf("Enter a pick-up date (yyyy-MM-dd): ");
//        date = scanner.nextLine();
//        System.out.printf("Enter how many days you want to rent a car: ");
//        daysRent = scanner.nextDouble();
//        for(Map.Entry<String, Double> entry : optionsCost.entrySet()){
//            System.out.printf("Do you want " + entry.getKey() + " at " + entry.getKey() + "[Y/N] ?: ");
//            String input = scanner.nextLine().trim().toLowerCase();
//            if (input.equals("y")){
//                totalCost += entry.getValue();
//            }
//        }
//        System.out.printf("Enter your age: ");
//        age = scanner.nextInt();


//        System.out.println("Total cost: $" + totalCost);

    //}


//    double daysRent, tollPrice = 3.95, gpsPrice = 2.95, assistPrice = 3.95, basicRental = 29.99, totalCost;
//    String date,tollTag, gps, roadAssistance;
//    int age;
//
//    public void rentDisplay(){
//        System.out.println("Basic Rental : $" + basicRental);
//        System.out.println("Toll Tag Price Per Day: $" + tollPrice);
//        System.out.println("Toll Tag Price Per Day: $" + tollPrice);
//        System.out.println("Toll Tag Price Per Day: $" + tollPrice);
//
//    }
//    public void rent(){
//        System.out.printf("Enter a pick-up date (yyyy-MM-dd): ");
//        date = scanner.nextLine();
//        System.out.printf("Enter how many days you want to rent a car: ");
//        daysRent = scanner.nextDouble();
//        System.out.printf("Do you want an electronic toll tag for $%.2f per day? [Y/N]: ", tollPrice);
//        tollTag = scanner.next();
//        if(tollTag.equals("Y") || tollTag.equals("y")){
//            basicRental +=tollPrice;
//            System.out.printf("Do you want a GPS for $%.2f per day? [Y/N]: ", gpsPrice);
//            gps = scanner.next();
//            if(gps.equals("y") || gps.equals("Y")){
//                basicRental +=gpsPrice;
//                System.out.printf("Do you want roadside assistance for $%.2f per day? [Y/N]: ", assistPrice);
//                roadAssistance = scanner.next();
//                if(roadAssistance.equals("y") || roadAssistance.equals("Y")){
//                    totalCost = (basicRental + assistPrice) * daysRent;
//                    System.out.printf("Total cost : $%.2f ", totalCost);
//                }else if(roadAssistance.equals("n") || roadAssistance.equals("N")){
//                    System.out.printf("Total Cost : $%.2f ", basicRental);
//                }
//            }else if(gps.equals("n") || gps.equals("N")){
//                System.out.printf("Do you want roadside assistance for $%.2f per day? [Y/N]: ", assistPrice);
//                roadAssistance = scanner.next();
//                if(roadAssistance.equals("y") || roadAssistance.equals("Y")){
//                    totalCost = (basicRental + assistPrice) * daysRent;
//                    System.out.printf("Total cost : $%.2f ", totalCost);
//                }else if(roadAssistance.equals("n") || roadAssistance.equals("N")){
//                    System.out.printf("Total Cost : $%.2f ", basicRental);
//                }
//            }
//
//        }else if(tollTag.equals("N") || tollTag.equals("n")) {
//            System.out.printf("Do you want a GPS for $%.2f per day? [Y/N]: ", gpsPrice);
//            gps = scanner.next();
//            if(gps.equals("y") || gps.equals("Y")) {
//                basicRental += gpsPrice;
//                System.out.printf("Do you want roadside assistance for $%.2f per day? [Y/N]: ", assistPrice);
//                roadAssistance = scanner.next();
//                if (roadAssistance.equals("y") || roadAssistance.equals("Y")) {
//                    totalCost = (basicRental + assistPrice) * daysRent;
//                    System.out.printf("Total cost : $%.2f ", totalCost);
//                } else if (roadAssistance.equals("n") || roadAssistance.equals("N")) {
//                    System.out.printf("Total Cost : $%.2f ", basicRental);
//                }
//            }else if(gps.equals("n") || gps.equals("N")){
//                System.out.printf("Do you want roadside assistance for $%.2f per day? [Y/N]: ", assistPrice);
//                roadAssistance = scanner.next();
//                if(roadAssistance.equals("y") || roadAssistance.equals("Y")){
//                    totalCost = (basicRental + assistPrice) * daysRent;
//                    System.out.printf("Total cost : $%.2f ", totalCost);
//                }else if(roadAssistance.equals("n") || roadAssistance.equals("N")){
//                    System.out.printf("Total Cost : $%.2f ", basicRental);
//                }
//            }
//        }
//        System.out.printf("Do you want a GPS for $%.2f per day? [Y/N]: ", gpsPrice);
//        gps = scanner.next();
//        System.out.printf("Do you want roadside assistance for $%.2f per day? [Y/N]: ", assistPrice);
//        roadAssistance = scanner.next();
//        System.out.printf("Enter your age: ");
//        age = scanner.nextInt();

//        }
//
//
//
//    }




}
