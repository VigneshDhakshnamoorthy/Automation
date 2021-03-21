package api.samples;
import static io.restassured.RestAssured.*;
import static java.util.concurrent.TimeUnit.MILLISECONDS;


public class api_test_1 {
	final static String url="http://demo.guru99.com/V4/sinkministatement.php?CUSTOMER_ID=68195&PASSWORD=1234!&Account_No=1";

	//This will fetch the response body as is and log it. given and when are optional here
	public static void getResponseBody(){
		System.out.println("Direct URL");
		given().when().get(url).then().log()
		.all();
		System.out.println();
		System.out.println("URL with Param");
		given().queryParam("CUSTOMER_ID","68195")
		.queryParam("PASSWORD","1234!")
		.queryParam("Account_No","1") .when().get("http://demo.guru99.com/V4/sinkministatement.php").then().log().body();
	}

	public static void getResponseStatus(){
		System.out.println();

		System.out.println("Status Code");
		int statusCode= given().queryParam("CUSTOMER_ID","68195")
				.queryParam("PASSWORD","1234!")
				.queryParam("Account_No","1")
				.when().get("http://demo.guru99.com/V4/sinkministatement.php").getStatusCode();
		System.out.println("The response status is "+statusCode);

		given().when().get(url).then().assertThat().statusCode(200);
	}




	public static void main(String[] args) {

		getResponseBody();
		getResponseStatus();

	}

}
