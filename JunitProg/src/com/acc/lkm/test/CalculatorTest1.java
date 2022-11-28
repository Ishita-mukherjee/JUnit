package com.acc.lkm.test;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.jupiter.api.*;

import com.acc.lkm.main.Calculator;

public class CalculatorTest1 {
	
	@Test
	public void testGetSum() {
		
		Calculator theCalculator = new Calculator();

		int a = 5;
		int b = 10;
		
		// Checks the sum of two (2) positive values
		assertEquals(15, (theCalculator.getSum(a, b)));
		assertEquals(15, (theCalculator.getSum(b, a)));

		a = -5;
		b = 10;
		
		// Checks the sum of a postive value and a negative value
		assertEquals(5, (theCalculator.getSum(a, b)));
		assertEquals(5, (theCalculator.getSum(b, a)));

		a = -5;
		b = -10;
		
		// Checks the sum of two (2) negative values
		assertEquals(-15, (theCalculator.getSum(a, b)));
		assertEquals(-15, (theCalculator.getSum(b, a)));
	}

	@Test
	public void testGetDifference() {
		
		Calculator theCalculator = new Calculator();

		int a = 3;
		int b = 2;
		
		// Checks if b is lesser than a
		assertEquals(1, (theCalculator.getDifference(a, b)));
		// Checks if b is greater than a
		assertEquals(-1, (theCalculator.getDifference(b, a)));

		a = 5;
		b = -4;
		
		// Checks if negative value is subtracted from positive value
		assertEquals(9, (theCalculator.getDifference(a, b)));
		// Checks if positive value is subtracted from negative value
		assertEquals(-9, (theCalculator.getDifference(b, a)));

		a = -10;
		b = -5;
		
		// Checks if negative value is subtracted from negative value: a > b
		assertEquals(-5, (theCalculator.getDifference(a, b)));
		
		// Checks if negative value is subtracted from negative value: b < a
		assertEquals(5, (theCalculator.getDifference(b, a)));
	}

	@Test
	@Disabled
	@DisplayName("Multiplication Test")
	public void testGetProduct() {
		
		Calculator theCalculator = new Calculator();

		int a = 5;
		int b = 10;
		// Checks the product of two (2) positive values
		assertEquals(50, (theCalculator.getProduct(a, b)));
		assertEquals(50, (theCalculator.getProduct(b, a)));

		a = -5;
		b = 10;
		// Checks the product of a positive value and a negative value
		assertEquals(-50, (theCalculator.getProduct(a, b)));
		assertEquals(-50, (theCalculator.getProduct(b, a)));

		a = -3;
		b = -10;
		// Checks the product of two (2) negative values
		assertEquals(30, (theCalculator.getProduct(a, b)));
		assertEquals(30, (theCalculator.getProduct(b, a)));
	}

	@Test
	@Disabled
	public void testGetQuotient() {
		
		Calculator theCalculator = new Calculator();


		int a = 10;
		int b = 5;
		// Checks if b is lesser than a
		assertEquals(2, (theCalculator.getQuotient(a, b)));
		

		a = 9;
		b = -3;
		// Checks if positive value is divided with negative value
		assertEquals(-3, (theCalculator.getQuotient(a, b)));
		// Checks if negative value is divided with positive value
		assertEquals(-0.33, (theCalculator.getQuotient(b, a)), 1);

		a = -10;
		b = -5;
		// Checks if negative value is divided with negative value: a > b
		assertEquals(2, (theCalculator.getQuotient(a, b)));
		
		
	}


}
