
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class HTTPRequest {
	
	int id;
	/*given()
	   content type, set cookies, add auth, add params, set headers, etc...
	when()
	    get, post, put, delete
	then
	  validation status code, extract response, extract header cookies and response body...
	*/
@Test (priority = 1)
public void getUsers() {
	given()
	.when()
	.get("https://reqres.in/api/users?page=2")
	.then()
	.statusCode(200)
	.body("page", equalTo(2))
	.log(). all();
}
@Test (priority = 2)
public void createUser() {
	HashMap<String, String> data=new HashMap<>();
	data.put("name" , "morpheus");
	data.put("job", "leader");
	
	id=given()
	.contentType("application/json")
	.body(data)
	.when()
	.post("https://reqres.in/api/users")
	.jsonPath().getInt("id");
	/*.then()
	.statusCode(201)
	.log().all();*/
}
@Test (priority = 3, dependsOnMethods = {"createUser"})
public void updateUser() {
	HashMap<String, String> data=new HashMap<String, String>();
	data.put("name" , "sahoo");
	data.put("job", "lead");
	given()
	.body(data)
	.when()
	.put("https://reqres.in/api/users/"+id)
	.then()
	.statusCode(200)
	.log().all();
}
@Test (priority = 4, dependsOnMethods = {"updateUser"})
public void deleteUser() {
	when()
     .delete("https://reqres.in/api/users/"+id)
.then()
.statusCode(204);
}
}
