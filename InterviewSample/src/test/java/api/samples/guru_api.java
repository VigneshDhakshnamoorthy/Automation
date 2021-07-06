package api.samples;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

public class guru_api {
	public static void main(String[] args) {
		getResponseBody();
		getResponseStatus();
		getResponseHeaders();
		getResponseTime();
		getResponseContentType();
		getSpecificPartOfResponseBody();
	}
	final static String url="http://demo.guru99.com/V4/sinkministatement.php?CUSTOMER_ID=68195&PASSWORD=1234!&Account_No=1";
	public static void getResponseBody(){
		System.out.println("----------final url----------");
		given().when().get(url).then().log()
		.all();
		System.out.println();
		System.out.println("----------param url----------");
		given().queryParam("CUSTOMER_ID","68195")
		.queryParam("PASSWORD","1234!")
		.queryParam("Account_No","1") .when().get("http://demo.guru99.com/V4/sinkministatement.php").then().log().body();
	}

	public static void getResponseStatus(){
		int statusCode= given().queryParam("CUSTOMER_ID","68195")
				.queryParam("PASSWORD","1234!")
				.queryParam("Account_No","1")
				.when().get("http://demo.guru99.com/V4/sinkministatement.php").getStatusCode();
		System.out.println();
		System.out.println("----------statusCode----------");
		System.out.println("The response status is "+statusCode);

		given().when().get(url).then().assertThat().statusCode(200);
	}
	
	public static void getResponseHeaders(){
		System.out.println();
		System.out.println("----------The headers----------");
		System.out.println("The headers in the response "+
				get(url).then().extract()
				.headers());
	}
	
	public static void getResponseTime(){
		System.out.println();
		System.out.println("----------time taken----------");
		  System.out.println("The time taken to fetch the response "+get(url)
		         .timeIn(TimeUnit.MILLISECONDS) + " milliseconds");
		}

	
	public static void getResponseContentType(){
		System.out.println();
		System.out.println("----------content type----------");
		   System.out.println("The content type of response "+
		           get(url).then().extract()
		              .contentType());
		}
	
	public static void getSpecificPartOfResponseBody(){
		System.out.println();
		System.out.println("----------result.statements.AMOUNT----------");

	

	
	
}
}


