package com.sixdelta;

import java.util.stream.Stream;

public class EpsilonStringCalculator {
    public int add(String theStringToAdd) throws RuntimeException{

        if(theStringToAdd.isEmpty()) return 0;
        if(theStringContainsNegativeValues(theStringToAdd)) throw new RuntimeException();

        String delim = ",|\\n";

        if(theStringContainsAnOptionalDelimiter(theStringToAdd)) {
            delim = extractTheDelimiterFromTheString(theStringToAdd);
            theStringToAdd = removingTheSeparatorIndicatorFromTheString(theStringToAdd);
        }
        
    	return theSumOfNumbersInTheStringWithDelimiter(theStringToAdd, delim);
    }

    private boolean theStringContainsAnOptionalDelimiter(String theString){
      return theString.startsWith("//");
    }

    private String extractTheDelimiterFromTheString(String theString){
      return theString.substring(2,theString.indexOf("\n") );
    }

    private String removingTheSeparatorIndicatorFromTheString(String theString){
      return theString.substring(theString.indexOf("\n")+1);
    }

    private int theSumOfNumbersInTheStringWithDelimiter(String theString, String delim){
      return Stream.of(theString.split(delim))
        .mapToInt(Integer::parseInt)
        .sum();
    }

    private boolean theStringContainsNegativeValues(String theString){
        return theString.contains("-");
    }
}
