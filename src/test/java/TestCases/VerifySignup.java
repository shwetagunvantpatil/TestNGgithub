package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObjects;
import PageObjectModel.SignUpPageObject;
import Resources.BaseClass;
import Resources.CommanUtilities;

public class VerifySignup extends BaseClass {
	
	@Test
	public void Signup() throws IOException, InterruptedException  {
		
		
       LoginPageObjects LPO=new LoginPageObjects(driver);
		
		LPO.clickonTryForfee().click();
		
		
		 SignUpPageObject SPO=new SignUpPageObject(driver);	
		
		Thread.sleep(1000);
		SPO.enterFirstname().sendKeys("Constant.firstname");
		SPO.enterLastname().sendKeys("Constant.lastnames");
		SPO.enterphone().sendKeys("0954145632");
		SPO.enteremail().sendKeys("Rushi@12gmail.com");
		SPO.entercompanyname().sendKeys("TCS");
		//SPO.enterjobtitle().sendKeys("Developer");
		
	

		
		/*WebElement e=SPO.selectEmpolyee();
		Select s=new Select(e);
		s.selectByIndex(1);*/
		CommanUtilities.handleStaticDropdown(SPO.selectEmpolyee(), 1);  //employee dropdown
		
		
		
	    	Thread.sleep(2000);
	    //	driver.findElement(By.xpath("(//div[@class='chekbox-ui'])[1]")).click();
		
		
		/*Thread.sleep(1000);
		WebElement country=SPO.selectcountry();
		Select s1=new Select(country);
		s1.selectByIndex(2);*/
		CommanUtilities.handleStaticDropdown(SPO.selectcountry(), 2);    //country dropdown
		
		
		Thread.sleep(2000);
		WebElement jobtitle=SPO.enterjobtitle();
		
		Select s2=new Select(jobtitle);
		s2.selectByIndex(5);
		
		
		
	}	
		
	
}
