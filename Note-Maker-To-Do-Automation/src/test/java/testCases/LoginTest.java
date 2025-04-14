package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObj.HomePage;
import pageObj.LoginPage;
import testBase.Base;

public class LoginTest extends Base {

    @Test(priority = 1)
    public void testLoginWithValidCredentials() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);

        homePage.clickLogin();
        loginPage.enterEmail("vikas@gmail.com");
        loginPage.enterPassword("12345678");
        loginPage.clickLoginButton();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement welcomeText = wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//span[contains(text(), 'Hi, ')]")
        ));

        Assert.assertTrue(welcomeText.isDisplayed(), "'Hi, ' welcome text not visible after login.");
    }

    @Test(priority = 2)
    public void testLoginWithInvalidCredentials() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);

        homePage.clickLogin();
        loginPage.enterEmail("kjds@gmail.com");
        loginPage.enterPassword("123456");
        loginPage.clickLoginButton();
         
    }

    @Test(priority = 3)
    public void testSignupLinkText() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);

        homePage.clickLogin();
        String signupText = loginPage.getSignupLinkText();

        Assert.assertEquals(signupText, "Signup", "Signup link text mismatch.");
    }

    @Test(priority = 4)
    public void testForgotPasswordText() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);

        homePage.clickLogin();
        String forgotPasswordText = loginPage.getForgotPasswordText();

        Assert.assertEquals(forgotPasswordText, "Forgot Password", "Forgot Password text mismatch.");
    }
}
