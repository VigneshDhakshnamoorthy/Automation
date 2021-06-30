package api.samples;
import static io.restassured.RestAssured.*;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class api_test_1 {
	String url = "https://reqres.in/api/users?page=2";
	@Test (priority=2)
	public void rest_api_1() {

		System.out.println("\nFull form ");
		Response rep = RestAssured.get(url);
		System.out.println("Status Code : "+rep.getStatusCode());
		System.out.println("Time : "+rep.getTime());
		System.out.println(rep.getBody().asString());
		List email = rep.jsonPath().getList("data.email");
		System.out.println("\nEmail List");
		for (Object ema : email) {
			System.out.println(ema.toString().replace("@reqres.in", ""));
		}

	}

	@Test (priority=1)
	public void rest_api_2() {
		System.out.println("\nEmail List by short form ");
		List<String> email = get(url).jsonPath().getList("data.email");
		for (Object ema : email) {
			System.out.println(ema.toString());
		}

	}
	@Test (priority=3)
	public void rest_api_3() {
		System.out.println("\nShort form ");
		given().when().get(url).then().assertThat().statusCode(200);
		given().when().get(url).then().log()
		.all();
		
	}



}
