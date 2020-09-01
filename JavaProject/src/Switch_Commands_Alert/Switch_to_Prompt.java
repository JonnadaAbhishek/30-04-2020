package Switch_Commands_Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Switch_to_Prompt {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		
		WebElement Prompt_tab=driver.findElement(By.xpath("//a[contains(.,'Alert with Textbox')]"));
		Prompt_tab.click();
		Thread.sleep(2000);
		
		
		WebElement Prompt_Link=driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		Prompt_Link.click();
		Thread.sleep(2000);

		Alert alert=driver.switchTo().alert();
		
		alert.sendKeys("I am abhishek From Hyderabad");
		
		alert.accept();
		
		if(alert.getText() != null)
			System.out.println("Test Pass,The text is dispalyed at the web page");
		
		else
			System.out.println("Test Fail,The Text is not diapkyed at the web page");
		
	}
	
	
	
	

}
