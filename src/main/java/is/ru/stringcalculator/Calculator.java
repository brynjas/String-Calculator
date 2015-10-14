package is.ru.stringcalculator;
import java.util.*;

public class Calculator {

	public static int add(String text){
	
		if(text.equals("")){
			return 0;
		}
		
		return Integer.parseInt(text);



	}


}