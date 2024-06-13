// Define the package name for the class.
package com.wyattfredrickson;


// Import necessary java libraries.
import java.util.ArrayList;


/**
 * This is a generic implementation of an un-sorted bag using an ArrayList to store the bags items.
 * This class will provide operations to add, remove and check iems in the bag.
 * @param <E> This is the type of elements in this bag.
 */
public class UnsortedBag<E> implements IBag<E> {
    // Declare an ArrayList for storing the bag's items.
    private ArrayList<E> data; 


    /**
     * The constructor that will create an instance (object) of itself, (unsorted bag). 
     */
    public UnsortedBag() {
        // Initialize the ArrayList for storing the bag's items.
        this.data = new ArrayList<>(); 
    }
    

    /**
     * Adding an item to the bag.
     * @param item The item to be added to the bag.
     */
    @Override
    public void add(E item) {
        // Adding the item to the end of the list, ArrayList (data).
        data.add(item); 
    }


    /**
     * Removing an item from the bag.
     * @param item the item that was to be removed, or returns null if the bag is empty.
     */
    @Override
    public E remove() {
        // if the bag is empty it will return a null value, otherwise proceed. 
        if (data.isEmpty()) {
            return null;
        }
        // Since bag is not empty it will proceed by removing the first item in the list ArrayList (data).
        return data.remove(0); 
    }


    /**
     * Checking if the bag contains a specific item.
     * @param item the item that it checks for.
     * @return true if the item is found in the bag, otherwise it will return false.
     */
    @Override
    public boolean contains(E item) {
        // Checking if the item is in the list of the ArrayList (data). 
        return data.contains(item); 
    }


    /**
     * Checking if the bag is empty.
     * @return returns true if the bag contains no items, otherwise it will return false.
     */
    @Override
    public boolean empty() {
        // Checking if the List is empty.
        return data.isEmpty();
    }

}