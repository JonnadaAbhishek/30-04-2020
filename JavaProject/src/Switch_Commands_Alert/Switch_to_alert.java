package Switch_Commands_Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Switch_to_alert {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		WebElement Danger_btn=driver.findElement(By.xpath("//button[contains(@class,'btn btn-danger')]"));
		Danger_btn.click();
		Thread.sleep(3000);
		
		Alert alert=driver.switchTo().alert();
		
		String Alert_Text=alert.getText();
		System.out.println("Test displayed at web page=>"  +Alert_Text);
		
		alert.accept();
		
	}

}
