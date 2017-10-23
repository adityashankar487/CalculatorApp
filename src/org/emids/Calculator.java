package org.emids;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

	public static int add(final String numbers, final String delimiter) {
        int sum = 0;
        String[] numbersArray = numbers.split(delimiter);
        List negativeNumbers = new ArrayList();
        for (String number : numbersArray) {
                if (!number.trim().isEmpty()) {
                        int numberInt = Integer.parseInt(number.trim());
                        if (numberInt < 0) {
                                negativeNumbers.add(numberInt);
                        } else if (numberInt <= 1000) {
                                sum += numberInt;
                        }
                }
        }
        if (negativeNumbers.size() > 0) {
                throw new RuntimeException("Negatives not allowed: " + negativeNumbers.toString());
        }
        return sum;                
}
}
