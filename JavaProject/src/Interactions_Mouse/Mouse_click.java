package Interactions_Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_click {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http:////www.naukri.com/");
		driver.manage().window().maximize();
	    Thread.sleep(2000);
	    
	    WebElement Cognizant=driver.findElement(By.xpath("//img[@src='https://company.naukri.com/banners2018/cognizant-hs-120X45-21sep2018.gif']"));
	    new Actions(driver).click(Cognizant).perform();
	
	   driver.switchTo().defaultContent();
	    
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@name='location']")).sendKeys("Hyderabad/Secunderabad,"+Keys.ENTER);
	
	
	     driver.switchTo().defaultContent();
	
	
	}
	
	

}
