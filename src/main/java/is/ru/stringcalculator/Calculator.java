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
		
			 text =  SplitNewLine(splitDelimiters(text));
			 return Sum(SplitTheString(text));

			}catch (Exception e){
				throw e;
			}

		}else{
			try{
			
			String [] largeNum = SplitTheString(text);
			//text = SplitTheString(text);
			StringBuilder numLess = new StringBuilder();
			int checker = 0;
			for(String t : largeNum){
				int numberTemp = Integer.parseInt(t);
				if(numberTemp  < 1001){    
					numLess.append(t + ",");
					checker += 1;
				}
			}
			if(checker > 0){
				//numLess.toString();
				return Sum(SplitTheString(numLess.toString()));
			}
			else{
				return Sum(SplitTheString(text));
			}
			}catch (Exception e){
				throw e;
			}

		}
	}
	
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
			result += toInt(number);
		}
		if(negNum.length() > 0){
			negNum.setLength(negNum.length()-2);
			throw new Exception("Negatives not allowed: " + negNum);
		}
		return result;
	}
}
