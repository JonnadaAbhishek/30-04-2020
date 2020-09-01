package Interactions_Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http:////www.naukri.com/");
		driver.manage().window().maximize();
	    Thread.sleep(2000);
	    
	    
	    WebElement Menu_Items_Jobs=driver.findElement(By.xpath("//div[@class='mTxt'][contains(.,'Jobs')]"));
	    new Actions(driver).moveToElement(Menu_Items_Jobs).perform();
	    Thread.sleep(3000);
	    
	    WebElement Reg_now=driver.findElement(By.xpath("//a[contains(@data-ga-track,'Main Navigation Jobs|Register Now')]"));
	    new Actions(driver).click(Reg_now).perform();
	    Thread.sleep(3000);
	    
	    driver.switchTo().defaultContent();
	    
	    
	    WebElement Recruters=driver.findElement(By.xpath("//div[@class='mTxt'][contains(.,'Recruiters')]"));
	    new Actions(driver).click(Recruters).perform();
	    Thread.sleep(3000);
	    
	    
	    driver.switchTo().defaultContent();
	    
	    
	    
	    
	    
	}

}

