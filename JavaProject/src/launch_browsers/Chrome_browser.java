package launch_browsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_browser {

	public static void main(String[] args) {
		
		String path="G:\\30-04-2020\\JavaProject\\Drivers\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",path);
		
		ChromeDriver obj=new ChromeDriver();
		
		obj.get("http://facebook.com");
		
	
	}
	

}
