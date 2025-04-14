package pageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	  @FindBy(id = "email")
	    private WebElement emailInput;

	    @FindBy(id = "password")
	    private WebElement passwordInput;

	    @FindBy(xpath = "(//strong[contains(text(),'Login')])[2]")
	    private WebElement loginButton;

	    @FindBy(linkText = "Signup")
	    private WebElement signupLink;

	    @FindBy(xpath = "//p[text()='Forgot Password']")
	    private WebElement forgotPasswordText;

	    public void enterEmail(String email) {
	        emailInput.sendKeys(email);
	    }

	    public void enterPassword(String password) {
	        passwordInput.sendKeys(password);
	    }

	    public void clickLoginButton() {
	        loginButton.click();
	    }

	    public String getSignupLinkText() {
	        return signupLink.getText();
	    }

	    public String getForgotPasswordText() {
	        return forgotPasswordText.getText();
	    }
}
