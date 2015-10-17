package is.ru.stringcalculator;
import java.util.*;

public class Calculator {

	public  int add(String text) throws Exception{

		if(text.equals("")){
			return 0;
		}
		else if(text.startsWith("//")){
			try{
		
			 text = splitDelimiters(text);
			 return Sum(SplitTheString(text));
			}catch (Exception e){
				throw e;
			}
		}
		else if(text.contains("\n")){
			try{
			text =  SplitNewLine(text);
			return Sum(SplitTheString(text));
			}catch (Exception e){
				throw e;
			}

		}
		else if(text.contains(",")){
			try{
			return Sum(SplitTheString(text));
		}catch (Exception e){
				throw e;
			}		
		}
		
		else{

			return Integer.parseInt(text);
		}
	}

	private  String splitDelimiters(String numbers){
			String [] textAfter = numbers.split("\n");
			
			//String textAfter = textTemp[1];
			if(textAfter[1].contains(";")){
				numbers = textAfter[1].replace(";",",");
			}
			return numbers;
	}
	private  String[] SplitTheString(String numbers){
		return numbers.split(",");
	}
	private  String SplitNewLine(String numbers){
		//return numbers("\n");
		
		return numbers.replace("\n", ",");
	}
	private  int toInt(String numbers){
		return Integer.parseInt(numbers);
	}
	
	private int Sum(String[] numbers) throws Exception{
		int result = 0;
		int num = 0;
		for(String number : numbers){
			num = toInt(number);
			if(num < 0){
				throw new Exception("Negatkkkk");
			}
			result += toInt(number);
			
		}
		return result;

	}
	
	}
