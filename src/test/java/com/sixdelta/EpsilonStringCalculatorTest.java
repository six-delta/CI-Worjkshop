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

<<<<<<< HEAD

    @Test
    public void Test4(){
=======
    @Test
    public void empty(){
>>>>>>> 2821bcb50ff36a8f430305951d61b031fd176880
        EpsilonStringCalculator esc = new EpsilonStringCalculator();
        assertEquals( 0, esc.add(""));
    }

}
