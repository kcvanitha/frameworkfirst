package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishlistPage {

	@FindBy(xpath="//a[@class='close_cookies']")
	private WebElement cookieclose;
	
	@FindBy(xpath="//button[@aria-label='Play']")
	private WebElement playbtn;
	
	@FindBy(xpath="//button[@aria-label='Pause']")
	private WebElement pausebtn;
	
	@FindBy(xpath="//div[@class='wish_list_section']")
	private WebElement addtowishlist1;

	public void cookies()
	{
		cookieclose.click();
	}
	public WishlistPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void playbutton()
	{
		playbtn.click();
	}
	public void pausebutton()
	{
		pausebtn.click();
		
	}
	
	public void addtowishlist()
	{
		addtowishlist1.click();
	}
}

