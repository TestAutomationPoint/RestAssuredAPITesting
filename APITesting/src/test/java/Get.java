import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Get {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
	
		Response res=RestAssured.get("https://reqres.in/api/users?page=2");
		
		
		System.out.println("Response Body is =>  " + res.asString());
		System.out.println("Response Body is =>  " + res.body().asString());
		System.out.println("Response Body is =>  " + res.statusCode());
		System.out.println("Response Body is =>  " + res.getContentType());
		System.out.println("Response Body is =>  " + res.getStatusLine());
		
		Assert.assertEquals(res.getStatusLine(), "HTTP/1.1 200 OK");
		
	}

}
