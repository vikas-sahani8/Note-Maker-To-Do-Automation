package pageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	


    @FindBy(xpath = "//strong[contains(text(),'Sign Up')]")
    public WebElement signUpButton;

    @FindBy(xpath = "//strong[text()='Login']")
    public WebElement loginButton;

    @FindBy(xpath = "//p[contains(text(),'NoteMaster')]")
    public WebElement logoName;

    @FindBy(xpath = "//strong[contains(text(),'Get Started For Free')]")
    public WebElement getFreeBtn;

    @FindBy(xpath = "//div[@class='text-center md:text-left']//button[contains(text(), 'Try for Free')]")
    public WebElement firstTryFree;

    @FindBy(xpath = "//div[@class='mt-12']//button[contains(text(), 'Try for Free')]")
    public WebElement secTryFree;

    // Action Methods

    public void clickLogo() {
        logoName.click();
    }

    public void clickGetFree() {
        getFreeBtn.click();
    }

    public void clickFirstTryFree() {
        firstTryFree.click();
    }

    public void clickSecondTryFree() {
        secTryFree.click(); 
    }
    public void clickLogin() {
    	loginButton.click(); 
    }
}
