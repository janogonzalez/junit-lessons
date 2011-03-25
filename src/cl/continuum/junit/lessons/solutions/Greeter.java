package cl.continuum.junit.lessons.solutions;

public class Greeter {
	public static String sayHello(String to) {
		if (to == null || to.trim().length() == 0) {
			to = "World";
		}
		
		return "Hello " + to + "!";
	}
}
