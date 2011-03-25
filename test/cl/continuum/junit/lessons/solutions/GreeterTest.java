package cl.continuum.junit.lessons.solutions;

import static org.junit.Assert.*;

import org.junit.Test;

public class GreeterTest {
	@Test
	public void sayHello() {
		String expected = "Hello Jano!";
		String actual = Greeter.sayHello("Jano");
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void sayHello_emptyString() {
		String expected = "Hello World!";
		String actual = Greeter.sayHello("");
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void sayHello_nullString() {
		String expected = "Hello World!";
		String actual = Greeter.sayHello(null);
		
		assertEquals(expected, actual);
	}
}
