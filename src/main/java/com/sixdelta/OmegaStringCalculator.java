package com.sixdelta;

public class OmegaStringCalculator{
  public int add(String  numbers){
  	int i=0;
  	int sum = 0;
    if (numbers.startsWith("//")){
      	String separador = numbers.substring(2,numbers.indexOf("\n"));
        numbers = numbers.substring(numbers.indexOf("\n")+1);
      	String[] partiendo = numbers.split(separador);
        for(i = 0; i < partiendo.length; i++){
          sum += Integer.parseInt(partiendo[i]);
        }
    }
    else{
      String[] partiendo = numbers.split(",|\\n");
      for(i = 0; i < partiendo.length; i++)
      sum += Integer.parseInt(partiendo[i]);
    }
	return sum;
  }
}
