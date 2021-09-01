package com.oracle.algo.numberchallenge;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class TestApp extends TestCase {

	@Test
	public final void testMain() {
		char inputNumber[] = {'9','8','8','0','6','1'};
		App.getNextLargestValue(inputNumber);
		char result[] = {'9','8','8','1','0','6'};
		Assert.assertArrayEquals(result, inputNumber);
	}
	
	@Test
	public final void AlreadySorted() {
		char inputNumber[] = {'9','8','8','7','6','1'};
		App.getNextLargestValue(inputNumber);
		char result[] = {'9','8','8','7','6','1'};
		Assert.assertArrayEquals(result, inputNumber);
	}
	
	@Before
    public void setUp() {
        char incorrectValue[] = {'x','9','0','o'};
        assertEquals(false,App.validateInput(incorrectValue));
    }

}
