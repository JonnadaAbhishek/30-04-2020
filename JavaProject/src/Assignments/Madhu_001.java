package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Madhu_001 {

	public static void main(String[] args) throws Exception 
	{
				/*
				 * Scenario:--> Verify switch airports scenario
				 * 		Given site url is http://cleartrip.com
				 * 		When user selected From City
				 * 		And select To City
				 * 		And Cick on Switch airports button
				 * 		Then verify Switch applied between airports.
				 * 
				 */
				
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://cleartrip.com");
		driver.manage().window().maximize();
		Thread.sleep(10000);
				
				//selecting from city
				driver.findElement(By.xpath("//input[@id='FromTag']")).sendKeys("hyd");
				
				Thread.sleep(5000);
				
				driver.findElement(By.linkText("Hyderabad, IN - Rajiv Gandhi International (HYD)")).click();
				System.out.println("From city selected");
				
				
				//selecting to city
				driver.findElement(By.xpath("//input[@id='ToTag']")).sendKeys("ban");
				Thread.sleep(5000);
				
				driver.findElement(By.linkText("Bangalore, IN - Kempegowda International Airport (BLR)")).click();
				Thread.sleep(5000);
				System.out.println("To city selected");
				
				
				driver.findElement(By.id("PaxBlock")).click();

				//switching airpots
				driver.findElement(By.xpath("//a[contains(@title,'Switch airports')]")).click();
				System.out.println("switched");
				Thread.sleep(5000);
				
				String get_from=driver.findElement(By.xpath("//input[@id='FromTag']")).getAttribute("value");
				System.out.println(get_from);
				
				
				String get_to=driver.findElement(By.xpath("//input[@id='ToTag']")).getAttribute("value");
				System.out.println(get_to);
				
				if(get_from.equals("Bangalore, IN - Kempegowda International Airport (BLR)"))
				System.out.println("test pass");
						
				else
						
						System.out.println("test fail");
			}

		

	}

