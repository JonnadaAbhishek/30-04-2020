package mq.selenium_html;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Send_Keys_Examples  {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("firstname")).sendKeys("jonnada"
		+Keys.TAB,"Abhishek"
		+Keys.TAB,"7799137575"
		+Keys.TAB,"Jonnadaabhishek"
		+Keys.TAB);
		
		driver.findElement(By.id("day")).sendKeys("24");
		
		driver.findElement(By.id("month")).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		
	
		
	}

}
