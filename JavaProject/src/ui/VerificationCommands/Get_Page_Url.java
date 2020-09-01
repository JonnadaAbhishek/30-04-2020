package ui.VerificationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Get_Page_Url
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","G:\\30-04-2020\\JavaProject\\Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		
		
		String Page_url=driver.getCurrentUrl();
		System.out.println("The current page url is a=>"  +Page_url);
		
		String Expected_url="https://www.selenium.dev/";
		boolean flag=Page_url.contains(Expected_url);
		
		if(flag==true)
		{
			System.out.println("Expected url displayed for selenium homepage");
			
			WebElement Download_Menu=driver.findElement(By.xpath("//a[@class='nav-item'][contains(.,'Downloads')]"));
			Download_Menu.click();
			
			//Decision to validate url of downlods page
			if(driver.getCurrentUrl().contains("downloads/"))
			{
				System.out.println("Downlaods page displayed");
			}
			else
			{
				System.out.println("Downloads page url mismatch, Page not displayed");
			}
			
			
		}
		else
		{
			System.out.println("Wrong url displayed for selenium webpage");
		}
		

	}

}
