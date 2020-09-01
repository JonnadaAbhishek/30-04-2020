package Switch_Commands_Window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Switch_Btw_Multiple_windows_ReusableMethod 
{
	 static WebDriver driver;
	

	public static void switchTo_Window_with_title(String Exp_title)
	{
		
		//Get all dynamic window ID's
		Set<String> All_Window_IDS=driver.getWindowHandles();
		
		//Applying foreach window to iterator for all windows
		for (String EachWindowID : All_Window_IDS) 
		{
			driver.switchTo().window(EachWindowID);
			//After switch get window title
			String Runtime_Title=driver.getTitle();
			System.out.println(Runtime_Title);
			
			if(Runtime_Title.contains(Exp_title))
			{
				break; //At what window it break , It keep browser controls at same  window
			}
			
		}
		
	}
	
	
	
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.cleartrip.com/");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    
		//Capture current Window dynamic id
		String Main_windowID=driver.getWindowHandle();
		
		
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Check PNR Status']")).click();
		Thread.sleep(2000);
		
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Trains availability calendar']")).click();
		Thread.sleep(2000);
				
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Cancel trains tickets']")).click();
		Thread.sleep(2000);
				
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Rail Tour Packages']")).click();
		Thread.sleep(2000);
		
		
		switchTo_Window_with_title("Cancel Train Bookings Online Immediately | Process Walkthrough");
		System.out.println("=> "+driver.getTitle());
		Thread.sleep(5000);
		
		
		switchTo_Window_with_title("Rail Tour Packages");
		System.out.println("=> "+driver.getTitle());
		
		
		//Switch back to mainwindow
		driver.switchTo().window(Main_windowID);
		System.out.println("Main window title is => "+driver.getTitle());

	}

}