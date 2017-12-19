package com.sixdelta;


public class AlfaStringCalculator
{
	int add(String n){
		String[] val = n.replaceAll("\n",",").split(",");
		int suma=0;
		for (int i = 0; i<val.length; i++) {
			if(val[i]!=","){
				suma+=Integer.parseInt(val[i]);
			}
		}
		return suma;//Integer.parseInt(n);
	}
}
