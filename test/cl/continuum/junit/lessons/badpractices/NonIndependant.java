package cl.continuum.junit.lessons.badpractices;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class NonIndependant {
	private List<String> list = new ArrayList<String>();
	
	@Test
	public void empty() {
		assertTrue(list.isEmpty());
	}
	
	@Test
	public void add() {
		list.add("Hola");
		list.add("Chao");
		assertEquals(2, list.size());
	}
}
