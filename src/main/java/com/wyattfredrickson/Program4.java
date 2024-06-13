// Define the package name for the class.
package com.wyattfredrickson;
/* 


I certify, that this computer program submitted by me is all of my own work, Wyatt Fredrickson.

Wyatt Fredrickson

06-13-2024

CSC 322 


Sources:

Java Programming Book: Introduction to Java Programming and Data Structures, Comprehensive Version, 12th Edition
https://www.baeldung.com/java-generics#:~:text=Conclusion,extra%20overhead%20to%20our%20applications.
https://docs.oracle.com/javase/tutorial/java/generics/index.html
https://www.baeldung.com/junit
https://junit.org/junit5/docs/current/user-guide/
https://docs.oracle.com/javase/7/docs/api/java/util/Collections.html#binarySearch(java.util.List,%20T)
https://www.geeksforgeeks.org/binary-search/


*/

// Import necessary java libraries.
import java.util.Scanner;

public class Program4 {

    // Declare an object as a string value to represent the bag that contains items.
     

    /**
     * This will run the bag application.
     * Method will handle user input and perform all the main operations on the individual bag object.
     */
    public void run() {
        // Declare a new bag via a string object.
        IBag<String> bag;
        Scanner scanner = new Scanner(System.in); // Create new instance Scanner object to read user input.

        // Asking the user which type of specific bag that they want to create.
        System.out.println("Which type of bag do you want? sorted/unsorted: ");
        String typeOfBag = scanner.nextLine(); // Read user input.

        // If else statement for creation of the specific type of bag (sorted/unsorted).
        if (typeOfBag.equalsIgnoreCase("sorted")) {
            bag = new SortedBag<>(); // Creating a sorted bag.
        } else {
            bag = new UnsortedBag<>(); // Creating a unsorted bag.
        }


        // Asking the user now, how many items to add to there bag of choice.
        System.out.println("How many items to put in the bag? ");
        int itemCount = scanner.nextInt(); // Read user input.
        scanner.nextLine(); // Clean up buffer by consuming new line character.


        // Now add the specified number of items to the bag of there choice.
        for (int i = 0; i < itemCount; i++) {
            System.out.println("Enter item " + (i + 1) + ": ");
            String item = scanner.nextLine();
            bag.add(item); // Adding the item to the bag.
        }


        // Checking if the specific items are in the bag requested by the user.
        while (true) {
            System.out.println("You can check if something is in the bag. Check for (type done to stop): ");
            String checkItem = scanner.nextLine();
            if (checkItem.equalsIgnoreCase("done")) {
                break; // Exiting from the loop if user types 'done'            
            }
            // Otherwise check if the item is in the bag and print the results to the user.
            if (bag.contains(checkItem)) {
                System.out.println("Yes, it's in the bag.");
            } else {
                System.out.println("No, it's not in the bag.");
            }
        }   


        // Removing and displaying items from the bag until it is completely empty.
        System.out.println("Lets remove stuff from the bag:");
        while (!bag.empty()) {
            System.out.println("Removing item: " + bag.remove()); // Removing the item.
        }
        scanner.close(); // Lastly close the scanner to free up resources.
    }   


    /**
     * The main method that starts up the application.
     * @param args 
     */
    public static void main(String[] args) {
        // Creating a new instance (object) of the Program4 public class.
        Program4 iBagProgram = new Program4();
        iBagProgram.run(); // Run the application.
    }
}