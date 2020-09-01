package mq.object_identifications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Object_Identification_At_Webpages {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("7799137575");
		driver.findElement(By.id("pass")).sendKeys("Jonnadaa7799");
		driver.findElement(By.id("loginbutton")).click();
		
	}

}
