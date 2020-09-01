package Switch_Commands_Window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Switch_To_Window 
   {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://Facebook.com");
	    driver.manage().window().maximize();
	    
	    //Switching to the sub window
	    String MainWindow_Id=driver.getWindowHandle();
	    System.out.println("The facebook page window ID is =>"  +MainWindow_Id);
	    
	    
	    driver.findElement(By.xpath("//a[contains(@title,'Take a look at Instagram')]")).click();
	    
	    Set<String> All_Window_IDS=driver.getWindowHandles();
	    for(String EachWindow_ID:All_Window_IDS)
	    {
	    	if(!EachWindow_ID.equals(MainWindow_Id))
	    	{
	    		driver.switchTo().window(EachWindow_ID);
	    		break;
	    		
	    	}
	    }
	    
	    System.out.println("Current focused window title is => "+driver.getTitle());
	    
	    
	    
	    
	}

}
