package mq.selenium_links;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_Text_And_Partial_Link_Text 
{

	public static void main(String[] args) throws Exception
	{
    
		System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://cleartrip.com");
        driver.manage().window().maximize();
        
        Thread.sleep(5000);  
       
        driver.findElement(By.className("closeit")).click();
      
        
        driver.findElement(By.linkText("About Us")).click();
        driver.findElement(By.linkText("Jobs")).click();
        driver.findElement(By.linkText("Job Openings")).click();
        driver.findElement(By.linkText("Bangalore")).click();
        driver.findElement(By.linkText("← Back to Job openings")).click();
	}
	

}
