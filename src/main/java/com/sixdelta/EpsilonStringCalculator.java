package com.sixdelta;

import java.util.stream.Stream;

public class EpsilonStringCalculator {
    public int add(String s){

        if(s.isEmpty()) return 0;

        String delim = ",|\\n";

        if(s.startsWith("//")) {
            delim = s.substring(2,s.indexOf("\n") );
            s = s.substring(s.indexOf("\n")+1);
        }

    	return  Stream.of(s.split(delim))
                      .mapToInt(Integer::parseInt)
                      .sum();
    }
}
