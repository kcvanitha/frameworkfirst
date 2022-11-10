package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPages
{
   @FindBy(xpath="(//a[text()='Selenium Traaining')[2]")
   private WebElement seleniumtraining;
   
   @FindBy(xpath="id=cartArea")
   private WebElement cart;

   public WebElement getSeleniumtraining() {
	return seleniumtraining;
}

public WebElement getCart() {
	return cart;
}

public WebElement getTwitter() {
	return twitter;
}

@FindBy (xpath="(//i[@class='fa fa-twitter'])[2]")
    private WebElement twitter;

public TestingPages(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void twitterlogo()
{
	twitter.click();
}

}
