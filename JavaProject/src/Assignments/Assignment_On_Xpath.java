package Assignments;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_On_Xpath
	{
     static WebDriver driver;
	
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.gecko.driver","G:\\30-04-2020\\JavaProject\\Drivers\\geckodriver.exe");
		driver=new FirefoxDriver();	
		driver.get("https://www.naukri.com/free-job-alerts");
		driver.manage().window().maximize();
		
		//inspect by id and xpath
		driver.findElement(By.id("Sug_kwdsugg")).sendKeys("Software Testing");
	    driver.findElement(By.xpath("(//div[@tabindex='-1'][contains(.,'Software Testing')])[1]")).click();
	    //waiting Time
	    // Thread.sleep(2000);
	    
	    //Id and Xpath
		driver.findElement(By.id("kwdsugg")).sendKeys("Automation Testing");
	    driver.findElement(By.xpath("(//div[@tabindex='-1'][contains(.,'Automation')])[1]")).click();
	    
	    driver.findElement(By.id("kwdsugg")).sendKeys("Selenium");
	    driver.findElement(By.xpath("(//div[@tabindex='-1'][contains(.,'Selenium')])[2]")).click();
	    
        //DropDown Inspections
	    new Select(driver.findElement(By.id("cjaExp"))).selectByVisibleText("1");
	    
	    new Select(driver.findElement(By.id("cjaMinSal"))).selectByVisibleText("3");
	    
	    
	    
	    
	}             

}


