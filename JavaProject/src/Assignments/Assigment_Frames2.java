package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assigment_Frames2 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
	    driver.manage().window().maximize();
	    
	    WebElement iframe=driver.findElement(By.xpath("(//a[contains(@class,'analystic')])[2]"));
	    iframe.click();
	    Thread.sleep(3000);
	    
	    //Switch to frame with CssSelector
	    driver.switchTo().frame(driver.findElement(By.cssSelector("#Multiple > iframe:nth-child(1)")));
	    
	    //Switch to frame with the xpath
	    driver.switchTo().frame(driver.findElement(By.xpath("/html/body/section/div/div/iframe")));
	    
	    
	    WebElement EditBox=driver.findElement(By.xpath("//input[contains(@type,'text')]"));
	    EditBox.sendKeys("Jonnadaabhishek");
	   
	   
	    driver.switchTo().parentFrame();
	    
	    
	  //Get Controls from menu frame to webpage
	    driver.switchTo().defaultContent();
	    
	    
	    
	
	}
	
	

}
