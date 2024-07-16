package com.demo.rest_asured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Get {
@Test
public void test1() {
	Response response = RestAssured.get("https://reqres.in/api/users?page=2");
	System.out.println(response.getStatusCode());
	System.out.println(response.time());
}
}
