package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Rediff_Registration {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver","G:\\30-04-2020\\JavaProject\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();	
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	
		
		//inspect by using the name property:
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Jonnadaabhi");
		
		//inspect by using the xpath property
	    driver.findElement(By.xpath("//input[contains(@name,'login39ac9328')]")).sendKeys("jonnadaabhi@gmail.com");
	    
		driver.findElement(By.xpath("(//input[contains(@type,'button')])[1]")).click();
		
		//inspect by using the name property: 
		driver.findElement(By.name("passwd")).sendKeys("Abhishek123");
		

		driver.findElement(By.xpath("(//input[contains(@type,'password')])[2]")).sendKeys("Abhishek123");
		
		By.cssSelector("input[name='altemail']");	
		
		driver.findElement(By.linkText("checkbox")).click();
		
		driver.findElement(By.cssSelector("//*[@id=\"mobno\"]")).sendKeys("7799137575");
		
		new Select(driver.findElement(By.name("DOB_Day"))).selectByVisibleText("07");
		new Select(driver.findElement(By.name("DOB_Month"))).selectByVisibleText("NOV");
		new Select(driver.findElement(By.name("DOB_Date"))).selectByVisibleText("25");
		
		driver.findElement(By.xpath("//input[contains(@checked,'checked')]")).click();
		
		WebElement country=driver.findElement(By.id("country"));
	    Select sel=new Select(country);
	    sel.selectByVisibleText("INDIA");
	    
	   // WebElement city=driver.findElement(By.name("city"));
	   // Select sel1=new Select(city);
	    sel.selectByVisibleText("Agra");
	    
		
	}

	}


