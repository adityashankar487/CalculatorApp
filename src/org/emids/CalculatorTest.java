package org.emids;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public final void theMethodCanTakeNumbersSeparatedBycomma(){
		Calculator.add("1,2,3");
	}
	
	@Test
	public final void forAnEmptyStringTheMethodWillreturn0(){
		Calculator.add(" ");
	}
	
	@Test
	public final void methodWillReturntheirsumofnumbers(){
		Calculator.add(" 1,2");
		Assert.assertEquals(3,Calculator.add("1,2") );
	}
	@Test
	public final void  allowTheMethodToHandleUnkownAmountOfNumbers(){
		Calculator.add("1111111");
		Assert.assertEquals(12,Calculator.add("2,3"));
	}
		
		@Test
		public final void allowTheAddMethodToHandleNewLinesBetweenNumbers(){	
			Assert.assertEquals(3,Calculator.add("1\n2"));
		}
		
		@Test
	    public final void SupportUndefineddelimiters(){
			Assert.assertArrayEquals(14, CalculatorTest.add("1,2\n66\""));
		
	}
		@Test(expected=RuntimException.class)
	    public final void Negativenumberswillthrowanexception(){
		 CalculatorTest.add("-1,2,3,-4,-5");
			}
		@Test
	    public final void Numbersbiggerthan1000shouldbeignored(){
			Assert.assertArrayEquals(4+6, CalculatorTest.add("2,1001,1234,"));
}
}
