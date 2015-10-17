package is.ru.stringcalculator;
import java.util.*;
import java.lang.StringBuilder;

public class Calculator {
	public  int add(String text) throws Exception{

		if(text.equals("")){
			return 0;
		}
		else if(text.startsWith("//" ) | text.contains("\n") ){
			
			
			try{
			
			if(text.contains("[")){
				
				String textAfter[] = text.split("\n" , 2);
				int endOFDel = textAfter[0].indexOf(']', 3);
				
				String delimiter = textAfter[0].substring(3, endOFDel);

				//String number= text.substring(endOFDel + 2);
				
				//String[] splitstring = number.split(delimiter);
				String numbers[] = textAfter[1].split(delimiter);
				return Sum(numbers);
			}
			else{
				text =  SplitNewLine(splitDelimiters(text));
			}	
			 return Sum(SplitTheString(text));

			}catch (Exception e){
				throw e;
			}

		}
		else{			
				return Sum(SplitTheString(text));
			}
		}
	/*private  String splitDelimitersAnyLenght(String numbers){
    numbers = numbers.split("\n", 2);
    String result = numbers.replaceAll("[\\*\\-\\+\\.\\^:,?]","");
    StringBuilder tokens = new StringBuilder(); // here i will save tokens
    for(int i = 0; i <= numbers.length(); i++){
        tokens.append(numbers.replaceAll(regexp, ""));
    }
    String bla = tokens.toString();
    bla = bla.substring(2, bla.length());
    bla = bla.trim();
    System.out.println(bla);	
    return bla;
}*/

			
	
	private  String splitDelimiters(String numbers){
			String [] textAfter = numbers.split("\n");
			if(textAfter[1].contains(";")){
				numbers = textAfter[1].replace(";",",");
			}
			return numbers;
	}



	private  String[] SplitTheString(String numbers){
		return numbers.split(",");
	}
	private  String SplitNewLine(String numbers){		
		return numbers.replace("\n", ",");
	}
	private  int toInt(String numbers){
		return Integer.parseInt(numbers);
	}
	

	private int Sum(String[] numbers) throws Exception{
		int result = 0;
		int num = 0;
		StringBuilder negNum = new StringBuilder();
		for(String number : numbers){
			num = toInt(number);
			if(num < 0){
				negNum.append(num + ", ");
			}
			else if(num < 1001){
				result += toInt(number);
			}		
		}
		if(negNum.length() > 0){
			negNum.setLength(negNum.length()-2);
			throw new Exception("Negatives not allowed: " + negNum);
		}
		return result;
	}
}


