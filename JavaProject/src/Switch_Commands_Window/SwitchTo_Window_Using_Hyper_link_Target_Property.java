package Switch_Commands_Window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SwitchTo_Window_Using_Hyper_link_Target_Property 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://epass.apcfss.in/");
	    driver.manage().window().maximize();
	    
	    
	     //get current window dynamic ID
	     String MainwindowID=driver.getWindowHandle();
	     
	     //switch to frame
	     driver.switchTo().frame("message");
	     
	     //clicking on reports 
	     WebElement Reports=driver.findElement(By.xpath("//a[@href='Reports.html']"));
	     Reports.click();
	     Thread.sleep(3000);
	     
	     
	     //get controls back to web page
	     driver.switchTo().defaultContent();
	     
	     //switching to the frame 
	     driver.switchTo().frame("bodyFrame");
	     
	     //clicking hyper link under collage registration
	     WebElement Collage_REG=driver.findElement(By.xpath("//a[contains(.,'Colleges Registration Status')]"));
	     Collage_REG.click();
	     Thread.sleep(3000);
	     
	     //switching new window using hyper link target property
	     driver.switchTo().window("_new");
	     Thread.sleep(3000);
	     System.out.println("current window title=>"  +driver.getTitle());
	     
	     
	     
	     WebElement Academic_Year=driver.findElement(By.xpath("//select[contains(@name,'ac_year')]"));
	     new Select(Academic_Year).selectByVisibleText("3");
	     
	     
	     //close sub-window
	     driver.close();
	     
	     //get controls to the main page 
	     driver.switchTo().window(MainwindowID);
	     Thread.sleep(3000);
	     System.out.println("current window title=>"   +driver.getTitle());
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	    
	     
	     
	    
	    
	    
	}

}
