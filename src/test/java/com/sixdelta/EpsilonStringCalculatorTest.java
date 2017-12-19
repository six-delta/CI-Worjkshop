package com.sixdelta;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EpsilonStringCalculatorTest {

    @Test
    public void oneNumberAddition(){
        EpsilonStringCalculator esc = new EpsilonStringCalculator();
        assertEquals( 1, esc.add("1"));
    }

	@Test
    public void twoNumberAddition(){
        EpsilonStringCalculator esc = new EpsilonStringCalculator();
        assertEquals( 3, esc.add("1,2"));
    }

    @Test
    public void multipleNumberAddition(){
        EpsilonStringCalculator esc = new EpsilonStringCalculator();
        assertEquals( 435, esc.add("10,5,20,100,300"));
    }

    @Test
    public void linebreakDelimiter(){
        EpsilonStringCalculator esc = new EpsilonStringCalculator();
        assertEquals( 435, esc.add("10,5,20\n100\n300"));
    }

    @Test
    public void emptyString(){
        EpsilonStringCalculator esc = new EpsilonStringCalculator();
        assertEquals( 0, esc.add(""));
    }

    @Test
    public void patameterDelimiter(){
        EpsilonStringCalculator esc = new EpsilonStringCalculator();
        assertEquals( 7, esc.add("//;\n1;2;4"));
    }

    @Test(expected = RuntimeException.class)
    public void negativeValues(){
        EpsilonStringCalculator esc = new EpsilonStringCalculator();
        assertEquals( -1, esc.add("1,2,-4"));
    }

}
