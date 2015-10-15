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
	
	@Test
	public void testEmptyString() {
		assertEquals(0, Calculator.add(""));
	}

	@Test
	public void testmanyNumbers() {
		assertEquals(6, Calculator.add("1,2,3"));	
	}
	
	@Test
	public void testNewLine() {
		assertEquals(6,Calculator.add("1\n2,3"));	
	}
}