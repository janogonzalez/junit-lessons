package cl.continuum.junit.lessons.badpractices;

import static org.junit.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.Properties;

import org.junit.Test;

/**
 * One of the worst possible tests ever
 * 
 * @author janogonzalez
 */
public class NonRepeatable {
	public static String PROPERTIES_FILE = "example.properties";
	@Test
	public void addProperty() throws Exception {
		Properties properties = new Properties();
		properties.load(new FileInputStream(PROPERTIES_FILE));
		properties.put(String.valueOf(new Date().getTime()), (new Date()).toString());
		properties.store(new FileOutputStream(PROPERTIES_FILE), "test");
		assertEquals(1, properties.size());  
	}
}
