package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import config.ConfigReader;
import factory.DriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

    protected WebDriver driver;
    ConfigReader config;

    @BeforeMethod
    public void setup() {
    	config = new ConfigReader();
    	if(config.getBrowser().equalsIgnoreCase("chrome"))
    	{
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        }
    	driver.manage().window().maximize();
        driver.get(config.getUrl());
        
    }

    @AfterMethod
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}


