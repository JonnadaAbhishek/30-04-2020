package Switch_Commands_Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Switch_Alert_Cancel {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
	WebElement cancel_btn=driver.findElement(By.xpath("//a[contains(.,'Alert with OK & Cancel')]"));
	cancel_btn.click();
	Thread.sleep(2000);
	
	WebElement Danger_btn=driver.findElement(By.xpath("//button[contains(@class,'btn btn-primary')]"));
	Danger_btn.click();
	Thread.sleep(2000);
	
	Alert alert=driver.switchTo().alert();
	
	String Alert_txt=alert.getText();
	System.out.println("The text diplayed at the web page=>"   +Alert_txt);
	
	
	alert.dismiss();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	alert.accept();		
	
	}
	
	

}
