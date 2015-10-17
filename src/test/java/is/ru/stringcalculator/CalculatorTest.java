package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

	public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("src.CalculatorTest");
    }

    Calculator calculator = new Calculator();

	@Test
	public void testOneNumber()throws Exception {
		assertEquals(2, calculator.add("2"));
	}
	
	@Test
	public void testEmptyString() throws Exception{
		assertEquals(0, calculator.add(""));
	}

	@Test
	public void testmanyNumbers()throws Exception {
		assertEquals(6, calculator.add("1,2,3"));	
	}
	
	@Test
	public void testNewLine() throws Exception{
		assertEquals(6,calculator.add("1\n2,3"));	
	}
	@Test
	public void testDelimiter() throws Exception {
		assertEquals(3,calculator.add("//;\n1;2"));	
	}
	@Test
	public void testNegativesThrowsException()throws Exception {
		try {
			calculator.add("6,-8");
		} catch (Exception e) {
			assertEquals("Negatives not allowed: -8", e.getMessage());
		
		}
	}
	@Test
	public void testIfNumbersAreThousendOrMore() throws Exception {
		assertEquals(2,calculator.add("1001,2"));	
	}

}