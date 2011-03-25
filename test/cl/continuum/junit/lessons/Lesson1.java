package cl.continuum.junit.lessons;

import static org.junit.Assert.*;

import org.junit.Test;

public class Lesson1 {
	@Test
	public void length() {
		int expected = 4;
		int actual = "Lalas".length();
		
		assertEquals(expected, actual);
	}
	
	/**
	 * Not the best way, see the endsWith() test
	 */
	@Test
	public void endsWith_usingEquals() {
		assertEquals(true, "abcd".endsWith("bc"));
	}
	
	@Test
	public void endsWith() {
		assertTrue("abcd".endsWith("bc"));
	}
	
	@Test
	public void endsWith_false() {
		assertFalse("abca".endsWith("a"));
	}
	
	@Test
	public void charAt_withNegativeIndex() {
		try {
			"lala".charAt(0);
			fail("An exception should have been thrown");
		} catch (Exception e) {
			assertTrue(e instanceof StringIndexOutOfBoundsException);
		}
	}
	
	@Test
	public void floatingPoint() {
		double expected = 1.414213562373095;
		double actual = Math.sqrt(2.0);
		
		assertEquals(expected, actual, 0.0000000000000001);
	}
	
	/**
	 * Not the best way, see the toCharArray() test
	 */
	@Test
	public void toCharArray_usingEquals() {
		char[] expecteds = new char[] { 'l', 'a', 'l', 'a' };
		char[] actuals = "lalas".toCharArray();
		
		assertEquals(expecteds.length, actuals.length);
		
		for (int i = 0; i < expecteds.length; i++) {
			assertEquals(expecteds[i], actuals[i]);
		}
	}
	
	@Test
	public void toCharArray() {
		char[] expecteds = new char[] { 'l', 'a', 'l', 'a' };
		char[] actuals = "lalas".toCharArray();
		
		assertArrayEquals(expecteds, actuals);
	}
	
	/**
	 * Not the best way, see the stringConstants() test
	 */
	@Test
	public void stringConstants_usingTrue() {
		String actual = "hola";
		String unexpected = "hola";
		String expected = new String("hola");
		
		assertTrue(expected == actual);
		assertFalse(unexpected == actual);
	}
	
	@Test
	public void stringConstants() {
		String actual = "hola";
		String unexpected = "hola";
		String expected = new String("hola");
		
		assertSame(expected, actual);
		assertNotSame(unexpected, actual);
	}
}
