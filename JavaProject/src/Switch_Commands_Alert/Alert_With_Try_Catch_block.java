package Switch_Commands_Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert_With_Try_Catch_block {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
	    Thread.sleep(2000);
	    
	    WebElement Danger_Btn=driver.findElement(By.xpath("//button[contains(@class,'btn btn-danger')]"));
	    Danger_Btn.click();
	    Thread.sleep(3000);
       
	    try 
	    {
			
			driver.switchTo().alert().accept();
			
		} catch (NoAlertPresentException e)
{
			e.printStackTrace();
		}
		
		
		System.out.println("Run continued");
		
	    
	    
	    
	}

}
