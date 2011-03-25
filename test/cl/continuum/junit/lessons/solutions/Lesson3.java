package cl.continuum.junit.lessons.solutions;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.matchers.JUnitMatchers.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Lesson3 {
	@Test
	public void asList() {
		List<String> list = Arrays.asList(new String [] {"hola"});
		
		assertThat(list.size(), is(1));
	}
	
	@Test
	public void add() {
		List<String> list = new ArrayList<String>();
		list.add("hola");
		
		assertThat(list, hasItem("hola"));
	}
	
	@Test
	public void remove() {
		List<String> list = new ArrayList<String>(Arrays.asList(new String [] {"hola", "chao"}));
		list.remove(1);
		
		assertThat(list, both(hasItem("hola")).and(not(hasItem("chao"))));
	}
}
