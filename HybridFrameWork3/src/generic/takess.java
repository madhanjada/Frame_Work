package generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class takess 
{
	public static void screenshot(WebDriver driver) throws IOException
	{
		String photo="./photoes/";
	 Date d = new Date();	
		TakesScreenshot s = (TakesScreenshot) driver;
        File src = s.getScreenshotAs(OutputType.FILE);
		File dst = new File("photo.jpeg");
		FileHandler.copy(src, dst);
	}
}
