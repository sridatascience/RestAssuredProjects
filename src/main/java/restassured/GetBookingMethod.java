package restassured;

import io.restassured.RestAssured;

public class GetBookingMethod {

	public static void main(String[] args) {
		
		//Build Request
		RestAssured
		.given()
			.log()
			.all()
			.baseUri("https://restful-booker.herokuapp.com/")
			.basePath("booking/{id}")
			.pathParam("id", 1)
		//Hit the request and get the response
		.when()
			.get()
		//validate the response
		.then()
			.log()
			.all()
			.statusCode(200);
		
			
		
		
		
		
		

	}

}
