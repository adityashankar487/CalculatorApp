package org.emids;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

	@Test(expected = RuntimeException.class)
	public final void theMethodCanTakeNumbersSeparatedBycomma() {
		Calculator.add("1,2,3");
		Assert.assertNotEquals(false, true);
	}

	@Test
	public final void whenEmptyStringIsUsedThenReturnValueIs0() {
	    Assert.assertEquals(0, Calculator.add(""));
	}


	public final void whenTwoNumbersAreUsedThenReturnValueIsTheirSum() {
	    Assert.assertEquals(3+6, Calculator.add("3,6"));
	}
	
	

	
}
