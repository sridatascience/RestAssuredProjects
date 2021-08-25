package restassured;

import io.restassured.RestAssured;
//There are some static packages and so this import
import static io.restassured.RestAssured.*;

public class BasicsRestAssured {

	public static void main(String[] args) {

		// validate if APIPlace API is working as expected
		// Rest Assured works with given when and then

		// given all the details
		// when submit the API
		// then validate the response
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		given().log()
		.all()
		.queryParams("key", "qaclick123")
		.header("Content-Type", "application/json")
		.body("{\r\n" + "  \"location\": {\r\n" + "    \"lat\": -38.383494,\r\n" + "    \"lng\": 33.427362\r\n"
						+ "  },\r\n" + "  \"accuracy\": 50,\r\n" + "  \"name\": \"Frontline house\",\r\n"
						+ "  \"phone_number\": \"(+91) 983 893 3937\",\r\n"
						+ "  \"address\": \"29, side layout, cohen 09\",\r\n" + "  \"types\": [\r\n"
						+ "    \"shoe park\",\r\n" + "    \"shop\"\r\n" + "  ],\r\n"
						+ "  \"website\": \"http://rahulshettyacademy.com\",\r\n" + "  \"language\": \"French-IN\"\r\n"
						+ "}\r\n" + "")
		.when()
		.post("/maps/api/place/add/json")
		.then()
		.log()
		.all()
		.assertThat()
		.statusCode(200);
		
		

	}

}
