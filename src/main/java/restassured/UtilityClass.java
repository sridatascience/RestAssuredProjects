package restassured;

import static restassured.UtilityMethods.*;
import static java.lang.System.*;
public class UtilityClass {
	
    //The Dependent file is UtilityClass.java 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//If the utility methods are non static then we create an object and call the methods
//		UtilityMethods obj = new UtilityMethods();
//		obj.add(5, 6);
//		obj.printSomeThing();
		
		//If the utility method is static we call the method directly using the Class name
//		UtilityMethods.add(50, 60);
//		UtilityMethods.printSomeThing();
		
		// if we do a static import of the UtilityMethod, we can directly call the methods.
		
		add(5, 6);
		printSomeThing();
		System.out.println(salary);
		out.println("salary");
		
		//By doing static important, we can import public static methods as well as variables.
		
		

	}

}
