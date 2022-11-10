package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Skillraryloginpage
{
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearsbtn;
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement demoapp;
	
	@FindBy(name="q")
	private WebElement serachtb;
	
	@FindBy(xpath="//input[@value='go']")
	private WebElement searchbtn;
	
	public Skillraryloginpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void gearsbutton()
	{
		gearsbtn.click();
	}
	public void skillrarydemoapp()
	{
		demoapp.click();
	}

	public void serachtextbox(String coursename)
	{
		serachtb.sendKeys(coursename);
	}
	public void serachbutton()
	{
		searchbtn.click();
	}
	
}
