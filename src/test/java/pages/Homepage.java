package pages;

import org.junit.Assert;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Steps;
import setup.Init;
import utils.ReportLog;

public class Homepage extends PageObject {
	@Steps
	Init init;
	@Steps
	ReportLog report;
	@FindBy(className = "lds__privacy-policy__btnClose")
 
   WebElementFacade cookies;
   @FindBy(xpath="//a[@class='sign-in account__login-link']")
   WebElementFacade signin;
   @FindBy(xpath="//button[@class='site-language-toggle__item']")
   WebElementFacade lang;
	public void openApplication() {
		getDriver().get(init.appurl());
		getDriver().manage().window().maximize();
		report.log("your Maxi webiste is opened:");
		waitABit(2000);
		
		lang.click();
		waitABit(2000);
		System.out.println("Page title is"+getDriver().getTitle());
		System.out.println("page url is:"+getDriver().getCurrentUrl());
		
		Assert.assertEquals("Maxi Supermarket | Grocery shop online",getDriver().getTitle());
	    Assert.assertEquals("https://www.maxi.ca/",getDriver().getCurrentUrl());
	    if(cookies.isCurrentlyVisible())
		{
			clearCookies();
		}
	}
	public void clearCookies() {
		cookies.click();
		report.log("cookies are cleared");
		waitABit(2000);
	}
	public void click_Signin() {
		signin.click();
		report.log("you clicked on sigin");
		waitABit(2000);
		}
	}
