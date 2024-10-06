package com.pluralsight;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.regex.Pattern;

public class FullnameParsel {
    public static void main(String[] args) {
        Scanner nameScan = new Scanner(System.in);
        System.out.println("""
                Type "c" to enter First and Last name
                Type "x" to enter   First, Middle and Last:
                 """);
        String answer = nameScan.nextLine();
        if (answer.equals("c")) {

            System.out.println(" Enter First and Last name: ");
            String firstName = nameScan.nextLine();
            String[] firstName2 = firstName.split("\\s+");
            System.out.println(firstName);
            System.out.println(" First name:  " + firstName2[0]);
            System.out.println(" Middle name: None ");
            System.out.println(" Last name : " + firstName2[1]);
        }

        if (answer.equals("x")) {
            System.out.println(" Enter First, Middle, and Last name: ");
            String firstName = nameScan.nextLine();
            String[] firstName3 = firstName.split("\\s+");
            System.out.println(firstName);
            System.out.println("First name:  " + firstName3[0]);
            System.out.println(" Middle name: " + firstName3[1]);
            System.out.println(" Last name : " + firstName3[2]);

        }


    }


}

