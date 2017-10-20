package org.emids;

public class Calculator {

	
	public static void add(String numbers){
		  String[] numbersArray = numbers.split(",");
	        if (numbersArray.length > 2) {
	            throw new RuntimeException("Up to 2 numbers separated by comma (,) are allowed");
	        }
	        else {
	            for (String number : numbersArray) {
	                Integer.parseInt(number); 
	            }
	        }
	    }
	
		
		
	}


