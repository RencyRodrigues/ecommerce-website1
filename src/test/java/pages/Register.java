package pages;

import org.junit.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Steps;
import utils.ReportLog;

public class Register extends PageObject {

	@Steps
	ReportLog report;
	@FindBy(xpath="//input[@aria-label='Email']")
	WebElementFacade email;
	@FindBy(xpath="//input[@aria-label='Password']")
	WebElementFacade password;
	@FindBy(xpath="//input[@aria-label='Confirm password']")
	WebElementFacade confirm_password;
	@FindBy(xpath="//div[@class='checkbox-group__input-wrapper']")
	WebElementFacade clickCheck;
	@FindBy(xpath="//button[@type='submit']")
	WebElementFacade clickPCid;
	public void enteremail(String Email) {
		email.sendKeys(Email);
		waitABit(6000);
	}
		public void enterpassword(String Password,String Confirm_password) {
		password.sendKeys(Password);
		waitABit(2000);
		confirm_password.sendKeys(Confirm_password);
		
		Assert.assertEquals(Password, Confirm_password);
		}
		
		public void clickcheck() {
			clickCheck.click();
			waitABit(2000);
		}
		
	
public void clickPCID() {
	clickPCid.click();
	waitABit(2000);
}
		
		}
	
	
	
