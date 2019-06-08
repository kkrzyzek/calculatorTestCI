package calculator;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	Calculator calc;
	
	@Before
	public void setup() {
		calc = new Calculator();
	}
	
	@Test
	public void testAdd() {
		assertEquals(5, calc.add(2,3));
	}
	
	@Test
	public void testSubtract() {
		assertEquals(12, calc.subtract(15,3));
	}
	
	@Test
	public void testMultiply() {
		assertEquals(6, calc.multiply(2,3));
	}
	
	@Test
	public void testDivide() {
		assertEquals(2, calc.divide(6,3));
	}

}
