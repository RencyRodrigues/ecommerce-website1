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
			(By.xpath("//span[text()='Grocery']"));
	actions.moveToElement(Menu).build().perform();
	waitABit(4000);
	WebElement Menu1=getDriver().findElement
			(By.xpath("//span[text()='Home, Beauty & Baby']"));
	actions.moveToElement(Menu1).build().perform();
	waitABit(4000);
	WebElement Menu2=getDriver().findElement
			(By.xpath("//span[text()='New & Now']"));
	actions.moveToElement(Menu2).build().perform();
	waitABit(4000);
	WebElement Menu3=getDriver().findElement
			(By.xpath("//span[text()='My Shop']"));
	actions.moveToElement(Menu3).build().perform();
	waitABit(4000);
	WebElement Menu4=getDriver().findElement
			(By.xpath("//span[text()='Flyers & Deals']"));
	actions.moveToElement(Menu4).build().perform();
	waitABit(4000);
	WebElement Menu5=getDriver().findElement
			(By.xpath("//span[text()='PC Express Pass']"));
	actions.moveToElement(Menu5).build().perform();
	waitABit(4000);
	}
	

	public void sortcatogery(String Cat,String subCat) {
		
	Actions action=new Actions(getDriver());
	String beforecat="//span[text()='";
	String aftercat="']";
	WebElement Category=getDriver().findElement(By.xpath(beforecat+Cat+aftercat));
	action.moveToElement(Category).build().perform();
	Category.click();
	waitABit(6000);
	Assert.assertEquals("https://www.maxi.ca/",getDriver().getCurrentUrl());
	Assert.assertEquals("Maxi Supermarket | Grocery shop online",getDriver().getTitle());
	
	//String before="//span[text()='";
	//String after="']";
	
	//WebElement subCategory=getDriver().findElement(By.xpath(before+subCat+after));
	
	//action.moveToElement(subCategory).build().perform();

	//subCategory.click();
	waitABit(4000);
	
	String extendbefore1="//span[text()='";	
	String extendlater2="']";
	//Assert.assertEquals(subCategory,getDriver().findElement(By.xpath(extendbefore1+subCat+extendlater2)));
	
	if(Cat=="Grocery") {
		//Actions action=new Actions(getDriver());
		Assert.assertEquals("https://www.maxi.ca/",getDriver().getCurrentUrl());
		Assert.assertEquals("Maxi Supermarket | Grocery shop online",getDriver().getTitle());
		if(subCat=="Fruits & Vegetables") {
		WebElement subCategory=getDriver().findElement(By.xpath("//span[text()='Fruits & Vegetables']"));
		action.moveToElement(subCategory).build().perform();
		subCategory.click();
		waitABit(6000);
	     }
		if(subCat=="Dairy" || subCat=="Eggs" || subCat=="Dairy & Eggs") {
			WebElement subCategory=getDriver().findElement(By.xpath("//span[text()='Dairy & Eggs']"));
			action.moveToElement(subCategory).build().perform();
			waitABit(6000);
			subCategory.click();
			waitABit(6000);
		}
	}}
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
		
		
		
	
	
		
	

