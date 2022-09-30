package assessment;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SearchIssue {
	
	@Test
	public void sendGetRequest() {
		RestAssured.baseURI = "https://testautomation-sethu.atlassian.net/rest/api/2/search";
		
		
		RequestSpecification inputRequest = RestAssured
		.given()
		.auth()
		.preemptive()
		.basic("sethutks@gmail.com", "N7kTxYKLAwLfLOyzaTxHCF4A")
		.queryParam("jql", "project=\"SEP\"")
		.accept(ContentType.JSON);
		
		Response response = inputRequest.get();
		response.prettyPrint();
		System.out.println(response.statusCode());
		
	}

}
