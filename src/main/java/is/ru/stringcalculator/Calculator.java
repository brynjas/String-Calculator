package is.ru.stringcalculator;
import java.util.*;
import java.util.regex.Pattern;

public class Calculator {


	public static int add(String text){
		//text = "//;\n1,2";
		//String delim = "!()\\;//-?|^~";
	
		if(text.equals("")){
			return 0;
		}
		
		else if(text.startsWith("//")){
			
			String [] textAfter = text.split("\n");
			//String textAfter = textTemp[1];
			if(textAfter[1].contains(";")){
				text = textAfter[1].replace(";",",");
				return Sum(SplitTheString(text));
			}


			//text = text.replaceFirst("//;\n","");
			//text = text.replace(";",",");
			//text = text.replaceAll("[\\s\\;]", "_");
			//return Sum(SplitTheString(text));
			//text = text.
			//text = SplitNewLine(text);
			 return Sum(SplitTheString(text));

		}
		else if(text.contains("\n")){
			
			text =  SplitNewLine(text);
			return Sum(SplitTheString(text));
		}

		else if(text.contains(",")){
			
			return Sum(SplitTheString(text));
		}
		
		else{

			return Integer.parseInt(text);
		}
	}
	/*private static String[] splitDelimiters(String numbers){
		return numbers.replace("//;\n1;2" , ",");
	}*/
	private static String[] SplitTheString(String numbers){
		return numbers.split(",");
	}
	private static String SplitNewLine(String numbers){
		//return numbers("\n");
		
		return numbers.replace("\n", ",");
	}
	private static int toInt(String numbers){
		return Integer.parseInt(numbers);
	}
	
	private static int Sum(String[] numbers){
		int result = 0;
		for(String number : numbers){
				result += toInt(number);
		}
		return result;
	}


}