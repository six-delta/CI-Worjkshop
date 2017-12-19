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
}
