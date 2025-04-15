package org.example;
import java.util.*;

public class Login {
    Scanner scanner = new Scanner(System.in);
    String username, password = "secret123";


    public void userCheck(){

        System.out.printf("Enter your Username: ");
        username = scanner.nextLine();
        System.out.printf("Enter your Password: ");
        password = scanner.nextLine().trim().toLowerCase();

        if(!username.isEmpty() && password.equals("secret123") ){
                System.out.println("Access Granted, Welcome " + username);
        }else{
            System.out.println("Invalid credentials");
        }


    }



}
