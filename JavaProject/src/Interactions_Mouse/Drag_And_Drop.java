package Interactions_Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Drop 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://marcojakob.github.io/dart-dnd/free_dragging/");
		driver.manage().window().maximize();
		
		WebElement Dragger=driver.findElement(By.xpath("//div[contains(@class,'draggable')]"));
		new Actions(driver).dragAndDropBy(Dragger, 1000, 0).perform();
		
	}

}
