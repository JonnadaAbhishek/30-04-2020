package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment_Frames {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
	    driver.manage().window().maximize();
	    
	    driver.switchTo().frame("singleframe");
	    
	    WebElement Edit_Box=driver.findElement(By.xpath("//input[contains(@type,'text')]"));
	    Edit_Box.sendKeys("Jonnadaabhishek");
	    
	    String Runtime_Text=Edit_Box.getText();
	    System.out.println(Runtime_Text);
	    
	   
	    driver.switchTo().defaultContent();
	}

}