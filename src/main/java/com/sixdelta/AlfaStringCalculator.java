package com.sixdelta;


public class AlfaStringCalculator
{
	int add(String stringToValue){
		if(stringToValue.isEmpty()) return 0;
		String regexValue = "([^\\-.0-9])";
		String[] separatedValues = stringToValue.replaceAll(regexValue,",").split(",");
		int aditionResult = 0;
		for (int i = 0; i<separatedValues.length; i++) {
			if(separatedValues[i] != "," && !separatedValues[i].equals("")){
				aditionResult += Integer.parseInt(separatedValues[i]);
			}
		}
		return aditionResult;
	}
}
