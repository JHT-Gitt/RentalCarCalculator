package org.example;
import java.util.*;

public class DeveloperLevel {
    Scanner scanner = new Scanner(System.in);

    int yearsExp, languages;


    public void level(){

        System.out.printf("Enter years of Experience: ");
        yearsExp = scanner.nextInt();
        System.out.printf("Enter number of Programming Languages that you know: ");
        languages = scanner.nextInt();

        if ( yearsExp > 5 && languages > 3){
            System.out.println("You are a Senior developer");
        }else if( yearsExp <= 5 && yearsExp >=2 && languages >=2 ){
            System.out.println("You're a Medior developer");
        }else if( yearsExp <2 && languages<2){
            System.out.println("You're a Junior Developer");
        }

    }




}
