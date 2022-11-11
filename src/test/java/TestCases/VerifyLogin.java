package TestCases;


import java.io.IOException;
import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.LoginPageObjects;
import Resources.BaseClass;
import Resources.CommanUtilities;
import Resources.Constant;

public class VerifyLogin extends BaseClass {
	
	

	@Test
	public void Login() throws IOException {
		
		
	
		LoginPageObjects obj=new LoginPageObjects(driver);
		
		obj.enterUsername().sendKeys("Constant.username");
		
		//CommanUtilities.handlExplictWait(10, obj.enterPassword());
		
		obj.enterPassword().sendKeys("Constant.password");
		//CommanUtilities.handlExplictWait(15, obj.clickonlogin());
		   
		obj.clickonlogin().click();
		
		CommanUtilities.handleAssertions(Constant.expectedString,obj.ErrorMassage().getText());
	
		
	}

}
