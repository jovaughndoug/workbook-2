package com.pluralsight.strings;

public class StringsandLoops {
    public static void main(String[] args) {
     // Hard way to do it by repeition
//        String s = "Hello World";
  //      System.out.println(s.toLowerCase());
    //    System.out.println("banana");
      //  System.out.println("Bread");
       // System.out.println("Milk");
        //System.out.println("Chips");
        //System.out.println("Queso");
        //System.out.println("Cream Cheese");
        //System.out.println("Guac");
        //System.out.println("Water");
        //System.out.println("salami");
        //System.out.println("eggs");

        String[] list = {"Milk", "water", "eggs", "Cream Cheese", "Guac", "Salami", "queso", "Banana"};

        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
        for ( String s: list){
            System.out.println(s);

            String alllistitems = "Milk,water, eggs,Cream Cheese, Guac,Salami,queso,vBanana";
            alllistitems = alllistitems.replace( ",", "\n");
            System.out.println(alllistitems);
            String[] listl = alllistitems.split(",");
            System.out.println(listl[0]);

            String newlist = """
                    Splenda
                        Coffee
                                Coke
                                Eggs 
                                            Chees 
                    """;
            System.out.println(newlist.toUpperCase());

        }


    }
}
