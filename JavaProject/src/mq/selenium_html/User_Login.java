package mq.selenium_html;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class User_Login {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        
        driver.findElement(By.id("login1")).clear();
        driver.findElement(By.id("login1")).sendKeys("jonnadaabhi");
        
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("123456");
        
        driver.findElement(By.id("proceed")).click();
        
    }

}
