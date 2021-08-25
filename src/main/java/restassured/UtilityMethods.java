package restassured;

public class UtilityMethods {
	// advantage is the static methods get loaded when the class loads

	public static int salary = 10000;

	public static void printSomeThing() {
		System.out.println("print something");

	}

	public static void add(int a, int b) {
		System.out.println("values " + a + b);
	}

}
