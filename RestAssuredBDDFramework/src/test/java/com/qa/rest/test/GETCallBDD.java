package com.qa.rest.test;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GETCallBDD {

	@Test
	public void test_numberOfCircuitsFor2017_Season(){
	/*	given().
		when().
		then().
*/		
		given().
		when().
		get("http://ergast.com/api/f1/2017/circuits.json").
		then().
		assertThat().
		statusCode(200).
		and().
		body("MRData.CircuitTable.Circuits.circuitId", hasSize(20));
		//and().header("content-length", equalTo("4551"));  
		

	}
	
	
}
