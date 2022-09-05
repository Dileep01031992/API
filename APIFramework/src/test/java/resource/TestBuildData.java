package resource;

import java.util.ArrayList;
import java.util.List;

import com.pojo.AddAPI;
import com.pojo.Location;

public class TestBuildData {
	
	
	
	public  AddAPI Addplacepayload(String address, String Language,String Name ) {
		
	
		
		 AddAPI p= new AddAPI(); 
		 	
		  p.setAccuracy(50);
		  p.setAddress(address);
		  p.setLanguage(Language);
		  p.setPhone_number("(+91) 983 893 3937");
		  p.setWebsite("https://rahulshettyacademy.com");
		  p.setName(Name);
		  List<String> myList =new ArrayList<String>();
		  myList.add("shoe park");
		  myList.add("shop");

		  p.setTypes(myList);
		  Location l =new Location();
		  l.setLat(-38.383494);
		  l.setLng(33.427362);
		  p.setLocation(l);

		  return p;
		
		
		
		
	}
	
	
	
	
	
	public String deleteplace(String Place_ID) {
		
		
		return "{\r\n" + 
				"    \"place_id\":\""+Place_ID+"\"\r\n" + 
				"    \r\n" + 
				"    }";
		
		
	}

}
