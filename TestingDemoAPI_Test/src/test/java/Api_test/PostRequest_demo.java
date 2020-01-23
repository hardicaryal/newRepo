//BDD approch
 

package Api_test;


import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.assertion.BodyMatcher;

public class PostRequest_demo {
	
	public static HashMap map= new HashMap();
	
	@BeforeTest
	public void postData()
	{
		map.put("FirstName", "Hardic");
		map.put("LastName", "Aryal");
		map.put("UserName", "Hardic");
		map.put("Password", "Hardic");
		map.put("Email", "Hardic");
		
		RestAssured.baseURI="http://restapi.demoqa.com/customer";
		RestAssured.basePath="/register";
	}
	
	@Test
	public void postTest() {
		given()
			.contentType("application/json")
			.body(map)
			
		.when()
			.post()
			
		.then()
			.statusCode(201)
			.body("SuccessCode", equalTo("OPERATION_SUCCESS"))
			.body("Message",equalTo("Operation completed successfully"));
		
			
			
}

}
 