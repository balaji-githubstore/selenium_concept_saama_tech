package com.sw.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class PostPetShopTest {

	public static String baseUrl="https://petstore.swagger.io/v2/";

	/**
	 * Post - Json as a string
	 */
	@Test
	public void addValidPetTest()
	{
		String resource="pet";
		
		String response=RestAssured
		.given().header("Content-Type","application/json").body("{\r\n"
				+ "    \"id\": 9051,\r\n"
				+ "    \"category\": {\r\n"
				+ "        \"id\": 0,\r\n"
				+ "        \"name\": \"string-9051\"\r\n"
				+ "    },\r\n"
				+ "    \"name\": \"doggie\",\r\n"
				+ "    \"photoUrls\": [\r\n"
				+ "        \"string\"\r\n"
				+ "    ],\r\n"
				+ "    \"tags\": [\r\n"
				+ "        {\r\n"
				+ "            \"id\": 0,\r\n"
				+ "            \"name\": \"string\"\r\n"
				+ "        }\r\n"
				+ "    ],\r\n"
				+ "    \"status\": \"available\"\r\n"
				+ "}")
		.when().post(baseUrl+resource)
		.then().statusCode(200).extract().asString();
		
		Reporter.log(response);
	}
	/*
	 * Read json from file and post request
	 */
	
	@Test
	public void addValidPet2Test() throws FileNotFoundException
	{
		FileInputStream file=new FileInputStream("test_data/newPet.json");
		
		JsonPath json=new JsonPath(file);
		String jsonBody=json.prettify();
		
		String resource="pet";
		
		String response=RestAssured
		.given().header("Content-Type","application/json").body(jsonBody)
		.when().post(baseUrl+resource)
		.then().statusCode(200).extract().asString();
		
		Reporter.log(response);
		
	}
	
	
	@Test
	public void readJsonTest() throws FileNotFoundException
	{
		FileInputStream file=new FileInputStream("test_data/newPet.json");
		
		JsonPath json=new JsonPath(file);
		
		System.out.println(json.get("id"));
		System.out.println(json.get("name"));
		System.out.println(json.get("status"));
		System.out.println(json.get("tags"));
	}
	
	
	
	
	@Test
	public void updateValidPetTest() throws FileNotFoundException
	{
		FileInputStream file=new FileInputStream("test_data/newPet2.json");
		
		JsonPath json=new JsonPath(file);
		String jsonBody=json.prettify();
		
		String resource="pet";
		
		String response=RestAssured
		.given().header("Content-Type","application/json").body(jsonBody)
		.when().put(baseUrl+resource)
		.then().statusCode(200).extract().asString();
		
		Reporter.log(response);
		
	}
	
	@Test
	public void deletePetTest() {
		
		String resource="pet/"+9085;
		
		RestAssured
		.given().header("api_key","988233H62")
//		.header("Authorization","Bearer 8778878734sdfdf44554242344343")
		
		.when().delete(baseUrl+resource)
		.then().statusCode(200);
		
	}
	
}
