package test;

import org.testng.annotations.Test;
import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void validLoginTest() {
        LoginPage lp = new LoginPage(driver);
        lp.login("Admin", "admin123");
    }
}
