package pages;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class Homebanner extends PageObject{
	
	@FindBy(xpath="//button[@aria-label='Next']")
	WebElementFacade scrollforward;
	@FindBy(xpath="//button[@aria-label='Back']")
	WebElementFacade scrollbackward;


public void hoveronBamnner() {
   
	   	   }
	public void scrollForward() {
		Actions actions=new Actions(getDriver());
		WebElement forwardslider =getDriver().findElement(By.xpath("//button[@data-testid='carousel-btn-next']"));
		actions.moveToElement(forwardslider).perform();
		forwardslider.click();
		waitABit(4000);
		actions.moveToElement(forwardslider).perform();
		forwardslider.click();
		waitABit(4000);
		actions.moveToElement(forwardslider).perform();
		forwardslider.click();
		waitABit(4000);
		actions.moveToElement(forwardslider).perform();
		forwardslider.click();
		waitABit(4000);
//		scrollforward.click();
//		
//		waitABit(4000);
//		scrollforward.click();
		
	}
	public void scrollBackward() {
		
		Actions actions=new Actions(getDriver());
		WebElement backwardslider =getDriver().findElement(By.xpath("//button[@data-testid='carousel-btn-prev']"));
		actions.moveToElement(backwardslider).perform();
		backwardslider.click();
		waitABit(4000);
		actions.moveToElement(backwardslider).perform();
		backwardslider.click();
		waitABit(4000);
		actions.moveToElement(backwardslider).perform();
		backwardslider.click();
		waitABit(4000);
		actions.moveToElement(backwardslider).perform();
		backwardslider.click();
		waitABit(4000);
//		scrollbackward.click();
//		
//		waitABit(4000);
//		scrollbackward.click();
	}
	

}
