package ui.VerificationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Get_Page_Title {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","G:\\30-04-2020\\JavaProject\\Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		
		
		
		String Run_timetitle=driver.getTitle();
		System.out.println("The Current window title is=>"   +Run_timetitle);
		
		  String title="Selenium HQ browser Automation";
		 boolean flag_title=driver.equals(Run_timetitle);		
	    
	    if(flag_title==true)
	    {
	    	System.out.println("Title presented for selenium home page");
	    	
	    	
	    	WebElement download_menu=driver.findElement(By.xpath("//a[@class='nav-item'][contains(.,'Downloads')]"));
	    	download_menu.click();
	    	
	    if(driver.getTitle().contains("download_menu"))
	    {
	    	System.out.println("The dowloads menu page is displayed");
	    }
	    else
	    {
	    	System.out.println("The downloads menu page title mismatche, page not displayed");
	    }
	    {
	    	System.out.println("Wronge title is presented by the selenium page");
	    }
	    
	    
	    
	}
	    
	    
	    
	    	
	    	
	    	
	    	
	    	
	    	
	    
	    
	}

}
