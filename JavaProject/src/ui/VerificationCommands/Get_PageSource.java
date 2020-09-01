package ui.VerificationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Get_PageSource {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver","G:\\30-04-2020\\JavaProject\\Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();

		String Run_Pagesource=driver.getPageSource();
		System.out.println(Run_Pagesource);
		
		boolean flag1=Run_Pagesource.contains(Run_Pagesource);
		
		if(flag1==true)
		{
			System.out.println("Expected page source is diplayed for selenium");
			
			WebElement menu=driver.findElement(By.xpath("//a[@class='nav-item'][contains(.,'Downloads')]"));
			menu.click();
			
			
			if(driver.getPageSource().contains(Run_Pagesource))
			{
				System.out.println("Downlaods page displayed");
			}
			else
			{
				System.out.println("Downloads page source mismatch, Page not displayed");
			}
			
			
		}
		else
		{
			System.out.println("Wrong pagesource displayed for selenium webpage");
		}
		

	}

}
