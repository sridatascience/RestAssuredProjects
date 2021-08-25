package restassured;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MethodChainingExample {
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Apple","Orange","Banana","Grape");
		
		List<String> customerName = new ArrayList();
		
		for(String s: names) {
			String newName = s +"fruit";
			customerName.add(newName);
		}
		
		System.out.println("BEfore----"+names);
		System.out.println("After----"+customerName);
		
		//---------------------------------------------
		
//		Stream<String> namesStream = names.stream();
//		
//		Stream<String> nameMapStream = namesStream.map(e-> e + "Fruit" );
//		
//		List<String> newName = nameMapStream.collect(Collectors.toList());
//		
//		System.out.println(newName);
		
		//The equivalent of above all 4 methods is this one line.
		
		List<String> newName =names.stream().map(e->e +"Fruit").collect(Collectors.toList());
		System.out.println(newName);
		
	}

}
