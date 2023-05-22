package Stepdefinitions;

import io.cucumber.java.en.*;
import net.thucydides.core.annotations.Steps;
import pages.Homepage;
import pages.Login;
import pages.Register;



public class register {
	@Steps
	Homepage home;
	@Steps
	Register register;
	@Steps
	Login login;
	
	@Given("User is able to open Maxi website")
	public void user_is_able_to_open_maxi_website() {
	    home.openApplication();
	}

	@When("User clicks on Sign-in button")
	public void user_clicks_on_sign_in_button() {
	    home.click_Signin();
	}

	@Then("User Clicks on Create PC id")
	public void user_clicks_on_create_pc_id() {
	    login.clickPCid();
	    }

	@Then("User enters Valid email password and confirm password")
	public void user_enters_valid_email_password_and_confirm_password() {
		register.enteremail("auto123@gmail.com");
		register.enterpassword("automation@123","automation@123");
		
	}

	@Then("User clicks on checkbox")
	public void user_clicks_on_checkbox() {
		register.clickcheck();  
	}

	@Then("User clicks on create a PC id")
	public void user_clicks_on_create_a_pc_id() {
	   register.clickPCID();
	}

//	@Then("User is able to register successfully")
//	public void user_is_able_to_register_successfully() {
//	   
//	}

}
