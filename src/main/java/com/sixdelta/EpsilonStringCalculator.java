package com.sixdelta;

import java.util.stream.Stream;

public class EpsilonStringCalculator {
    public int add(String s){

        if(s.isEmpty()) return 0;

<<<<<<< HEAD
    	return  Stream.of(s.split(",|\\n|//|;"))
=======
        String delim = ",|\\n";

        if(s.startsWith("//")) {
            delim = s.substring(2,s.indexOf("\n") );
            s = s.substring(s.indexOf("\n")+1);
        }

    	return  Stream.of(s.split(delim))
>>>>>>> 0b9075fc969a2d879e45ebb5bf68aeb1e73d649d
                      .mapToInt(Integer::parseInt)
                      .sum();
    }
}
