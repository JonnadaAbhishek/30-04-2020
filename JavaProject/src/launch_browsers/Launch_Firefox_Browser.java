package launch_browsers;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_Firefox_Browser
	{

	public static void main(String[] args)
	{
		String path="G:\\30-04-2020\\JavaProject\\Drivers\\geckodriver.exe";
		
		System.setProperty("webdriver.gecko.driver", path);
		
		FirefoxDriver obj=new FirefoxDriver();
		
		obj.get("http://facebook");

	}

}
