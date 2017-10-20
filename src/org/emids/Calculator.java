package org.emids;

public class Calculator {

	public static int add(String numbers) {
		int sum = 0;
	    String[] numbersArray = numbers.split(",");
	    for (String number : numbersArray) {
	        if (!number.isEmpty()) {
	            sum += Integer.parseInt(number);
	        }
	    }
	    return sum;
	}
}
