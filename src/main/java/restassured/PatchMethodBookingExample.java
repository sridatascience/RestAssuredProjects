package restassured;

import io.restassured.RestAssured;

public class PatchMethodBookingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured
		.given()
			.log()
			.all()
			.baseUri("https://restful-booker.herokuapp.com/")
			.basePath("booking/1")
			.header("Content-Type","application/json")
			.header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
			.body("{\r\n"
					+ "    \"firstname\" : \"James\",\r\n"
					+ "    \"lastname\" : \"Brown\"\r\n"
					+ "}")
		.when()
			.patch()
		.then()
			.log()
			.all()
			.assertThat()
			.statusCode(200);

	}

}
