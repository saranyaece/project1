package maven.newmaven;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject.LandingPage;
import PageObject.LoginPage;
import resources.base;

public class HomePage extends base{
	
@Test(dataProvider="getData")
	public void basePageNavigation(String Username,String Password,String text) throws IOException
	{
		
		driver= initializeDriver();
		driver.get("http://www.qaclickacademy.com");
		LandingPage l=new LandingPage(driver);
		l.getlogin().click();
		LoginPage lp=new LoginPage(driver);
		lp.getemail().sendKeys(Username);
		lp.getpassword().sendKeys(Password);
		System.out.println(text);
		
		lp.getlogin().click();
	}

@DataProvider
public Object[][] getData()
{

	Object[][] data=new Object[2][3];
 data[0][0]="maha@gmail.com";
 data[0][1]="maha@gma";
 data[0][2]="maha@com";

 
 data[0][0]="maha33@gmail.com";
 data[1][1]="mahuyuagma";
 data[1][2]="majkjklhacom";
 return data;



}



}
