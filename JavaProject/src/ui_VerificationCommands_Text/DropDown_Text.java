package ui_VerificationCommands_Text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Text {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		
		//select state
		Select State_Drop_down=new Select(driver.findElement(By.xpath("//select[contains(@name,'stateName')]")));
		State_Drop_down.selectByVisibleText("Andhra Pradesh");
		Thread.sleep(5000);
		
		//Identify city dropdown
		WebElement City_Drop_Down=driver.findElement(By.xpath("//select[contains(@id,'customCity')]"));
		String Allcities=City_Drop_Down.getText();
		System.out.println(Allcities);
		
		if(Allcities.contains("Kurnool"))
		{
			System.out.println("Test Pass, Expected City Displayed");
		}
		{
			System.out.println("Test fail,Expected City is Not Displayed");
		}
		
		
		
		//Identify Locality
		WebElement Locality_DropDown=driver.findElement(By.xpath("//input[contains(@name,'localityName')]"));
		Locality_DropDown.clear();
		Locality_DropDown.sendKeys("Hyderabad");
	}

}
