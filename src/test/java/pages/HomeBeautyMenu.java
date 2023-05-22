package pages;

//import static org.mockito.Mockito.CALLS_REAL_METHODS;
//import static org.mockito.Mockito.RETURNS_DEEP_STUBS;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

//import junit.framework.Assert;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import utils.CommonMethods;


public class HomeBeautyMenu extends PageObject {
	
	public void sortcategory() {
	Actions actions = new Actions(getDriver());
	WebElement Menu=getDriver().findElement
			(By.xpath("/html/body/div[1]/div/div[1]/div[3]/div/header/div[2]/div[1]/nav/ul/li[2]/button"));
	actions.moveToElement(Menu).build().perform();
	Menu.click();
	waitABit(4000);
	}

	public void sortcatogery(String Cat,String subCat) {
		
	Actions action=new Actions(getDriver());
	String beforecat="//span[text()='";
	String aftercat="']";
	WebElement Category=getDriver().findElement(By.xpath(beforecat+Cat+aftercat));
	action.moveToElement(Category).build().perform();
	Category.click();
	waitABit(4000);
	Assert.assertEquals("https://www.maxi.ca/",getDriver().getCurrentUrl());
	Assert.assertEquals("Maxi Supermarket | Grocery shop online",getDriver().getTitle());
	
	String before="//span[text()='";
	String after="']";
	
	WebElement subCategory=getDriver().findElement(By.xpath(before+subCat+after));
	
	action.moveToElement(subCategory).build().perform();

	subCategory.click();
	waitABit(4000);
	
	String extendbefore1="//span[text()='";	
	String extendlater2="']";
	Assert.assertEquals(subCategory,getDriver().findElement(By.xpath(extendbefore1+subCat+extendlater2)));
	}
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	String[] prod= {"Pantry","Meat"};	
//	for(String product:prod){
//		if(subCate)	
//	}
//	
	
	//Assert.assertEquals("https://www.maxi.ca/",getDriver().getCurrentUrl());
	//String extendbefore="//title[text()='";
		
//	String extendlater="| Maxi']";
	
	//String value="Pantry";
	//String Subcat="//h1[text()='Pet Supplies']";
	
//	if(subCat==value) {
//			Assert.assertEquals(subCat,value);
//	}
//	 if(subCat==value) {
//		 
//	 }
		
		
		
	
	
		
	

