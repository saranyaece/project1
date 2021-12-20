package resources;



import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
public WebDriver driver;
	
	


	public WebDriver initializeDriver() throws IOException 
	{
		
		Properties prop = new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\newmaven\\src\\main\\java\\resources\\data.properties");
		
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
			//number
	
		
		
	
		
		
	
	return driver;
	
		
		
		
	}
}

