package api.sample;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class apiTest_1 {
	
	@Test
	public void getWeather_normal() {
		Response response = get("https://reqres.in/api/users?page=2");
	
		System.out.println(response.getBody().toString());
		System.out.println(response.statusCode());
	
		
		
	}
	
	@Test
	public void getWeather_short() {
		
		
		System.out.println(given().get("https://reqres.in/api/users?page=2"));
		
		
	}

}
