package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObj.HomePage;
import testBase.Base;

public class HomeTest extends Base{
	
	   @Test(priority = 1)
	    public void testLogoIsDisplayed() {
	        HomePage homePage = new HomePage(driver);
	        Assert.assertTrue(homePage.logoName.isDisplayed(), "Logo is not displayed on the home page.");
	    }

	    @Test(priority = 2)
	    public void testSignUpAndLoginButtonsDisplayed() {
	        HomePage homePage = new HomePage(driver);
	        Assert.assertTrue(homePage.signUpButton.isDisplayed(), "'Sign Up' button is not visible.");
	        Assert.assertTrue(homePage.loginButton.isDisplayed(), "'Login' button is not visible.");
	    }

	    @Test(priority = 3)
	    public void testGetStartedForFreeButtonNavigation() {
	        HomePage homePage = new HomePage(driver);
	        homePage.clickGetFree();

	        String currentUrl = driver.getCurrentUrl();
	        Assert.assertTrue(currentUrl.contains("/page/login") || currentUrl.contains("register"),
	                "'Get Started For Free' button did not navigate to the expected page.");
	    }

	    @Test(priority = 4)
	    public void testTryForFreeButtonsVisibility() {
	        HomePage homePage = new HomePage(driver);
	        Assert.assertTrue(homePage.firstTryFree.isDisplayed(), "First 'Try for Free' button is not visible.");
	        Assert.assertTrue(homePage.secTryFree.isDisplayed(), "Second 'Try for Free' button is not visible.");
	    }

	    @Test(priority = 5)
	    public void testClickTryForFreeButtonsFunctionality() {
	        HomePage homePage = new HomePage(driver);
	        
	        
	        homePage.clickFirstTryFree();
	        String urlAfterFirstClick = driver.getCurrentUrl();
	        Assert.assertTrue(!urlAfterFirstClick.isEmpty(), "First 'Try for Free' click did not trigger navigation.");

	        driver.navigate().back();  
	      
	        homePage.clickSecondTryFree();
	        String urlAfterSecondClick = driver.getCurrentUrl();
	        Assert.assertTrue(!urlAfterSecondClick.isEmpty(), "Second 'Try for Free' click did not trigger navigation.");
	    }
	    
	    @Test(priority = 6)
	    public void testLogoTextMatchesWebsiteName() {
	        HomePage homePage = new HomePage(driver);
	        String actualLogoText = homePage.logoName.getText().trim();
	        String expectedLogoText = "NoteMaster";
	        Assert.assertEquals(actualLogoText, expectedLogoText, "Logo text does not match the expected website name.");
	    }
}