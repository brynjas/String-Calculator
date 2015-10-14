package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

	public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("src.CalculatorTest");
    }



	@Test
	public void testOneNumber() {
		assertEquals(2, Calculator.add("2"));
	}
	


}