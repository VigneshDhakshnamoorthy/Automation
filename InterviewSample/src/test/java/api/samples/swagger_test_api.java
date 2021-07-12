package api.samples;

import java.util.ArrayList;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;


public class swagger_test_api {
	
	public static Response response;
    public static String jsonAsString;
	@Test
	public void api1_test()
	{   

			ArrayList<String> pets = RestAssured.given().when().get("https://petstore.swagger.io/v2/pet/findByStatus?status=available")
				.then().extract().path("pets.Pet.id");

		System.out.println(pets);
		
		

	}

	
}
