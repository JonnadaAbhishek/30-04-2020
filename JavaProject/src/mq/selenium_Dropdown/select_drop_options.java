package mq.selenium_Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class select_drop_options {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook");
		driver.manage().window().maximize();
		

	new Select(driver.findElement(By.id("day"))).selectByVisibleText("07");
	
	new Select(driver.findElement(By.id("month"))).selectByValue("november");
	
	new Select(driver.findElement(By.id("year"))).selectByIndex(26);
	
	
	}

}
