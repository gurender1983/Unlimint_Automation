package StepDefinitions; 




import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import enums.Context;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class fetchUser_StepDefination {
	
	TestContext testContext = TestContext.GetInstance();
	Response response;
	
	
	
	@Given("^valid endpoint to fetch users$")
	public void valid_endpoint_to_fetch_users() 
	{
		RestAssured.baseURI="https://randomuser.me/";
		//RestAssured.basePath="api/?nat=us&randomapi";
	    
	}

	@When("^request is send to server \"([^\"]*)\"$")
	public void request_is_send_to_server(String endpoint) {
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type", "application/json");
		response = request.get(endpoint);
		System.out.println(response.getBody().asString());
	    
	}

	@Then("^extract the information of first user$")
	public void extract_the_information_of_first_user() {
		JsonPath jsonPathEvaluator = response.jsonPath();
		List<String> firstnames = jsonPathEvaluator.get("results.name.first");
		List<String> lastnames = jsonPathEvaluator.get("results.name.last");
		List<String> emails = jsonPathEvaluator.get("results.email");
		List<String> s_address = jsonPathEvaluator.get("results.location.street.name");
		List<String> s_city = jsonPathEvaluator.get("results.location.city");
		List<String> s_state = jsonPathEvaluator.get("results.location.state");
		List<String> s_postcode = jsonPathEvaluator.get("results.location.postcode");
		List<String> s_phone = jsonPathEvaluator.get("results.phone");
		
		
		String first_name = firstnames.get(0); 
		String last_name = lastnames.get(0); 
		String email = emails.get(0); 
		String addr = s_address.get(0);
		String city = s_city.get(0);
		String state = s_state.get(0);
		String postcode = String.valueOf(s_postcode.get(0));
		String phone = s_phone.get(0);
		testContext.getScenarioContext().setContext(Context.firstName, first_name);
		testContext.getScenarioContext().setContext(Context.lastName, last_name);
		testContext.getScenarioContext().setContext(Context.email, email);
		testContext.getScenarioContext().setContext(Context.address, addr);
		testContext.getScenarioContext().setContext(Context.city, city);
		testContext.getScenarioContext().setContext(Context.state, state);
		testContext.getScenarioContext().setContext(Context.postcode, postcode);
		testContext.getScenarioContext().setContext(Context.phone, phone);
		
		
	    
	}


}
