package ui.VerificationCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Page_Verification_Commands 
{
     
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver","G:\\30-04-2020\\JavaProject\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();	
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	   
	   //capture runtime tilte:
	   String run_time_title=driver.getTitle();
	   System.out.println("The current tilte=>" +run_time_title);
	   
	   //Capture Run time url:
	   String run_time_url=driver.getCurrentUrl();                
	   System.out.println("The current url=>" +run_time_url);
	   
	   //Capture run time window handle:
	   String run_time_window_id=driver.getWindowHandle();
	   System.out.println("The current window handle=>"  +run_time_window_id);
	   
	   
	   //Capture run time page source:
	   String run_time_pagesource=driver.getPageSource();
	   System.out.println(run_time_pagesource);
	   
	   //Waiting time
	   Thread.sleep(1000);
	  
	   
	   
	   
	}

}
