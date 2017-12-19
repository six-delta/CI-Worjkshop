package com.sixdelta;


public class AlfaStringCalculator
{
	int add(String n){
		String[] val = n.replaceAll("[^\\.0-9]",",").split(",");
		int suma=0;
		for (int i = 0; i<val.length; i++) {
			if(val[i] != "," && !val[i].equals("")){
				suma+=Integer.parseInt(val[i]);
			}
		}
		return suma;//Integer.parseInt(n);
	}
}
