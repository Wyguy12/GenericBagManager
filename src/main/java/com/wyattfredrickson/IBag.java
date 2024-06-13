// Define the package name for the class.
package com.wyattfredrickson;


/**
 * Interface that represents a generic bag of items.
 * A bag is a collection that can have multiple occurences of the same generic item.
 * @param <E> is the type of elements inside of this bag.
 */
public interface IBag<E> {


    /**
     * Function of adding an item to the bag.
     * @param item The item to be added to the bag.
     */
    void add(E item);


    /**
     * Function of removing an item from the bag.
     * @return returns the item that was removed, or returns null if the bag is empty.
     */
    E remove();


    /**
     * Function of checking if the bag contains a specific item.
     * @param item The item to check for.
     * @return returns true if the item is in the bag, otherwise it will return false.
     */
    boolean contains(E item);   


    /**
     * Function of checking if the bag is empty.
     * @return returns true if the bag is empty, otherwise it will return false.
     */
    boolean empty();


}