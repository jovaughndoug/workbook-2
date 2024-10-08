package com.pluralsight.library;

import java.util.Scanner;

public class NeighborhoodLibraryApp {
    public static void main(String[] args) {
        Book[] allBooks = {
                new Book("Sherlock Holmes", "123456", false, "", 1),
                new Book("Can't Hurt Me", "1234567", false, "", 2),
                new Book("Atomic Habits", "1234568", false, "", 3),
                new Book("Get Rich or Die Trying", "1234569", false, "", 4),
                new Book("Hustle Harder Hustle Smarter", "12345610", false, "", 5),
                new Book("The Accomplice", "12345611", false, "", 6),
                new Book("48 Laws of Power", "12345612", false, "", 7),
                new Book("The Art of not giving a F***", "12345613", false, "", 8),
                new Book("Surviving Diddy", "1234514", false, "", 9),
                new Book("The Master Key System", "1234515", false, "", 10),
                new Book("Get Out", "1234516", true, "Jovaughn", 11),
                new Book("Can't Never Quit", "1234517", false, "", 12),
                new Book("Hey Carl", "1234518", false, "", 13),
                new Book("Holes", "1234519", false, "", 14),
                new Book("Night", "1234520", false, "", 15),
                new Book("Stay", "1234521", false, "", 16),
                new Book("The Longest Yard", "1234522", false, "", 17),
                new Book("Seven Pounds", "1234523", false, "", 18),
                new Book("The Dark Knight", "1234524", false, "", 19),
                new Book("Sherlock Holmes 2", "1234525", false, "", 20),

        };

        System.out.println("""
                                
                                
                WELCOME TO JOS LIBRARY
                WE ARE HAPPY TO EXTEND YOUR KNOWLEDGE
                =)            
                """);

        boolean running = true;
        while (running) {


            System.out.println("""
                                    
                                   
                    PRESS "1" "2" or "3"
                    1.See Available Books
                    2.See Checked Out Books
                    3.Exit 
                    :                                     
                    """);

            Scanner userInput = new Scanner(System.in);
            String answer = userInput.nextLine();
            if (answer.equals("1")) {
                for (int i = 0; i < allBooks.length; i++) {
                    if (!allBooks[i].isCheckedOut())
                        System.out.print(allBooks[i] + "\n");
                }
                System.out.println(" Do you want to check out a book press 'j' : ");
                System.out.println(" Return Home press'3' : ");
                String checkOut = userInput.nextLine();
                if (checkOut.equals("j")) {
                    System.out.println(" What is the Book ID of the book you want: ");
                    int bookID = userInput.nextInt();
                    userInput.nextLine();
                    for (Book b : allBooks) {
                        if (!b.isCheckedOut() && b.getId() == bookID) {
                            b.setCheckedOut(true);
                            System.out.println(" Who is this book being checked out to ");
                            String name = userInput.nextLine();
                            b.setCheckedOutTo(name);
                        }
                    }

                }

            } else if (answer.equals("2")) {
                for (int i = 0; i < allBooks.length; i++) {
                    if (allBooks[i].isCheckedOut())
                        System.out.print(allBooks[i] + "\n");

                }
                System.out.println(" Do you wish to check in a book? Press 'h' for yes");
                String checkIn = userInput.nextLine();
                if (checkIn.equals("h")) {
                    System.out.println(" What is the Book ID of the book you want to return : ");
                    int bookID = userInput.nextInt();
                    userInput.nextLine();
                    for (Book b : allBooks) {

                        if (b.isCheckedOut() && b.getId() == bookID) {
                            b.setCheckedOut(false);
                            System.out.println(b.getTitle()+" Is being Checked Back in ");
                            String name = " ";
                            b.setCheckedOutTo(name);


                        } else if (answer.equals("3")) {
                            running = false;
                        }
                    }


                }


            }
        }
    }
}
