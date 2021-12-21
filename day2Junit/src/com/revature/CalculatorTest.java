package com.revature;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class CalculatorTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before ALL");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After ALL");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before Each");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After Each");
	}

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}

	@Test
	public void additionTest() {
		// For JUnit 4 and below
//	  Assert.assertEquals(4, Calculator.addNumbers(2,2));
		// for JUnit 5
		Assertions.assertEquals(4, Calculator.addNumbers(2, 2));
	}

}
