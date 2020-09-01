package mq.selenium_editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail_login_with_shortscutkeys {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://chrome.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("identifierId")).click();
		driver.findElement(By.id("identifierId")).sendKeys("jonnadaabhishek"+Keys.ENTER);
		
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys("7799137575"+Keys.ENTER);

	}

}
