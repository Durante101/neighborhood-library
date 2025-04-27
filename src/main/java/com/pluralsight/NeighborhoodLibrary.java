package com.pluralsight;

import java.util.Scanner;

public class NeighborhoodLibrary {
    public static void main(String[] args) {

        // Initialize an array of 20 books
        Book[] inventory = new Book[20];

        // Create and add books to the inventory
        inventory[0] = new Book(1, "483920", "The Curious Cat Chronicles", false, "");
        inventory[1] = new Book(2, "174839", "Whiskers in the Wild", false, "");
        inventory[2] = new Book(3, "582001", "Cooking with Dragons", false, "");
        inventory[3] = new Book(4, "938472", "The Pancake Adventures", false, "");
        inventory[4] = new Book(5, "627194", "Seussical Spaceships", false, "");
        inventory[5] = new Book(6, "715829", "The Dog Detective Diaries", false, "");
        inventory[6] = new Book(7, "396581", "Jungle Jamboree", false, "");
        inventory[7] = new Book(8, "820471", "Mystery Muffins", false, "");
        inventory[8] = new Book(9, "219385", "Tigers in Tuxedos", false, "");
        inventory[9] = new Book(10, "504812", "How to Bake a Planet", false, "");
        inventory[10] = new Book(11, "781249", "The Invisible Giraffe", false, "");
        inventory[11] = new Book(12, "340192", "Penguins on Parade", false, "");
        inventory[12] = new Book(13, "609381", "The Zesty Zebra Cookbook", false, "");
        inventory[13] = new Book(14, "238147", "The Great Banana Heist", false, "");
        inventory[14] = new Book(15, "817365", "Sloths in Space", false, "");
        inventory[15] = new Book(16, "470192", "The Secret Recipe Society", false, "");
        inventory[16] = new Book(17, "193840", "Rhymes and Rockets", false, "");
        inventory[17] = new Book(18, "682471", "The Crocodile's Cookbook", false, "");
        inventory[18] = new Book(19, "954718", "Mice on Motorcycles", false, "");
        inventory[19] = new Book(20, "702391", "The Flamingo Files", false, "");

        // Create scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        String pick = "";

        // Loop to keep the program running until user chooses to exit
        do {
            System.out.println("\nDurante's Neighborhood Library");
            System.out.println("1. Show all books");
            System.out.println("2. Check out a book");
            System.out.println("C. Check in a book");
            System.out.println("X. Exit");
            System.out.print("Enter your choice: ");

            pick = scanner.nextLine();

            // Switch block to handle different user choices
            switch (pick) {
                case "1":
                    // Show all books
                    for (Book book : inventory) {
                        System.out.println(book.getId() + ". " + book.getTitle()); // Display book id and title
                    }
                    break;

                case "2":
                    // Check out a book
                    System.out.print("Enter your name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter the ID of the book to check out: ");
                    int checkoutId = Integer.parseInt(scanner.nextLine());
                    inventory[checkoutId - 1].checkOut(name);  // Mark book as checked out to the person
                    System.out.println("Book checked out to " + name);
                    break;

                case "C":
                case "c":
                    // Check in a book
                    System.out.print("Enter the ID of the book to check in: ");
                    int checkinId = Integer.parseInt(scanner.nextLine());
                    inventory[checkinId - 1].checkIn();  // Mark book as checked in
                    System.out.println("Book checked in.");
                    break;

                case "X":
                case "x":
                    // Exit the program
                    System.out.println("Goodbye");
                    break;

                default:
                    // Handle invalid input
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (!pick.equalsIgnoreCase("X")); // loop
    }
}