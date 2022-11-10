package scripting;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.CorejavaPage;
import pomPages.Skillraryloginpage;
import pomPages.WishlistPage;

public class Testcase3 extends BaseClass
{
	@Test
		public void tc3() throws IOException, InterruptedException
		{
			Skillraryloginpage s1=new Skillraryloginpage(driver); 
			s1.serachtextbox(pdata.getdata("coursename"));
			s1.serachbutton();
			
			CorejavaPage cp=new CorejavaPage(driver);
			cp.java();
			
			
			WishlistPage wp=new WishlistPage(driver);
			wp.cookies();
			driverutilities.switchFrame(driver);
			Thread.sleep(3000);
			
			wp.playbutton();
			Thread.sleep(5000);
			wp.pausebutton();
			driverutilities.switchbackframe(driver);
			Thread.sleep(3000);
			wp.addtowishlist();
			
		}
	}

