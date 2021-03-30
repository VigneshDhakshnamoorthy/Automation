package api.samples;
import static io.restassured.RestAssured.*;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class api_test_1 {

	@Test
	public void rest_api_1() {
		
		Response rep = RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println("Status Code : "+rep.getStatusCode());
		System.out.println("Time : "+rep.getTime());
		System.out.println(rep.getBody().asString());
		List email = rep.jsonPath().getList("data.email");
		System.out.println("\nEmail List");
		for (Object ema : email) {
			System.out.println(ema.toString().replace("@reqres.in", ""));
		}

	}
	 




}
