package JavaScript_Executors;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Java_Scripts_Run_Time {

	public static void main(String[] args) throws Exception
	{
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.gecko.driver","G:\\30-04-2020\\JavaProject\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");  //Load webpage
		driver.manage().window().maximize();  //maximize browser window
		
		
		//Create Interface for jsexecutor
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		//identify web Element
		WebElement Email_editbox=driver.findElement(By.id("email"));
		Email_editbox.sendKeys("JonnadaAbhishek");
		Thread.sleep(2000);
		
		//disabled element
		js.executeScript("arguments[0].disabled=true;",Email_editbox);
		Thread.sleep(2000);
		
		//Enabled element
		js.executeScript("arguments[0].enabled=false;", Email_editbox);
		Thread.sleep(2000);
		
							
		//hide element from web page
		js.executeScript("arguments[0].style.visbility='hidden';", Email_editbox);
		Thread.sleep(2000);
		
		
		//visbility of web element
		js.executeScript("arguments[0].style.visbility='visible';", Email_editbox);
		
		//convert single drop down selection into multiple drop down
		WebElement Month_DD=driver.findElement(By.id("month"));
		js.executeScript("arguments[0].setAttribute('multiple','multiple')", Month_DD);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
