package StepDef;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class countryPrint {
	String[] country= {"China", "Egypt", "France", "Germany", "India", "Japan", "Kenya", "Mexico", "United Kingdom", "United States"};
	String[] capitol= {"Beijing", "Cairo", "Paris", "Berlin", "New Delhi", "Tokyo", "Nairobi", "Mexico City", "London", "Washington D.C."};
	String[] Language= { "Chinese", "Arabic", "French", "German", "Hindi", "Japanese", "Swahili", "Spanish", "English", "English"};
	List<String> countryList;
	List<String> capitalList;
	List<String> LanguageList;
	int index;
	
	@Given("user initilizes four array with list")
	public void user_initilizes_four_array_with_list() {
	    // Write code here that turns the phrase above into concrete actions
	    countryList=new ArrayList<String>(Arrays.asList(country));
	    capitalList=new ArrayList<String>(Arrays.asList(capitol));
	    LanguageList=new ArrayList<String>(Arrays.asList(Language));
	}

	@When("user gives a random index number")
	public void user_gives_a_random_index_number() {
	    // Write code here that turns the phrase above into concrete actions
		Random ra=new Random();
	   index= ra.nextInt(0,11) ;
	}

	@Then("print corresponding items from list")
	public void print_corresponding_items_from_list() {
	    // Write code here that turns the phrase above into concrete actions
 System.out.println("For Index :"+index);
		System.out.println("COUNTRY: "+countryList.get(index));
		System.out.println("CAPITAL: "+capitalList.get(index));
		System.out.println("LANGUAGE: "+LanguageList.get(index));
	    
	}

}
