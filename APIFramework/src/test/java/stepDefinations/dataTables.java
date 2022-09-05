package stepDefinations;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class dataTables {
	
	
	@Given("To log on registration page")
	public void to_log_on_registration_page() {
	    System.out.println("******To Log on Registration Page");
	}

	@When("Enter te set of data")
	public void enter_te_set_of_data(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    
		            List<Map<String,String>> userList=dataTable.asMaps(String.class,String.class);
		            
		            for(Map<String,String> ms:userList) {
		            	
		            	System.out.println(ms);
		            	
		            	System.out.println(ms.get("Name"));
		            	System.out.println(ms.get("Rollno"));
		            	System.out.println(ms.get("Email"));
		            	System.out.println(ms.get("Phonenumebr"));
		            	
		            }
		            
		            
		            
		         //   System.out.println(userList);
		            
		         //   System.out.println(userList.get(0).get("Name"));
		         //   System.out.println(userList.get(0).get("Rollno"));
		         //   System.out.println(userList.get(0).get("Email"));
		          //  System.out.println(userList.get(0).get("Phonenumebr"));
		            
		        //    System.out.println(userList.get(1).get("Name"));
		         //   System.out.println(userList.get(1).get("Rollno"));
		         //   System.out.println(userList.get(1).get("Email"));
		         //   System.out.println(userList.get(1).get("Phonenumebr"));
		           
		          //  System.out.println(userList.get(2).get("Name"));
		          //  System.out.println(userList.get(2).get("Rollno"));
		           // System.out.println(userList.get(2).get("Email"));
		         //   System.out.println(userList.get(2).get("Phonenumebr"));
		           
		            
	    
	    
	}

	@Then("submit the report")
	public void submit_the_report() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("************To Submit the request***********");
	}

	@Given("To log on search page")
	public void to_log_on_search_page() {
	    
		System.out.println("**********List test*************");
		
	}

	@When("Enter the search criteria")
	public void enter_the_search_criteria(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    
	 List<List<String>> userlist=  dataTable.asLists(String.class);
		//System.out.println("First Index "+userlist.get(0).get(0));
		//System.out.println("Second Index  "+userlist.get(1));
		//System.out.println("Third Index "+userlist.get(2));
	  
		for(List<String> c:userlist) {
			
			
			//System.out.println(c.get(0));
			//System.out.println(c.get(1));
			//System.out.println(c.get(2));
		}
		
	}

	@Then("go with search")
	public void go_with_search() {
	    
		
		System.out.println("**************List Then*********");
	}


	
	
	
	
	
	
	
	
	
	

}
