package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	private static ThreadLocal<WebDriver> drive = new ThreadLocal<>();
	public static void setDriver(String browser) {
		if(browser.equalsIgnoreCase("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		drive.set(new ChromeDriver());
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			drive.set(new FirefoxDriver());
		}
		drive.get().manage().window().maximize();
		}
	public static WebDriver getDriver()
	{
		return drive.get();
	}
	public static void quitDriver() {
		if(drive.get() != null)
		{
			drive.get().quit();
			drive.remove();
		}
		
	}
}
