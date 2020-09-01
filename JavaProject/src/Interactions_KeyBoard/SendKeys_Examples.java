package Interactions_KeyBoard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeys_Examples 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com/free-job-alerts");
		driver.manage().window().maximize();
	    Thread.sleep(5000);
	    
	    //click to open list of options
	    driver.findElement(By.xpath("//input[contains(@id,'cjaExp')]"));
	    
	    //on active element perform a keyboard shortcut
	    new Actions(driver).pause(3000).sendKeys(Keys.ARROW_DOWN)
	    .sendKeys(Keys.ARROW_DOWN)
	    .sendKeys(Keys.ARROW_DOWN)
	    .sendKeys(Keys.ARROW_DOWN)
	    .sendKeys(Keys.ENTER).perform();
	    
	    //click to open list of options
	    driver.findElement(By.id("cjaMinSal")).click();
	    
	    //on actions element perform a keyboard shortcut
	    new Actions(driver).pause(3000).sendKeys(Keys.ARROW_DOWN)
	    .sendKeys(Keys.ARROW_DOWN)
	    .sendKeys(Keys.ARROW_DOWN)
	    .sendKeys(Keys.ENTER).perform();
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
