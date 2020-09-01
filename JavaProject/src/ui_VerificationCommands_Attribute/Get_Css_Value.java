package ui_VerificationCommands_Attribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Get_Css_Value {

	public static void main(String[] args) throws Exception 
	{
		/*
		 * Scenario:--> Verify Sensex board details
		 * 		Given site url https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx
		 * 		When user select Sensex Tab
		 * 		Then Verify Sensex Details displayed on board..
		 */

		
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement SenSex_Tab=driver.findElement(By.xpath("//a[contains(@id,'InvestRec')]"));
		SenSex_Tab.click();
		
		String BackGround_Colour=SenSex_Tab.getCssValue("background-color");
		System.out.println(BackGround_Colour);
		
		
		if(BackGround_Colour.equals("rgb(231, 120, 23)"))
			System.out.println("Test Pass,The expected background colour matching");
		else
			System.out.println("Test Fail,The expected background colour mismatching");
		
		
	}

}
