package _02_Intro_To_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _03_SearchTest {

    /*
     *  A minimum of 3 tests are required for each method
     */

    @Test
    public void testLinearSearch() {
        // 1. Use the assertEquals() method to test your linear search method
    	String[] food = {"watermelon", "grape", "pumpkin", "orange", "banana"};
    	assertEquals(-1, _01_LinearSearch.linearSearch(food, "grapefruit"));
    	
    	String[] drinks = {"fanta", "sprite", "water", "orange juice", "apple juice"};
    	assertEquals(2, _01_LinearSearch.linearSearch(drinks, "water"));
    	
    	String[] NvidiaGPUs = {"gtx 1050", "rtx 2060", "rtx 4090", "gtx 1670", "rtx 3070"};
    	assertEquals(4, _01_LinearSearch.linearSearch(NvidiaGPUs, "rtx 3070"));
    }

    @Test
    public void testBinarySearch() {
        // 2. Use the assertEquals() method to test your binary search method
        //    remember that the array must be sorted
    	String[] food = { "banana", "grape", "orange", "pumpkin","watermelon"};
    	assertEquals(-1, _01_LinearSearch.linearSearch(food, "grapefruit"));
    	
    	String[] drinks = {  "apple juice", "fanta", "orange juice", "sprite", "water"};
    	assertEquals(4, _01_LinearSearch.linearSearch(drinks, "water"));
    	
    	String[] NvidiaGPUs = {"gtx 1050", "gtx 1660", "rtx 2060", "rtx 3070", "rtx 4090"};
    	assertEquals(3, _01_LinearSearch.linearSearch(NvidiaGPUs, "rtx 3070"));

    }
}
