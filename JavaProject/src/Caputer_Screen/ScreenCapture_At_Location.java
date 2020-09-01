package Caputer_Screen;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class ScreenCapture_At_Location 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://naukri.com");       		//load page to browser
		driver.manage().window().maximize();	 	//Maximize browser window
		
		
		
		WebElement Location=driver.findElement(By.xpath("//h2[contains(.,'Job Gallery')]"));
		new Actions(driver).moveToElement(Location).perform();
		new Actions(driver).sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(3000);
		
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Copy Screent to local utilities
		FileHandler.copy(src, new File("C:\\IDE_Projects\\Screens\\NewImage3.png"));
		
	}

}
