package mercury_register;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Mercury_Sign_On {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/mercurysignon.php");
	    driver.manage().window().maximize();
	    
	   driver.findElement(By.name("userName")).sendKeys("Jonnadaabhishek");
	   driver.findElement(By.name("password")).sendKeys("7799137575"+Keys.ENTER);
	   
	   WebElement triptype=driver.findElement(By.name("tripType"));
	    Select sel=new Select(triptype);
	    sel.selectByVisibleText("roundtrip");
	    
	    sel.selectByVisibleText("passCount");
	    sel.selectByVisibleText("fromPort");
	    sel.selectByVisibleText("fromMonth");

	    
	}

}
