package utils;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {

    WebDriver driver;
   public static  WebDriverWait wait;

    public WaitUtils(WebDriver driver, int time) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(time));
    }

    public  void waitForElement(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public  void waitForClick(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
}



/*public class WaitUtils {

    WebDriver driver;
    WebDriverWait wait;

    public WaitUtils(WebDriver driver, int time) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void waitForElement(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void waitForClick(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
}
*/