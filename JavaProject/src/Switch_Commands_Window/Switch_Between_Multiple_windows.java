package Switch_Commands_Window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Switch_Between_Multiple_windows
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.cleartrip.com/");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    
	    
	    //Capture current window id
	    String Main_window_ID=driver.getWindowHandle();
	    
	    //click external link to open new window
	    driver.findElement(By.xpath("(//a[@href='/trains'][contains(.,'Trains')])[2]")).click();
	    
	    //click external link to open new window
	    driver.findElement(By.xpath("//a[contains(@title,'Trains availability calendar')]"));
	    
	    //click external link to open new window
	    driver.findElement(By.xpath("//a[contains(@title,'Cancel trains tickets')]")).click();
	    
	    //click external link to open new window
	    driver.findElement(By.xpath("//a[@title='Rail Tour Packages']")).click();
	    
	    
	    //get all windows IDS
	    Set<String> All_Window_ids=driver.getWindowHandles();
	    
	    
	    //applying each window to iterate for all windows
	    
	    for (String EachWindow_ID : All_Window_ids) 
	    {
			driver.switchTo().window(EachWindow_ID);
			
			//After that get window title
			String Run_Time_Title=driver.getTitle();
			System.out.println(Run_Time_Title);
			
			
			if(Run_Time_Title.contains("Cancel trains tickets"))
			{
				break;
			}
	    	
	    	
		}
	    
	    System.out.println("Active window is=>"+driver.getTitle());
	    
	    Thread.sleep(3000);
	    
	    
	    //Clicking link at new window
	    WebElement New_page=driver.findElement(By.xpath("//strong[contains(.,'Tell us what you think')]"));
	    New_page.click();
	    
	    System.out.println("Acive window Title=>"+driver.getTitle());
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
