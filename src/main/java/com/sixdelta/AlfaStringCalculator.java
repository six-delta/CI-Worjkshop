package com.sixdelta;


public class AlfaStringCalculator
{
	int add(String stringToEvaluate){
		String[] separatedValues = stringToEvaluate.replaceAll("[^\\.0-9]",",").split(",");
		int additionResult=0;
		for (int i = 0; i<separatedValues.length; i++) {
			if(separatedValues[i] != "," && !separatedValues[i].equals("")){
				additionResult+=Integer.parseInt(separatedValues[i]);
			}
		}
		return additionResult;
	}
}
