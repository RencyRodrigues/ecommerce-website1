package Stepdefinitions;

import io.cucumber.java.en.*;
import net.thucydides.core.annotations.Steps;
import pages.Homepage;
import pages.Login;

public class loginsteps {
@Steps
Homepage home;
@Steps
Login login;

@Given("User opens Maxi website")
public void user_opens_maxi_website() {
  home.openApplication();
  
}
@When("User clicks on Sign_in button")
public void user_clicks_on_sign_in_button() {
    home.click_Signin();
}
@Then("User enters email and password")
public void user_enters_email_and_password() {
    login.email("auto123@gmail.com");
    login.pwd("automation@123");
}
@Then("clicks on Sign_in button")
public void clicks_on_sign_in_button() {
   login.clickSignIn();
}
@Then("User is able to login Successfully")
public void user_is_able_to_login_successfully() {
   login.success();
}


}
