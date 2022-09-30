package assessment;
import org.testng.annotations.Test;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteIssue {
	
	@Test
	public void sendDeleteRequest() {
		RestAssured.baseURI = "https://testautomation-sethu.atlassian.net/rest/api/2/issue";
		
		RequestSpecification inputRequest = RestAssured
		.given()
		.auth()
		.preemptive()
		.basic("sethutks@gmail.com", "N7kTxYKLAwLfLOyzaTxHCF4A");
		
		Response response = inputRequest.delete("SEP-3");
		response.prettyPrint();
		System.out.println(response.statusCode());
		
	}

}

