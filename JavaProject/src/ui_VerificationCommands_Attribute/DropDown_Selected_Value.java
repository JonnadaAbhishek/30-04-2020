package ui_VerificationCommands_Attribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Selected_Value {

	public static void main(String[] args) throws Exception
	{
		/*
		 * Example:--> How to verify requried option selected at dropdown.
		 */
		
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://cleartrip.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		

		WebElement Adults_Dp=driver.findElement(By.xpath("//select[contains(@tabindex,'7')]"));
		new Select(Adults_Dp).selectByVisibleText("7");
		Thread.sleep(3000);	
		
		String Selected_value=Adults_Dp.getAttribute("value");
		System.out.println(Selected_value);
		
		if(Adults_Dp.equals("Selected"))
			System.out.println("Test pass,The value is matching");
		else
			System.out.println("Test Fail,The value is mismatching");
		
	}
	
	
	
	
	

}
