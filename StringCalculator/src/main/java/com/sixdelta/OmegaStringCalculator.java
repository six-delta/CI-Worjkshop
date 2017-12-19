package com.sixdelta;

public class OmegaStringCalculator{
  public int add(String  numbers){
    String separador = ",|\\n";
    if (theStringStartWithOptionalDelimiter(numbers)){
      	separador = getTheNewSeparator(numbers);
        numbers = getNewString(numbers);
        return getSumOfMyString(separador, numbers);
    }
    else
      return getSumOfMyString(separador, numbers);
  

}
  private int getSumOfMyString(String delimitador, String number){
    String[] partiendo = number.split(delimitador);
    int sum = 0;
    return theSumOfMyString(partiendo, sum);
  }

  private boolean theStringStartWithOptionalDelimiter(String numbers){
      return numbers.startsWith("//");
  }

  private String getTheNewSeparator(String numbers){
    return numbers.substring(2,numbers.indexOf("\n"));
  }

  private String getNewString(String numbers){
    return numbers.substring(numbers.indexOf("\n")+1);
  }

  private int theSumOfMyString(String[] partiendo, int sum){
    for(int i = 0; i < partiendo.length; i++){
      sum += Integer.parseInt(partiendo[i]);
    }
    return sum;
  }
  
}
