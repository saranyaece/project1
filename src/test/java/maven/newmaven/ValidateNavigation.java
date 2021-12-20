package maven.newmaven;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.LandingPage;
import resources.base;

public class ValidateNavigation extends base
{
	
 @Test
	public void basePageNavigation() throws IOException
	{
		
		driver= initializeDriver();
		driver.get("http://www.qaclickacademy.com");
		LandingPage l=new LandingPage(driver);
		Assert.assertTrue(l.NavigationBar().isDisplayed());
		
	}

}
