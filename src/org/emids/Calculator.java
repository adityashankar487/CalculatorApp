package org.emids;

public class Calculator {

	public static int add(String numbers) {
		int sum = 0;
	    String[] numbersArray = numbers.split(",|n"); // Added |n to the split regex
	    for (String number : numbersArray) {
	        if (!number.isEmpty()) {
	            sum += Integer.parseInt(number.trim());
	        }
	    }
	    return sum;
	}
}
