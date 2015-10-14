package is.ru.stringcalculator;
import java.util.*;

public class Calculator {

	public static int add(String text){
	
		if(text.equals("")){
			return 0;
		}
		if(text.equals(",")){
			
			String [] numbers = SplitTheString(text);
			return Sum(numbers);
			
		}

		return Integer.parseInt(text);

	}


	private static String[] SplitTheString(String numbers){
		return numbers.split(",");
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