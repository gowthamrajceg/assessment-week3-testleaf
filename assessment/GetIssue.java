package assessment;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetIssue {
	
	@Test
	public void sendGetRequest() {
		RestAssured.baseURI = "https://testautomation-sethu.atlassian.net/rest/api/2/issue";
		
		RequestSpecification inputRequest = RestAssured
		.given()
		.auth()
		.preemptive()
		.basic("sethutks@gmail.com", "N7kTxYKLAwLfLOyzaTxHCF4A")
		.accept(ContentType.JSON);
		
		Response response = inputRequest.get("SEP-3");
		response.prettyPrint();
		System.out.println(response.statusCode());
		
	}

}



