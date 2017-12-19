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
	
	@Test
	public void testThreeValue(){
		AlfaStringCalculator m = new AlfaStringCalculator();
		int result = m.add("1,2,4,55,464,3");
		assertEquals(529,result);
	}
	
	@Test
	public void testFourValue(){
		AlfaStringCalculator m = new AlfaStringCalculator();
		int result = m.add("1\n2,4,55,464,3");
		assertEquals(529,result);
	}
	
	@Test
	public void testFiveValue(){
		AlfaStringCalculator m = new AlfaStringCalculator();
		int result = m.add("1\n2//;\n4,55,464,3");
		assertEquals(529,result);
	}
	
		
	@Test
	public void testSixValue(){
		AlfaStringCalculator m = new AlfaStringCalculator();
		int result = m.add("-1\n2//;\n4,55,464,-3");
		assertEquals(525,result);
	}
	
}
