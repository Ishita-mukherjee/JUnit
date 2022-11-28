package com.acc.lkm.test;

import static org.junit.Assert.*;
import org.junit.jupiter.api.*;

public class Assertions {
	
	@DisplayName("Assertion Examples Test")
	@Test
	public void testAssertions() {
		
		// test data
		String sValue1 = new String("Junit5");
		String sValue2 = new String("Junit5");
		String sValue3 = null;
		String sValue4 = "Junit5";
		String sValue5 = "Junit5";

		int iValue1 = 100;
		int iValue2 = 200;

		String array1[] = { "bus", "car", "bike" };
		String array2[] = { "bus", "car", "bike" };

		// Validate two strings are equal
		assertEquals(sValue1, sValue2);
		
		// overloaded method with failure message
		assertEquals(sValue1, sValue2, "Values are not equal");

		// Validate condition is true
		assertTrue(iValue1 < iValue2);
		
		// Validate condition is false
		assertFalse(iValue1 > iValue2);

		// Validate object is not null
		assertNotNull(sValue1);

		// Validate object is null
		assertNull(sValue3);

		// Validate if two objects are same
		assertSame(sValue4, sValue5);

		// Validate if two objects are not same
		assertNotSame(sValue1, sValue3);

		// Validate equality of two arrays
		assertArrayEquals(array1, array2);

		//Forcefully failing a Assertion
		fail("Marked Assertion Failure");
	

	}
	

}
