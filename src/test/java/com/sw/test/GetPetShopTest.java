package com.sw.test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetPetShopTest {
	public static String baseUrl="https://petstore.swagger.io/v2/";

	/**
	 * Get - Path parameter
	 */
	@Test
	public void checkValidPetStatusCodeTest()
	{
		String resource="pet/9085";
		
		RestAssured
		.given()
		.when().get(baseUrl+resource)
		.then().statusCode(200);
	}
	
	@Test
	public void checkInvalidGetPetStatusCodeTest()
	{
		String resource="pet/9085";
		
		String response=RestAssured
		.given()
		.when().get(baseUrl+resource)
		.then().statusCode(404).extract().asString();
		
		Assert.assertTrue(response.contains("Pet not found"));
	}
	
	/**
	 * Get - Path parameter
	 */
	@Test
	public void checkValidPetResponseTest()
	{
		String resource="pet/905";
		
		String response=RestAssured
		.given()
		.when().get(baseUrl+resource)
		.then().statusCode(200).extract().asString();
		
		Reporter.log(response);
		System.out.println(response);
		
		Assert.assertTrue(response.contains("\"id\":88"),"Asserting id from the response");
		Assert.assertTrue(response.contains("doggie-450"),"Asserting name from the response");
	}
	
	@Test
	public void checkPetByStatusResponseTest()
	{
		String resource="pet/findByStatus";
//		https://petstore.swagger.io/v2/pet/findByStatus?status=sold
		
		String response=RestAssured
		.given().queryParam("status", "sold")
		.when().get(baseUrl+resource)
		.then().statusCode(200).extract().asString();
		
		Reporter.log(response);
	}
}
