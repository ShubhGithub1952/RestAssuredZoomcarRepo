package requestAPI;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.io.File;

public class RequestClassTest {
	@Test
	public void methodTest() {
		JSONObject jsonObject = new JSONObject();
		File fileObj = new File(".\\ComplexJson.json");
		String response = given()
		.body(fileObj)
		.contentType(ContentType.JSON)
		.when().get("https://datausa.io/api")
		.then().contentType(ContentType.JSON).extract().response().asString();
		System.out.println(response);
		
//		String response=given()
//				.pathParam("mypath", "data")
//				.queryParam("drilldowns", "Nation")
//				.queryParam("measures", "Population")
//				.when()
//				.get("https://datausa.io/api/{mypath}")
//				.then().extract().response().asString();
				//.statusCode(200).log().all().extract().response().asString();
				
				System.out.println(response);
//				JsonPath js=new JsonPath(response);
//				String sourcename=js.getString("source[0].annotations.source_name");
//				String sourcedescription=js.getString("source[0].annotations.source_description");
//				
//				System.out.println("This is source_name "+sourcename);
//				System.out.println("This is source_description "+sourcedescription);
	}
}
