package com.pluralsight;

import java.util.Scanner;

public class NeighborhoodLibrary {
    public static void main(String[] args) {

        Book[] inventory = new Book[20];

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

        Scanner scanner = new Scanner(System.in);
    }
}
