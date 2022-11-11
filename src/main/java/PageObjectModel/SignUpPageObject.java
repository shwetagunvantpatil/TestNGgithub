package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageObject {
	
	public WebDriver driver;
	
	By firstname=By.xpath("//input[@name='UserFirstName']");
	By lastname=By.xpath("//input[@name='UserLastName']");
	By employee=By.xpath("//select[@name='CompanyEmployees']");

	By jobtitle=By.xpath("//input[@name='UserTitle']");
	By phone=By.xpath("//input[@name='UserPhone']");
	By email=By.xpath("//input[@name='UserEmail']");
	By Companyname=By.xpath("//input[@name='CompanyName']");
	By country=By.xpath("//select[@name='CompanyCountry']");
	

	public SignUpPageObject(WebDriver driver2) {
		this.driver=driver2;
	}

	public WebElement enterFirstname()   {
		return driver.findElement(firstname);
	}
	
	public WebElement enterLastname()   {
		return driver.findElement(lastname);
	}
	
	public WebElement selectEmpolyee()   {
		return driver.findElement(employee);
	}
	
	public WebElement enterphone()   {
		return driver.findElement(phone);
	}
	
	public WebElement enteremail()   {
		return driver.findElement(email);
	}
	
	public WebElement entercompanyname()   {
		return driver.findElement(Companyname);
	}

	public WebElement loginclick() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public WebElement selectcountry()   {
		return driver.findElement(country);
	}

	

	public WebElement enterjobtitle() {
		return driver.findElement(jobtitle);
	}

	
	

	
	
}
