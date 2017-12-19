package com.sixdelta;

import org.junit.*;
import static org.junit.Assert.*;

public class MultiplosTest {

  @Test
  public void firstTest(){
    Multiplos m = new Multiplos();
    int result = m.calculateFor(10);
    assertEquals( 23, result );
  }
}
