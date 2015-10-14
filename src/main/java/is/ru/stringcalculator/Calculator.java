package is.ru.stringcalculator;
import java.util.*;

public class Calculator {

	public static int add(String text){
	
		if(text.equals("")){
			return 0;
		}
		if(text.equals(",")){
			
			String [] numbers = text.split(",");
			

			int result = 0;
			for(String number : numbers){
				result += Integer.parseInt(number);
			}
			return result;
			
		}

		
		return Integer.parseInt(text);



	}


}