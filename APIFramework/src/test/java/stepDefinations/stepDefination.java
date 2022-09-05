package stepDefinations;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.pojo.AddAPI;
import com.pojo.Location;
import static org.junit.Assert.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import resource.APIResource;
import resource.TestBuildData;
import resource.Utils;

public class stepDefination extends Utils {
	RequestSpecification res;
	ResponseSpecification resspec;
	Response response;
	TestBuildData data= new TestBuildData();
	static String actualpalceid;


	@Given("Add Place Payload with {string} {string} {string}")
	public void add_Place_Payload_with(String Address, String Language, String name) throws IOException {
	
	System.out.println("Start");
	  
	   
	   
	 
	   res=given().spec(RequestSpecification())
	  .body(data.Addplacepayload(Address,Language,name));

	//  response =res.when().post("/maps/api/place/add/json").
	// then().spec(resspec).extract().response();

	
	// System.out.println(responseString);
	// System.out.println("Final");


	  
	  
	  
	  
	  
   
}

	@When("user calls {string} with {string} http request")
	public void user_calls_with_http_request(String resource, String method) {
	
		//Contructor will be called with value of resource which you pass
	APIResource resourceapi=APIResource.valueOf(resource);
	
	  resspec =new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
	  
	  if(method.equalsIgnoreCase("Post")) {
	response =res.when().post(resourceapi.getResource()).
		 then().spec(resspec).extract().response();

	System.out.println(resourceapi.getResource());
	
	  }
	  
	  
	  else if(method.equalsIgnoreCase("Get")) {
		  
		  response =res.when().get(resourceapi.getResource()).
					 then().spec(resspec).extract().response();
		  System.out.println(resourceapi.getResource());
	  }
	  
	  
}

@Then("the API call got success with status code {int}")
public void the_API_call_got_success_with_status_code(Integer int1) {
int statuscode=	response.getStatusCode();

System.out.println(" Status code is " +statuscode);
	
		
}

@Then("{string} in response body is {string}")
public void in_response_body_is(String keyvalue, String expeted) {
   
	//String responseString=response.asString();
	//JsonPath js= new JsonPath(responseString);
	
         //   String statuscode=  js.get(keyvalue);
            
          //  System.out.println(statuscode);
	
	getJsonPath(response,keyvalue);
            
          assertEquals(getJsonPath(response,keyvalue),expeted);
	
}


@Then("verify place_id created maps to {string} using {string}")
public void verify_place_id_created_maps_to_using(String expectedname, String resource) throws IOException {
    
	actualpalceid=getJsonPath(response,"place_id");
	 res=given().spec(RequestSpecification()).queryParam("place_id", actualpalceid);
	
	 user_calls_with_http_request(resource,"GET");
	 
	 
	 String actualname=getJsonPath(response,"name");
	 
	 assertEquals(actualname,expectedname);
}




@Given("DeletePlace Payload")
public void deleteplace_Payload() throws IOException {
   
	
	res=given().spec(RequestSpecification()).body(data.deleteplace(actualpalceid));
}

	

}
