package Interactions_Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_action_Click_and_Hold
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://marcojakob.github.io/dart-dnd/basic/");
		driver.manage().window().maximize();
	    Thread.sleep(2000);
	    
	   WebElement Doc_1=driver.findElement(By.xpath("(//img[@class='document'])[1]"));
	   WebElement Doc_2=driver.findElement(By.xpath("(//img[@class='document'])[2]"));
	   WebElement Doc_3=driver.findElement(By.xpath("(//img[@class='document'])[3]"));
	   WebElement Doc_4=driver.findElement(By.xpath("(//img[@class='document'])[4]"));
	   
	   WebElement Trash_bin=driver.findElement(By.xpath("//div[contains(@class,'trash')]"));
	   
	   new Actions(driver).clickAndHold(Doc_1).moveToElement(Trash_bin).release().perform();
	   new Actions(driver).clickAndHold(Doc_2).moveToElement(Trash_bin).release().perform();
	   new Actions(driver).clickAndHold(Doc_3).moveToElement(Trash_bin).release().perform();
	   new Actions(driver).clickAndHold(Doc_4).moveToElement(Trash_bin).release().perform();
	   
	}

}
