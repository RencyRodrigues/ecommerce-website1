package Stepdefinitions;

import io.cucumber.java.en.*;
import net.thucydides.core.annotations.Steps;
import pages.Homebanner;
import pages.Homepage;

public class Bannerstep {
	@Steps
	Homepage home;
	@Steps 
	Homebanner ban;
	
	@Given("user open the website")
	public void user_open_the_website() {
	    home.openApplication();
	}
	@When("User hovers on the banner")
	public void user_hovers_on_the_banner() {
	    ban.hoveronBamnner();
	}
	@Then("user clicks on forward button on banner")
	public void user_clicks_on_forward_button_on_banner() {
	   ban.scrollForward();
	}
	@Then("user clicks on backward button on banner")
	public void user_clicks_on_backward_button_on_banner() {
	    ban.scrollBackward();
	    }



}
