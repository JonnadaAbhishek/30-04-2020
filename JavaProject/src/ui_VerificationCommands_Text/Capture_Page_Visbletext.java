package ui_VerificationCommands_Text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Capture_Page_Visbletext 
{

	public static void main(String[] args) throws Exception 
	{
		/*
		 * Scenario:--> Verify Email validation with invalid Email address
		 * 			Given url http://outlook.com
		 * 			And click Signin navigation button
		 * 			when user enter valid email address
		 * 			And click next button to proceed login
		 * 			Then navigate to password entry page.
		 * 			
		 */
		
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://outlook.com");
		driver.manage().window().maximize();
		
		
	   //identify the signin navigation button
		WebElement Sign_Button=driver.findElement(By.xpath("(//a[@class='internal sign-in-link'])[2]"));
		Sign_Button.click();
		
	  //Enter Emailaddress
	  WebElement Email_Name=driver.findElement(By.xpath("//input[contains(@id,'i0116')]"));
	  Email_Name.clear();
	  Email_Name.sendKeys("jonnadaabhi@gmail.com");
	  
	  //Click Next button
	  WebElement Next_button=driver.findElement(By.xpath("//input[contains(@id,'idSIButton9')]"));
	  Next_button.click();
	  Thread.sleep(3000);
		
	  
	  
	  //Identify Web Page
	  WebElement page=driver.findElement(By.tagName("body"));
	  String PageVisible_Text=page.getText();
	  System.out.println(PageVisible_Text);
		
	  
	  //Write Decision to verify the exepcted text from the web page
	  if(PageVisible_Text.contains("Enter Passoword"))
		  System.out.println("Test pass, Expected text visible at web page");
	  else
		  System.out.println("Test fail, Expected text not visible at web page");
	  
	  
		
		
	}

}
