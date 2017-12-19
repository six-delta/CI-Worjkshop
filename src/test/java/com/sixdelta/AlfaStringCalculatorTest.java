package com.sixdelta;


import org.junit.*;

import static org.junit.Assert.*;



public class AlfaStringCalculatorTest{
	
	@Test

	public void testOneValue(){
		
		AlfaStringCalculator m = new AlfaStringCalculator();
	
		int result = m.add("1");
		assertEquals(1,result);

	}

	@Test
	public void testTwoValue(){
		AlfaStringCalculator m = new AlfaStringCalculator();
		int result = m.add("1,2");
		assertEquals(3,result);
	}

}
