package mq.selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Driver_Interface
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","Drivers\\\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://google.com");
		
		driver.get("http://facebook.com");
		
	}
		
		@SuppressWarnings("null")
		public void logoutProcess() {
		    WebDriver webDriver = null;
			webDriver.get("https://www.facebook.com/");
		    webDriver.manage().window().setSize(new Dimension(1382, 744));
		    webDriver.findElement(By.id("u_0_t")).sendKeys("jonnada");
		    webDriver.findElement(By.id("u_0_v")).sendKeys("Abhishek");
		    webDriver.findElement(By.id("u_0_y")).sendKeys("7799137575");
		    webDriver.findElement(By.id("u_0_13")).sendKeys("123456");

	}

}
