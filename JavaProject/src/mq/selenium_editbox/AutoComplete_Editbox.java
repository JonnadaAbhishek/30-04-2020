package mq.selenium_editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AutoComplete_Editbox {

	public static void main(String[] args) throws Exception   {
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();

        driver.get("https://www.cleartrip.com/");
		
		driver.findElement(By.id("RoundTrip")).click();
		
		driver.findElement(By.id("FromTag")).clear();
		driver.findElement(By.id("FromTag")).sendKeys("HYD");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Hyderabad, IN - Rajiv Gandhi International (HYD)")).click();
		
		driver.findElement(By.id("ToTag")).clear();
	    driver.findElement(By.id("ToTag")).sendKeys("DEL");
	    Thread.sleep(5000);
		driver.findElement(By.linkText("New Delhi, IN - Indira Gandhi Airport (DEL)")).click();
		
		driver.findElement(By.xpath("//input[contains(@id,'DepartDate')]")).sendKeys("Thu, 21 May, 2020");
		
		driver.findElement(By.id("ReturnDate")).clear();
		driver.findElement(By.id("ReturnDate")).sendKeys("Sat, 7 Nov, 2020");
		
		driver.findElement(By.id("Adults")).clear();
		new Select(driver.findElement(By.id("Adults"))).selectByVisibleText("5");
		
		driver.findElement(By.id("MoreOptionsLink")).click();
		
		driver.findElement(By.id("Class")).click();
		new Select(driver.findElement(By.id("Class"))).selectByVisibleText("Class");
		
		
		
		

	}

}
