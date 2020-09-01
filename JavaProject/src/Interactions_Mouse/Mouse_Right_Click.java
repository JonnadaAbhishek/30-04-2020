package Interactions_Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Right_Click 
{

	public static void main(String[] args) throws Exception 
	{
	
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
	    Thread.sleep(2000);
	    
	    
	    
	    WebElement Right_Click=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		new Actions(driver).contextClick(Right_Click).perform();
		
		
	}

}
