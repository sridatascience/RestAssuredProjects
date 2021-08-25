package restassured;

import io.restassured.RestAssured;

public class PathParameterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured
		.given()
			.log()
			.all()
			.baseUri("https://restful-booker.herokuapp.com/")
			.basePath("{basePath}/{bookingId}")
			.pathParam("basePath", "booking")
			.pathParam("bookingId", 2)
		.when()
			.get()
		.then()
			.log()
			.all()
			.assertThat()
			.statusCode(200);
		
		/*----------------------------------------------------*/
		RestAssured
		.given()
			.log()
			.all()			
		.when()
			.get("https://restful-booker.herokuapp.com/{basePath}/{bookingId}","booking",2)
		.then()
			.log()
			.all()
			.assertThat()
			.statusCode(200);
		
		/*---------------------------------------------------*/
		RestAssured
		.given()
			.log()
			.all()
			.pathParam("basePath", "booking")	
		.when()
			.get("https://restful-booker.herokuapp.com/{basePath}/{bookingId}",2) //inline parameters
		.then()
			.log()
			.all()
			.assertThat()
			.statusCode(200);
		
		/*---------------------------------------------------*/
		/*---------------------------------------------------*/
		System.out.println("%%%%%%%%%Last Rest Assured option%%%%%%%%%%%%");
		
		RestAssured
		.given()
			.log()
			.all()
			//pathparams will never work on the base url , they are applicable only after "/" of the base url
			//you cannot have any variables  for the base url
			//the base url cannot have a variable.			
			.pathParam("basePath", "booking")	
		.when()
			//base path will be replaced by booking and the second variable will be replaced by 2 and the last value ignored 
		    // any number of values after  2 will be ignored.
			.get("https://restful-booker.herokuapp.com/{basePath}/{bookingId}",2,"token") //inline parameters
		.then()
			.log()
			.all()
			.assertThat()
			.statusCode(200);
		

	}

}
