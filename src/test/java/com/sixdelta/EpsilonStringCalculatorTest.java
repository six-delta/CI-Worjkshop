package com.sixdelta;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EpsilonStringCalculatorTest {

    @Test
    public void firstTest(){
        EpsilonStringCalculator esc = new EpsilonStringCalculator();
        assertEquals( 1, esc.add("1"));
    }

	@Test
    public void secondTest(){
        EpsilonStringCalculator esc = new EpsilonStringCalculator();
        assertEquals( 3, esc.add("1,2"));
    }
}
