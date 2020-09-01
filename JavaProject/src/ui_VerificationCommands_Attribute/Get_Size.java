package ui_VerificationCommands_Attribute;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Get_Size {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement Month_Loc=driver.findElement(By.xpath("//select[contains(@id,'month')]"));
		
		Dimension Obj_Dimension=Month_Loc.getSize();
		int obj_Height=Obj_Dimension.getHeight();
		int obj_Width=Obj_Dimension.getWidth();
		
		
		System.out.println("The height is=>"+obj_Height);
		System.out.println("The Width id=>"+obj_Width);
		
		
		if(obj_Height>0)
			System.out.println("Object visible at webpage");
		else
			System.out.println("object not visible at web page ");
	}

}
