package JavaScript_Executors;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.json.JsonException;

public class Java_script_Highlighter 
{

	public static void main(String[] args)
	{
				//Locate chrome browser in currnet system
				System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();  //Launch browser
				driver.get("http://facebook.com");  //Load webpage
				driver.manage().window().maximize();  //maximize browser window
				
				
				//Create Interface for jsexecutor
				JavascriptExecutor js=((JavascriptExecutor)driver);
				
				//Identify Element
				WebElement Reg_Header=driver.findElement(By.xpath("//span[contains(.,'Create an account')]"));
				
				//highlight text using jsexecutor
				js.executeScript("arguments[0].style.backgroundColor='yellow'",Reg_Header);
				
				//Set outline for text
				js.executeScript("argumrnts[0].style.outline= ='red solid 2px'", Reg_Header);
				
				//Set outline for dropdown
				js.executeScript("document.getElementById('month').style.outline='green solid 2px'");
				
				
				
				
				
				
				
				
				
				
	}

}
