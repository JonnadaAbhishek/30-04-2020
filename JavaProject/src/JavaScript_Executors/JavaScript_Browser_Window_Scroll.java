package JavaScript_Executors;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScript_Browser_Window_Scroll {

	public static void main(String[] args) throws Exception
	{
		//Locate chrome browser in currnet system
				System.setProperty("webdriver.gecko.driver","G:\\30-04-2020\\JavaProject\\Drivers\\geckodriver.exe");
				WebDriver driver=new FirefoxDriver();
				driver.get("http://facebook.com");  //Load webpage
				driver.manage().window().maximize();  //maximize browser window
				
				//Scroll Window vertically
				((JavascriptExecutor)driver).executeScript
				("window.scroll(100,700)");
				Thread.sleep(2000);
				
				//Scroll Window Horizanally
				((JavascriptExecutor)driver).executeScript
				("window.scroll(200,700)");
				
				
				
	}

}
