package com.sixdelta;

public class OmegaStringCalculator{
  public int add(String  numbers){
  	int i=0;
  	int sum = 0;
  	String[] partiendo = numbers.split(",|\\n");  
  	for(i = 0; i < partiendo.length; i++)
    sum += Integer.parseInt(partiendo[i]);
	return sum;
  }
}
