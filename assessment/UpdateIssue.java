package assessment;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateIssue {
	
	@Test
	public void sendPutRequest() {
		RestAssured.baseURI = "https://testautomation-sethu.atlassian.net/rest/api/2/issue";
		
		RequestSpecification inputRequest = RestAssured
		.given()
		.auth()
		.preemptive()
		.basic("sethutks@gmail.com", "N7kTxYKLAwLfLOyzaTxHCF4A")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"fields\": {\r\n"
				+ "        \"description\": \"Issue updated via RestAssured on Sep 25 2022 --second time\"\r\n"
				+ "    }\r\n"
				+ "}");
		
		Response response = inputRequest.put("SEP-3");
		response.prettyPrint();
		System.out.println(response.statusCode());
		
	}

}

