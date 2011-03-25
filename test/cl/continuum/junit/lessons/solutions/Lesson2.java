package cl.continuum.junit.lessons.solutions;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Lesson2 {
	private List<String> list;
	
	@Before
	public void setUp() {
		list = new ArrayList<String>();
	}
	
	@Test
	public void newList() {
		assertNotNull(list);
	}
}
