package Stepdefinitions;

import io.cucumber.java.en.*;
import net.thucydides.core.annotations.Steps;
import pages.HomeBeautyMenu;
import pages.Homepage;
import utils.CommonMethods;
import utils.ReportLog;

public class HomeBeautyMenustep {
	@Steps
	Homepage home;
	@Steps
	HomeBeautyMenu menu;
	@Steps
	CommonMethods common;
	@Steps
	ReportLog report;
	
	@Given("User opens Maxiwebsite")
	public void user_opens_maxiwebsite() {
	    home.openApplication();
	}
	@When("User hover over Home,Beauty and baby menu bar")
	public void user_hover_over_home_beauty_and_baby_menu_bar() {
		menu.sortcategory();
		}
	@Then("User is able to view all the subcategories")
	public void user_is_able_to_view_all_the_subcategories() {
		//menu.sortcategory();
				menu.sortcatogery("Flyers & Deals","Flyer");
			  // menu2.sortcatogery("Grocery", "International Foods");
				
	}
	@Then("user is able to hover over the Sub-Category")
	public void user_is_able_to_hover_over_the_sub_category() {
	    
	}
//	@Then("user is able to click on a particular Sub-Category")
//	public void user_is_able_to_click_on_a_particular_sub_category() {
//	    
//	}
//	@Then("User is able to open particular Sub-category page")
//	public void user_is_able_to_open_particular_sub_category_page() {
//	    
//	}


}
