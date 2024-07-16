 
/*Different ways to create a post body
  1. Post request body using HashMap
  2. Post request body creation using Org.JSON
  3. Post request body creation using POJO class
  4. Post request body using external JSON file data
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;

import POJO.Post_POJO;
import POJO.Users;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DifferentWaysToCreatePostRequestBody {
int id;
//1. Post request body using HashMap
//@Test
public void createByHashMap() {
	HashMap<String, String> data=new HashMap<>();
	data.put("name", "morpheus");
	data.put("job", "leader");
	                                /*if there is data like courses=[java, python]
	                                  String courseArr[]= {"java","python"]
	                                  data.put("Courses", courseArr);*/
	id=given()
	.body(data.toString())
	.when()
	.post("https://reqres.in/api/users")
	.jsonPath().getInt("id");
	/*.then()
	.statusCode(201)
	//.body("name", equalTo("Ranjan"))
	.log().all();*/
	
}
//@Test
void delete() {
	when()
	.delete("https://reqres.in/api/users"+id)
	.then()
	.statusCode(204);
}
//2. Post request body creation using Org.JSON
//@Test
public void createByOrgJSON() {
	JSONObject data=new  JSONObject();
	data.put("name", "Ranjan");
	data.put("job", "leader");
	given()
	.contentType("application/json")
	.body(data.toString())
	.when()
	.post("https://reqres.in/api/users")
	//.jsonPath().getInt("id");
	.then()
	.statusCode(201)
	.body("name", equalTo("Ranjan"))
	.log().all();
}
//3. Post request body creation using POJO class
//@Test
public void createByPOJOClass() {
	Post_POJO data=new Post_POJO();
	data.setName("Ranjan");
	data.setGender("king");
	given()
	.contentType("application/json")
	.body(data)
	.when()
	.post("https://reqres.in/api/users")
	//.jsonPath().getInt("id");
	.then()
	.statusCode(201)
	.body("name", equalTo("Ranjan"))
	.log().all();
}
//4. Post request body creation using external POJO Class
@Test
public void createByExternalPOJOClass() throws FileNotFoundException {
	File f=new File(".//data.json");
	FileReader fr=new FileReader(f);
	JSONTokener jt=new JSONTokener(fr);
	JSONObject data=new JSONObject(jt);
	given()
	.contentType("application/json")
	.body(data.toString())
	.when()
	.post("https://reqres.in/api/users")
	//.jsonPath().getInt("id");
	.then()
	.statusCode(201)
	.body("name", equalTo("morpheus"))
	.log().all();
}
}
