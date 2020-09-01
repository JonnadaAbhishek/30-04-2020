package mercury_register;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class mercury_registeration {

	public static void main(String[] args) 
	{
		

		System.setProperty("webdriver.gecko.driver","G:\\30-04-2020\\JavaProject\\Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/mercurysignon.php");
	    driver.manage().window().maximize();
	    
	    //REGISTER 
	    driver.findElement(By.linkText("REGISTER")).click();
	    
	    //CONTACT INFORMATION
	    driver.findElement(By.name("firstName")).sendKeys("Jonnada"+Keys.TAB);
	    driver.findElement(By.name("lastName")).sendKeys("Abhishek"+Keys.TAB);
	    driver.findElement(By.name("phone")).sendKeys("7799137575"+Keys.TAB);
	    driver.findElement(By.name("userName")).sendKeys("Jonnadaabhi@gmail.com"+Keys.TAB);
	    
	    //MAILING INFORMATION
	    driver.findElement(By.name("address1")).sendKeys("18-3-599,doorno-59/A"+Keys.TAB);
	    driver.findElement(By.name("address2")).sendKeys("Charminar"+Keys.TAB);
	    driver.findElement(By.name("city")).sendKeys("Hyderabad"+Keys.TAB);
	    driver.findElement(By.name("state")).sendKeys("Telangana"+Keys.TAB);
	    driver.findElement(By.name("postalCode")).sendKeys("500053"+Keys.TAB);
	    
	    WebElement country=driver.findElement(By.name("country"));
	    Select sel=new Select(country);
	    sel.selectByVisibleText("INDIA");
	    
	    //USER INFORMATION
	    driver.findElement(By.name("email")).sendKeys("JonnadaAbhishek"+Keys.TAB);
	    driver.findElement(By.name("password")).sendKeys("7799137575"+Keys.TAB);
	    driver.findElement(By.name("confirmPassword")).sendKeys("7799137575"+Keys.ENTER);
	    
	    
	    
	    
	    
	    

	}

}
