package pages;

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
	Actions actions=new Actions(getDriver());
	   //WebElement banner=getDriver().findElement(By.xpath("//div[@data-cms-id='1rBmZzqAVThOPbw4X2x0Zn']")) ;
	  // actions.moveToElement(banner).build().perform();
	   //banner.click();
	WebElement slider = getDriver().findElement(By.xpath("/html/body/div[1]/div/div[2]/main/div[1]/div/div/div[1]/div/div/div/div/div/ul/li[2]/button/span"));
	  actions.dragAndDropBy(slider,3, 2).perform();
	   waitABit(4000);
//	   WebElement slider2 = getDriver().findElement(By.xpath("/html/body/div[1]/div/div[2]/main/div[1]/div/div/div[1]/div/div/div/div/div/ul/li[3]/button/span"));
//		  actions.dragAndDropBy(slider2,3, 2).perform();
//		   waitABit(4000);
   WebElement slider1 = getDriver().findElement(By.xpath("/html/body/div[1]/div/div[2]/main/div[1]/div/div/div[1]/div/div/div/div/div/ul/li[1]/button/span"));
   actions.dragAndDropBy(slider1,3,3).perform();
   waitABit(4000);
	
    //Action action = (Action) move.dragAndDropBy(slider, 30, 0).build();
    
	   	   }
	public void scrollForward() {
		
		scrollforward.click();
		
		waitABit(4000);
		scrollforward.click();
		
	}
	public void scrollBackward() {

		scrollbackward.click();
		
		waitABit(4000);
		scrollbackward.click();
	}
	

}
