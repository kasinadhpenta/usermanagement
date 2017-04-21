package cgi;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {

	public void testAdd() {
		Calculator c = new Calculator();		
		assertEquals(3.0, c.add(1, 2));
	}

	public void testMultiply() {
		Calculator c = new Calculator();
		assertEquals(2.0, c.multiply(1, 2));
	}
	public void testDivision() {
		Calculator c = new Calculator();
		assertEquals(2.0, c.division(4, 2));
	}
}
