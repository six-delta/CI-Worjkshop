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

    @Test
    public void Test3(){
        EpsilonStringCalculator esc = new EpsilonStringCalculator();
        assertEquals( 435, esc.add("10,5,20\n100\n300"));
    }

    
    @Test
    public void empty(){
        EpsilonStringCalculator esc = new EpsilonStringCalculator();
        assertEquals( 0, esc.add(""));
    }

    @Test
    public void moreDelims(){
        EpsilonStringCalculator esc = new EpsilonStringCalculator();
        assertEquals( 7, esc.add("//;\n1;2;4"));
    }

    @Test(expected = RuntimeException.class)
    public void negativeValues(){
        EpsilonStringCalculator esc = new EpsilonStringCalculator();
        assertEquals( -1, esc.add("1,2,-4"));
    }

}
