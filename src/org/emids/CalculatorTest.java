package org.emids;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

	//@Test(expected = RuntimeException.class)
	//public final void theMethodCanTakeNumbersSeparatedBycomma() {
		//Calculator.add("1,2,3");
		//Assert.assertNotEquals(false, true);
	//}

	@Test
	public final void whenEmptyStringIsUsedThenReturnValueIs0() {
	    Assert.assertEquals(0, Calculator.add(""));
	}


	public final void whenTwoNumbersAreUsedThenReturnValueIsTheirSum() {
	    Assert.assertEquals(3+6, Calculator.add("3,6"));
	}
	
	@Test
    public final void whenAnyNumberOfNumbersIsUsedThenReturnValuesAreTheirSums() {
        Assert.assertEquals(3+6+15+18+46+33, Calculator.add("3,6,15,18,46,33"));
    }
	
	public final void whenNewLineIsUsedBetweenNumbersThenReturnValuesAreTheirSums() {
	    Assert.assertEquals(3+6+15, Calculator.add("3,6/n15"));
	}
	@Test
	public final void whenDelimiterIsSpecifiedThenItIsUsedToSeparateNumbers() {
	    Assert.assertEquals(3+6+15, Calculator.add("//;n3;6;15"));
	}
	

	
}
