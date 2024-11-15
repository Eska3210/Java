package com.mycompany.minmax1;
/**
 *
 * @author EskaRashid
 */
	import java.util.List;
	import java.util.Collections;
 
	public class MinMax1 {
 
	public static int[] findMinAndMax(List<Integer> numbers) {
    	// Handle empty or null list
    	if (numbers == null || numbers.isEmpty()) {
        	throw new IllegalArgumentException("The list cannot be null or empty");
    	}
 
    	// Use Collections.min() and Collections.max() to find the smallest and largest numbers
    	int min = Collections.min(numbers);
    	int max = Collections.max(numbers);
 
    	// Return an array containing the min and max values
    	return new int[]{min, max};
	}
 
	public static void main(String[] args) {
    	// Example usage
    	List<Integer> numbers = List.of(5, 3, 9, 1, 4);
    	int[] result = findMinAndMax(numbers);
 
    	System.out.println("Min: " + result[0] + ", Max: " + result[1]);
	}
}
