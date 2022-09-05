package stepDefinations;

import java.io.IOException;

import io.cucumber.java.Before;

public class Hooks {
	
	
	@Before("@DeletePlaceAPI")
	
	public void addPlacemethod() throws IOException
	{
		
		stepDefination step= new stepDefination();
	//	if(stepDefination.actualpalceid==null) {
		
		step.add_Place_Payload_with("Konge basti ranchi", "English", "Dileep roy");
		step.user_calls_with_http_request("AddPlaceAPI", "POST");
		step.verify_place_id_created_maps_to_using("Dileep roy", "getPlaceAPI");
		
		//}
	}
}
