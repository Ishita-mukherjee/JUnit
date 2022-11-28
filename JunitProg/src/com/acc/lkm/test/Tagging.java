package com.acc.lkm.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;
import org.junit.jupiter.api.Tag;

public class Tagging {
	@Test
	@Tag("slow")
	public void test() {
		assertEquals(3, 3, "2 + 1 = 3");
		System.out.println("I am in test");
	}

	@Test
	@Tag("fast")
	public void test1() {
		assertEquals(2, 2, "1 + 1 = 2");
		System.out.println("I am in test1");
	}

}
