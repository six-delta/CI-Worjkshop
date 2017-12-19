package com.sixdelta;

import org.junit.*;
import static org.junit.Assert.*;

public class NeodevelopStringCalculatorTest {

  @Test
  public void testOneValue(){
    StringCalculator sc = new StringCalculator();
    int result = sc.add("1");
    assertEquals( 1, result );
  }

  @Test
  public void testTwoValues(){}
}

