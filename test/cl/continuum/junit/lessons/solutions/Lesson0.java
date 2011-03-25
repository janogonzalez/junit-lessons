package cl.continuum.junit.lessons.solutions;

import static org.junit.Assert.*;

import org.junit.Test;

public class Lesson0 {
	@Test
	public void numbers() {
		int expected = 2;
		int actual = Math.max(1, 2);
		
		assertEquals(expected, actual);
	}
}
