package com.sixdelta;


public class AlfaStringCalculator
{
	int add(String stringToValue){
		String[] separatedValues = stringToValue.replaceAll("[^\\.0-9]",",").split(",");
		int aditionResult = 0;
		for (int i = 0; i<separatedValues.length; i++) {
			if(separatedValues[i] != "," && !separatedValues[i].equals("")){
				aditionResult += Integer.parseInt(separatedValues[i]);
			}
		}
		return aditionResult;//Integer.parseInt(n);
	}
}
