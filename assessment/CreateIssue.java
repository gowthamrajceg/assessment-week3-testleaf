package assessment;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateIssue {
	@Test
	public void sendPostRequest() {
		RestAssured.baseURI = "https://testautomation-sethu.atlassian.net/rest/api/2/issue";
		
		File inputFile = new File("./src/main/resources/CreateIssue.json");
		
		RequestSpecification inputRequest = RestAssured
		.given()
		.auth()
		.preemptive()
		.basic("sethutks@gmail.com", "N7kTxYKLAwLfLOyzaTxHCF4A")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(inputFile);
		
		Response response = inputRequest.post();
		response.prettyPrint();
		System.out.println(response.statusCode());
	}
}
