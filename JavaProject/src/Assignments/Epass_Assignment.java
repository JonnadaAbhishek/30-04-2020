package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Epass_Assignment 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://epass.apcfss.in/");
	    driver.manage().window().maximize();
	    
	    driver.switchTo().frame("message");
	    
	    WebElement Official_login=driver.findElement(By.xpath("//a[@href='#'][contains(.,'Official Login')]"));
	    Official_login.click();
	    Thread.sleep(5000);
	    
	    String MainWindow_ID=driver.getWindowHandle();
	    System.out.println("epass page window id is => "+MainWindow_ID);
	    
	    driver.findElement(By.xpath("/html/body/center/form/div[1]/table/tbody/tr[4]/td[2]/input")).sendKeys("Jonnadaabhishek@gmail.com");
	    driver.findElement(By.cssSelector("#Logn > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(6) > td:nth-child(2) > input:nth-child(1)")).sendKeys("7799137575");
	    driver.findElement(By.xpath("/html/body/center/form/div[1]/table/tbody/tr[10]/td/input")).click();
	    
	    driver.switchTo().defaultContent();
	    
	    
	}
	

}
