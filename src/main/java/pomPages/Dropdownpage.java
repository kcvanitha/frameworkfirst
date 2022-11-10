package pomPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dropdownpage

{
	@FindBy(name="addresstype")
	private WebElement dropdown;
	
	@FindBy(xpath="//h1[text()='Testing']")
	private WebElement testing;

}
