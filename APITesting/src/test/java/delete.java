import java.io.File;
import java.net.http.HttpResponse.BodyHandler;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class delete {

	public static void main(String[] args) 
	{
		
		
		
		
		RestAssured.given().when().delete("https://reqres.in/api/users/2").then().statusCode(204).log().all() ;
		
	}
}
