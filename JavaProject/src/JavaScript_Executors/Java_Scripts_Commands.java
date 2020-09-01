package JavaScript_Executors;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Java_Scripts_Commands 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver","G:\\30-04-2020\\JavaProject\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://Facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//Enable java script executor at automation web broswer
		JavascriptExecutor Js=((JavascriptExecutor)driver);
		
		
		//Typing Characters into edit box using java script
		Js.executeScript("document.getElementById('email').value='qadarshan@gmail.com'");
		Js.executeScript("document.getElementById('pass').value='Hello1234567'");
		
		//Java Script using xpath
		driver.findElement(By.xpath("//input[contains(@id,'u_0_q')]"));
		
		
		
		
		
	}

}
