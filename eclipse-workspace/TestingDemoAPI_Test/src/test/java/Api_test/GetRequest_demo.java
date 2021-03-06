package Api_test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

public class GetRequest_demo {

	@Test
	public void getWeatherDetails() {

		given()
		.when()
			.get("http://restapi.demoqa.com/utilities/weather/city/Hyderabad")
		.then()
				.statusCode(200)
				//.statusLine("HTTP/1.1/ 200 OK")
				.assertThat().body("City", equalTo("Hyderabad"))
				.header("Content-Type", "application/json");

	}
}
