package org.emids;


import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

	@Test(expected = RuntimeException.class)
	public final void theMethodCanTakeNumbersSeparatedBycomma(){
		Calculator.add("1,2,3");
		Assert.assertNotEquals(false,true);
	}
	
	
}
