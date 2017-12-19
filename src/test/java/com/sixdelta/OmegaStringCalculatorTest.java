package com.sixdelta;

import org.junit.*;
import static org.junit.Assert.*;

public class OmegaStringCalculatorTest {

  @Test
  public void testOneValue(){
    OmegaStringCalculator stringCalculator = new OmegaStringCalculator();
    int result = stringCalculator.add("1");
    assertEquals( 1, result );
  }

  @Test
  public void testTwoValues(){
  	OmegaStringCalculator stringCalculator = new OmegaStringCalculator();
  	int result = stringCalculator.add("1,2");
  	assertEquals( 3, result);
  }

  @Test
  public void testMoreValues(){
  	OmegaStringCalculator stringCalculator = new OmegaStringCalculator();
  	int result = stringCalculator.add("1,2,3,4,5");
  	assertEquals( 15, result);
  }

  @Test
  public void testWithBlanksValues(){
  	OmegaStringCalculator stringCalculator = new OmegaStringCalculator();
  	int result = stringCalculator.add("1\n2,3\n4,5");
  	assertEquals( 15, result);
  }

  @Test
  public void testDifferentDelimiters(){
  	OmegaStringCalculator stringCalculator = new OmegaStringCalculator();
  	int result = stringCalculator.add("//;\n1;2");
  	assertEquals( 3, result);
  }
}
