package ui_VerificationCommands_Attribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment_Switch_Airports {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://cleartrip.com");
		driver.manage().window().maximize();
		Thread.sleep(10000);

		/*
		 * Scenario:--> Verify switch airports scenario
		 * 		Given site url is http://cleartrip.com
		 * 		When user selected From City
		 * 		And select To City
		 * 		And Click on Switch airports button
		 * 		Then verify Switch applied between airports.
		 * 
		 */
		
		//Click On Round Trip
		WebElement Roundtrip_button=driver.findElement(By.xpath("//input[contains(@id,'RoundTrip')]"));
		Roundtrip_button.click();
		
		//Selection of city (From)
		WebElement From_city=driver.findElement(By.xpath("//input[contains(@id,'FromTag')]"));
		From_city.sendKeys("HYD");
		System.out.println("From City Selected");
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Hyderabad, IN - Rajiv Gandhi International (HYD)")).click();
		
		
		//Selection of city (To)
		WebElement To_City=driver.findElement(By.xpath("//input[contains(@id,'ToTag')]"));
		To_City.sendKeys("DEL");
		System.out.println("To City Selected");
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("New Delhi, IN - Indira Gandhi Airport (DEL)")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("PaxBlock")).click();
		
		//clicking the switch button
		WebElement Switch_btn=driver.findElement(By.xpath("//a[contains(@class,'iconSprite switchFields')]"));
		Switch_btn.click();
		System.out.println("Switching Airports");
		
	    //Conditions
		String Get_From=driver.findElement(By.id("FromTag")).getAttribute("value");
		System.out.println(Get_From);
		
		String Get_To=driver.findElement(By.id("ToTag")).getAttribute("value");
		System.out.println(Get_To);
		
		if(Get_To.equals("Hyderabad, IN - Rajiv Gandhi International (HYD)"))

			System.out.println("Test Fail,The Swapping of Airports");
		else
			System.out.println("Test pass,The Swapping of Airports done ");
		
		
		
		
		
		
		
	}

}
