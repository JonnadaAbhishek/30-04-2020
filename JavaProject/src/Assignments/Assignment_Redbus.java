package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment_Redbus {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.redbus.in/");
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.xpath("//a[contains(@title,'redBus Bus Hire')]")).click();
	    Thread.sleep(5000);
	    
	    WebElement Sign_In=driver.findElement(By.xpath("//button[contains(@class,'signinbutton')]"));
	    Sign_In.click();
	    
	    driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/iframe")));
	    Thread.sleep(2000);
	    
	    WebElement Mobile_Number=driver.findElement(By.id("mobileNoInp"));
	    Mobile_Number.sendKeys("7799137575");
	    Mobile_Number.click();
	    Thread.sleep(2000);
	    
	    WebElement SignIN_Google=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[3]/div[7]/div/div/div"));
	    SignIN_Google.click();
	    
	    driver.switchTo().defaultContent();
	    
	}
	
	

}
