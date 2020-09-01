package mq.object_identifications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class obj_iden_at_wp
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver","Drivers\\geckodriver.exe");
		
        WebDriver driver=new FirefoxDriver();
        driver.get("http://facebook");
        driver.manage().window().maximize();
        
        driver.findElement(By.id("email")).sendKeys("Jonnadaabhi@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("7799137575");
        driver.findElement(By.className("loginbutton")).click();
        
        
        
	}

}
