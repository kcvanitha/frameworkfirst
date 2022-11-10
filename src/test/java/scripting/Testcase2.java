package scripting;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.SkillraryDemo;
import pomPages.Skillraryloginpage;
import pomPages.TestingPages;

public class Testcase2 extends BaseClass
{
	@Test
	public void tc2() throws IOException
	{
		Skillraryloginpage sl=new Skillraryloginpage(driver);
	    sl.gearsbutton();
	    sl.skillrarydemoapp();
	    
	    driverutilities.switchtabs(driver);
	    
		SkillraryDemo sd=new SkillraryDemo(driver);
		driverutilities.dropdown(sd.getCoursedd(),pdata.getdata("dropdownopt"));

		TestingPages tp=new TestingPages(driver);
		driverutilities.draganddrop(driver, tp.getSeleniumtraining(),tp.getCart());
		
		Point loc =tp.getTwitter().getLocation();
		int x=loc.getX();
		int y=loc.getY();
		driverutilities.scrollBar(driver, x, y);
		
		tp.twitterlogo();
		
	}
	

}
