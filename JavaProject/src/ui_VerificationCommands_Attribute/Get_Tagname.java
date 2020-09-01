package ui_VerificationCommands_Attribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Get_Tagname {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement Month_Loc=driver.findElement(By.xpath("//select[contains(@id,'month')]"));
		String Month_Tagname=Month_Loc.getTagName();
		
		if(Month_Tagname.equals("select"))
			System.out.println("Month element is not a dropdown,because it doesnt contain select tag");
	}

}
