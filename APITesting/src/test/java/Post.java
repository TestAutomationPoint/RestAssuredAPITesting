import java.io.File;
import java.net.http.HttpResponse.BodyHandler;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Post {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		File jsonfile=new File("C:\\Users\\RAVI\\eclipse-workspace\\APITesting\\src\\test\\java\\postjsoninput.json");
		
		RestAssured
			.given()
				.baseUri("https://reqres.in/api/users")
				.body(jsonfile)
				.contentType(ContentType.JSON)
			.when()
				.post()
			.then()
				.assertThat()
				.statusCode(201);
		
	}
}
