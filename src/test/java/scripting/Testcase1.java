package scripting;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.Addtocart;
import pomPages.SkillraryDemo;
import pomPages.Skillraryloginpage;

public class Testcase1 extends BaseClass
{
	@Test
	public void tc1() throws InterruptedException
	{
		Skillraryloginpage s1=new Skillraryloginpage(driver);
		s1.gearsbutton();
		s1.skillrarydemoapp();
	
		driverutilities.switchtabs(driver);
		
		SkillraryDemo sd=new SkillraryDemo(driver);
		driverutilities.mouseHover(driver,sd.getCoursetab());
		sd.seleniumtrainingbtn();
		
		Addtocart ad=new Addtocart(driver);
		driverutilities.doubleClick(driver,ad.getPlus());
		ad.cartbutton();
		
		Thread.sleep(3000);
		driverutilities.alertpopup(driver);
	}


}
