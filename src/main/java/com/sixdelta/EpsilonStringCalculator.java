package com.sixdelta;

import java.util.stream.Stream;

public class EpsilonStringCalculator {
    public int add(String stringToAdd){

        if(stringToAdd.isEmpty()) return 0;

        String delim = ",|\\n";

        if(stringToAdd.startsWith("//")) {
            delim = stringToAdd.substring(2,stringToAdd.indexOf("\n") );
            stringToAdd = stringToAdd.substring(stringToAdd.indexOf("\n")+1);
        }

    	return  Stream.of(stringToAdd.split(delim))
                      .mapToInt(Integer::parseInt)
                      .sum();
    }
}
