package Interactions_Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Drop_By 
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
	   
	   new Actions(driver).dragAndDrop(Doc_1, Trash_bin).perform();
	   new Actions(driver).dragAndDrop(Doc_2, Trash_bin).perform();
	   new Actions(driver).dragAndDrop(Doc_3, Trash_bin).perform();
	   new Actions(driver).dragAndDrop(Doc_4, Trash_bin).perform();


	   
	}

}
