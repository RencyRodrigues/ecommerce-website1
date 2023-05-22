package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Steps;
import utils.ReportLog;

public class Login extends PageObject{
	@Steps
	ReportLog report;
	
@FindBy(xpath="//a[@href='/create-account']")
WebElementFacade createPCid;

@FindBy(name="email")
WebElementFacade emailID;
@FindBy(name="password")
WebElementFacade passwrd;
@FindBy(xpath="//button[@type='submit']")
WebElementFacade sign_in;

public void email(String Email) {
	emailID.sendKeys(Email);
	
}
public void pwd(String pass) {
	passwrd.sendKeys(pass);
	
}
public void clickSignIn() {
	sign_in.click();
}

public void success() {
	getDriver().get("https://www.maxi.ca/");
}
public void clickPCid() {
	createPCid.click();
	waitABit(2000);
}
	
}
