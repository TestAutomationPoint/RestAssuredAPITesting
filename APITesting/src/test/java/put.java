import java.io.File;
import java.net.http.HttpResponse.BodyHandler;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class put {

	public static void main(String[] args) 
	{
		Map<String, Object> map=new HashMap<String, Object>();
		
		
		
//		map.put("name", "Ravi");
//		map.put("job", "IT");
//		System.out.println(map);
		
		JSONObject request = new JSONObject();
		request.put("name", "Ravi");
		request.put("job", "IT");
		
		
		
		System.out.println(request.toJSONString());
		
		RestAssured.given().body(request.toJSONString()).when().put("https://reqres.in/api/users/2").then().statusCode(200).log().all() ;
		
	}
}
