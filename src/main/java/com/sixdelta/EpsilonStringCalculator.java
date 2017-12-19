package com.sixdelta;

import java.util.stream.Stream;

public class EpsilonStringCalculator {
    public int add(String s){

        if(s.isEmpty()) return 0;

    	return  Stream.of(s.split(",|\\n"))
                      .mapToInt(Integer::parseInt)
                      .sum();
    }
}
