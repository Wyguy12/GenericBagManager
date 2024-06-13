// Define the package name for the class.
package com.wyattfredrickson;

import static org.junit.Assert.*; // Import static methods from the JUnit Assert class
import org.junit.Before; // Import the Before annotation from JUnit
import org.junit.Test; // Import the Test annotation from JUnit


/**
 * Test class for the SortedBag class.
 */
public class SortedBagTest {
    // Declare a private variable for sortedBag.
    private SortedBag<String> sortedBag;


    // Annotate this method so it can be run before each test.
    @Before 
    public void setUp() {
        sortedBag = new SortedBag<>(); // Initialize sortedBag
    }


    // ****Annotated the methods for each test case****
    @Test 
    public void testAdd() {
        // Adding elements to the sorted bag for testing.
        sortedBag.add("apple");
        sortedBag.add("banana");
        sortedBag.add("orange");

        // Verifying that the elements are removed in a sorted manner
        assertEquals("apple", sortedBag.remove());
        assertEquals("banana", sortedBag.remove());
        assertEquals("orange", sortedBag.remove());
    }


    @Test
    public void testRemove() {
        // Adding an element to the sorted bag.
        sortedBag.add("apple");

        // Verifying that the elements can be removed.
        assertEquals("apple", sortedBag.remove());

        // Verifying that the bag is empty after removing the elements.
        assertNull(sortedBag.remove());
    }


    @Test 
    public void testContains() {
        // Adding an element to the sorted bag.
        sortedBag.add("orange");

        // Verifying that the bag doesn't contain an element that was not original added to the sorted bag.
        // Verifying that orange is not inside of the sorted bag.
        assertTrue(sortedBag.contains("orange"));
    }


    @Test
    public void testEmpty() {
        // Verifying that the bag is empty from the start
        assertTrue(sortedBag.empty());

        // Adding an element to the sorted bag.
        sortedBag.add("apple");

        // Verifying that the bag is not empty after adding the element.
        assertFalse(sortedBag.empty());
    }

}