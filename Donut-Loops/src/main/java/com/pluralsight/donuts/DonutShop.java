package com.pluralsight.donuts;

public class DonutShop {
    public static void main(String[] args) {
        Donut d = new Donut("Big fluffy donut with a cherry on top", 499, 3.99);
        d.description = "Big fluffy donut with a cherry on top";
        d.calories = 499;
        d.price = 3.99;
        Donut d2 = new Donut();
        d2.description = "Big fluffy donut with a cherry on top";
        d2.calories = 499;
        d2.price = 3.99;

        System.out.println(d);
        printDonut(d);
        printDonutAsCSV(d);
       // System.out.println(d);
       // System.out.println(d2);


    }

    public static void printDonut(Donut d){
        System.out.println(d.getDescription());
        System.out.printf(" which costs $%.2f\n", d.getPrice());

    }

    public static void printDonutAsCSV(Donut d){
        System.out.print(d.getDescription());
        System.out.print(",");
        System.out.print(d.getCalories());
        System.out.print(",");
        System.out.println(d.getPrice());
    }
    }
