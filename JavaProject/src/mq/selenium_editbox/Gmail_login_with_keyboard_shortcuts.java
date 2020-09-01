package mq.selenium_editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail_login_with_keyboard_shortcuts
{

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		

	driver.findElement(By.id("identifierId")).click();
	driver.findElement(By.id("identifierId")).sendKeys("jonnadaabhishek"+Keys.ENTER);
	driver.findElement(By.id("CwaK9")).click();
	
	driver.findElement(By.id("password")).click();
	driver.findElement(By.id("password")).sendKeys("7799137575"+Keys.ENTER);

	}

}
