package Resources;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;


public class CommanUtilities {

	public static WebDriver driver;
	
	//This method is for handling static dropdown
	public static void handleStaticDropdown(WebElement element,int index) {
		WebElement e=element;
		Select s=new Select(e);
		s.selectByIndex(index);
	}
	
	///This method is for handle the assertions
	public static void handleStaticDropdown(String expected,String Actual)   {

	   SoftAssert sa=new SoftAssert();
	   String  expectedString=expected;
	  String  actualString=Actual;
	  sa.assertEquals(actualString,expectedString);
	  sa.assertAll();
		
   	}
     public static void handlExplictWait(int duration,WebElement element)    {
	
       WebDriverWait wb=new WebDriverWait(driver,Duration.ofSeconds(duration));
	   wb.until(ExpectedConditions.visibilityOf(element));
     }

	public static void handleAssertions(String expectedString, String text) {
		// TODO Auto-generated method stub
		
	}




	
	
	
	}

