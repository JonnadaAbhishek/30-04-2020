package mq.selenium_editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class editbox_new {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver","G:\\30-04-2020\\JavaProject\\Drivers\\IEDriverServer.exe");
		InternetExplorerDriver driver=new InternetExplorerDriver();
		
        driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("RoundTrip")).click();
		
		driver.findElement(By.id("FromTag")).clear();
		driver.findElement(By.id("FromTag")).sendKeys("HYD");
		driver.findElement(By.linkText("Hyderabad, IN - Rajiv Gandhi International (HYD)")).click();
		
		driver.findElement(By.id("ToTag")).clear();
	    driver.findElement(By.id("ToTag")).sendKeys("DEL");
		driver.findElement(By.linkText("New Delhi, IN - Indira Gandhi Airport (DEL)")).click();
		
		driver.findElement(By.id("FromDate")).sendKeys("Thu, 21 May, 2020");
		

	}

}
