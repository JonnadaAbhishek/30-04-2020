package ui_VerificationCommands_Text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RunTime_Text {

	public static void main(String[] args) throws Exception {

		/*
		 * Scenario:--> Verify Email validation with invalid Email address
		 * 			Given url http://outlook.com
		 * 			And click Signin navigation button
		 * 			when user enter invalid email address
		 * 			And click next button to proceed login
		 * 			Then receive appropriate error message at webpage.
		 * 			
		 */
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://outlook.live.com/owa/");
		driver.manage().window().maximize();
		
		//Sign In Navigation button
		WebElement Sign_btn=driver.findElement(By.xpath("(//a[contains(@class,'internal sign-in-link')])[2]"));
		Sign_btn.click();
		
		WebElement Email_EditBox=driver.findElement(By.xpath("//input[contains(@id,'i0116')]"));
		Email_EditBox.clear();
		Email_EditBox.sendKeys("kiki");
		
		
		WebElement Login_btn=driver.findElement(By.xpath("//input[contains(@type,'submit')]"));
		Login_btn.click();
		Thread.sleep(5000);
		
		WebElement Error_Location=driver.findElement(By.xpath("//div[contains(@id,'usernameError')]"));
		String Runtime_error_msg=Error_Location.getText();
		System.out.println(Runtime_error_msg);
		
		String Exp_Message="That Microsoft account doesn't exist. Enter a different account or get a new one";
		
		if(Runtime_error_msg.equals(Exp_Message))
		{
			System.out.println(" TestPass,The Error message is displayed at web page");
		}
		else
		{
			System.out.println("TestFail, The error message is not diplayed at web page");
		}
		
		
		
		
		
		
		
		
		
	
	}

}
