package restassured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CreateBookingPOST {

	public static void main(String[] args) {
		
		

		// Build request
		RequestSpecification rs1 = RestAssured.given();
		RequestSpecification rs = rs1.log().all();
		rs.baseUri("https://restful-booker.herokuapp.com/");
		rs.basePath("booking");

		rs.body("{\r\n" + "    \"firstname\" : \"Jim\",\r\n" + "    \"lastname\" : \"Brown\",\r\n"
				+ "    \"totalprice\" : 111,\r\n" + "    \"depositpaid\" : true,\r\n" + "    \"bookingdates\" : {\r\n"
				+ "        \"checkin\" : \"2018-01-01\",\r\n" + "        \"checkout\" : \"2019-01-01\"\r\n"
				+ "    },\r\n" + "    \"additionalneeds\" : \"Breakfast\"\r\n" + "}");

		// rs.contentType("application/json");
		// this or that
		rs.contentType(ContentType.JSON);

		// Hit request and get response
		Response response = rs.post();

		// validate response
		ValidatableResponse validateResponse = response.then().log().all();
		validateResponse.statusCode(200);
		
		
		
		//Taken from
		//https://restful-booker.herokuapp.com/apidoc/index.html#api-Booking-CreateBooking
		//using method chaining and BDD logic
		
		/*------------------------------------------------------------------------------*/
		
		//Build the request
		RestAssured.given()
		.log().all()
		.baseUri("https://restful-booker.herokuapp.com/")
		.basePath("booking")
		.body("{\r\n"
				+ "    \"firstname\" : \"Jim\",\r\n"
				+ "    \"lastname\" : \"Brown\",\r\n"
				+ "    \"totalprice\" : 111,\r\n"
				+ "    \"depositpaid\" : true,\r\n"
				+ "    \"bookingdates\" : {\r\n"
				+ "        \"checkin\" : \"2018-01-01\",\r\n"
				+ "        \"checkout\" : \"2019-01-01\"\r\n"
				+ "    },\r\n"
				+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
				+ "}")
		.contentType(ContentType.JSON)
		//Hit the response
		.post()
		//Validate the response
		.then()
		.log().all()
		.statusCode(200);
		
		/*-------------------------------------------------------------------------*/
		//BDD logic is used here too
		
		RestAssured
		.given()
			.log()
			.all()
			.baseUri("https://restful-booker.herokuapp.com/")
			.basePath("booking")
			.body("{\r\n"
					+ "    \"firstname\" : \"Jim\",\r\n"
					+ "    \"lastname\" : \"Brown\",\r\n"
					+ "    \"totalprice\" : 111,\r\n"
					+ "    \"depositpaid\" : true,\r\n"
					+ "    \"bookingdates\" : {\r\n"
					+ "        \"checkin\" : \"2018-01-01\",\r\n"
					+ "        \"checkout\" : \"2019-01-01\"\r\n"
					+ "    },\r\n"
					+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
					+ "}")
			.contentType(ContentType.JSON)
		.when()
			.post()
		.then()
			.log()
			.all()
			.assertThat()
			.statusCode(200);
			

	}

}
