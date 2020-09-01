package ui_VerificationCommands_Attribute;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Retrieve_EditBox_Input_Value {

	public static void main(String[] args)
	{
		/*
		 * Scenario: Verifying departure date match with Current System date.
		 * 		Given site url is http://spicejet.com
		 * 		When user select oneway or roundtrip button
		 * 		Then verify departure date match with today's date.
		 */
		
		
		
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://spicejet.com");
		driver.manage().window().maximize();
		
		
		//Retrieve Depature Date from edit Box
		WebElement Dep_Date_Editbox=driver.findElement(By.id("ctl00_mainContent_view_date1"));
		String Ddate=Dep_Date_Editbox.getAttribute("value");
		System.out.println(Ddate);
		
		
		
		//Get Current System date in Java
		
		Date d=new Date();
		System.out.println("default system date is =>"  +d);
		
		
		//Convert Deafult system date as required using java
		SimpleDateFormat sdf=new SimpleDateFormat("dd//MM");
		String new_date=sdf.format(d);
		System.out.println("New system date is=>"+new_date);
		
		//Verify system date matches with departures
		if(new_date.equals(Ddate))
			System.out.println("Test pass,the depature date matches with system displayed");
		else
			System.out.println("Test fail,Mismatch between depture date and system date");
		
		
		
		/*
		 * Date formatters:-->
		 * 
		 * 		yyyy =>    year   [2020]
		 * 		  yy =>    year   [20]
		 * 		  MM =>    Month  [01-12]
		 * 		MMM  =>    Month  [Jan -Dec]
		 * 		EEE  =>    week   [sun -sat]
		 * 		  dd =>    date   [01-31]
		 * 		  hh =>    hour   [01-24]
		 * 		  mm =>    minute [01-60]
		 * 		  ss =>    Seconds[01-60]
		 * 		
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
