package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println(" What is your First Name: ");
        String firstName = inputScanner.next();
        inputScanner.nextLine();
        System.out.println(" What is your Middle Name: ");
        String middleName = inputScanner.nextLine();
        System.out.println(" What is your Last Name: ");
        String lastName = inputScanner.next();
        inputScanner.nextLine();
        System.out.println(" Please enter your Suffix:");
        String suffix = inputScanner.nextLine();
        String fullName = " Your Full Name is: " + firstName + " " + (middleName.isBlank()?"": " " + " ")+ lastName + ", " + suffix;
        System.out.println(fullName);










    }


}
