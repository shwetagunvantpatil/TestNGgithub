package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {

	public WebDriver driver;  //This driver don't have scope
	
	//driver.findElement(By.xpath("//hshsju")).sendKeys("test");
	
	private By username=By.xpath("//input[@id='username']");
	private By password=By.xpath("//input[@id='password']");
	private By login=By.xpath("//input[@id='Login']");
	By actualErrorMassage=By.xpath("//div[@id='error']");
	
	 By tryForFee=By.xpath("//a[@id='signup_link']");
	
	
	
	public LoginPageObjects(WebDriver driver2) {
		
		this.driver=driver2;
	}

	public WebElement enterUsername()   {
			return driver.findElement(username);
		   	//driver.findElement(By.xpath("//input[@id='username']")
	}
	
	public WebElement enterPassword()   {
		return driver.findElement(password);
	}	
		
	public WebElement clickonlogin()   {
		return driver.findElement(login);
	}	
		
	
	
	public WebElement clickonTryForfee()   {
		return driver.findElement(tryForFee);
	}	
	
	public WebElement ErrorMassage() {
		return driver.findElement(actualErrorMassage);
	}


}
