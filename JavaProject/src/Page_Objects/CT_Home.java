package Page_Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CT_Home 
{
	@FindBy(xpath = "(//a[@href='/flights'])[2]") 
	public WebElement Flights;
	
	@FindBy(xpath = "(//a[@href='/hotels'])[2]") 
	public WebElement Hotels;
	
	@FindBy(xpath = "//a[@title='Find trains to destinations within India']") 
	public WebElement Trains;

}
