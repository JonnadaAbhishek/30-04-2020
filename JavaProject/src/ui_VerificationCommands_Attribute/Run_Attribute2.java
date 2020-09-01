package ui_VerificationCommands_Attribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Run_Attribute2 {

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * Scenario: Verifying Rountrip selection at flight booking scenario
		 * 		Given url is http://makemytrip.com
		 * 		When trip type selected oneway
		 * 		And tap on return date
		 * 		Then Selection move to oneway to roundtrip..
		 */
		
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		
		WebElement oneway_btn=driver.findElement(By.xpath("//li[contains(@data-cy,'oneWayTrip')]"));
		String Run_time_Class=oneway_btn.getAttribute("class");
		
		if(Run_time_Class.equals("selected"))
		{
			System.out.println("Oneway is selected");
			
			WebElement Returndate=driver.findElement(By.xpath("//p[contains(@data-cy,'returnDefaultText')]"));
			Returndate.click();
			Thread.sleep(3000);
			
			WebElement roundtrip_btn=driver.findElement(By.xpath("//li[contains(@data-cy,'roundTrip')]"));
			String Runtimeclass=roundtrip_btn.getAttribute("class");
			if(Runtimeclass.equals("selected"))
			
			 System.out.println("Test pass, Roundtrip is selected");
			 else
			System.out.println("Test fail, round trip is not selected");
		}
			else
			{
				System.out.println("the condition is failed, the runway radio  button is not selected");
			}
			
			
			
			
			
			
		}
		
		
	}
	
	


