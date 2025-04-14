package pageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends BasePage {
	
	public SignUpPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "(//button[contains(@class, 'bg-primary-400')]/strong[text()='Sign Up'])[1]")
	WebElement signUpbtnOne;
	
	@FindBy(xpath = "//input[@id='name' and @placeholder ='Enter your name']")
	WebElement inputName;
	
	@FindBy(xpath = "//input[@id='email' and @placeholder ='Enter your email']")
	WebElement  inputEmail;
	
	@FindBy(xpath = "//input[@id='password' and @placeholder ='Enter your password']")
	WebElement inputPassword;
	
	@FindBy(xpath = "//input[@id='confirmPassword' and @placeholder ='Confirm your password']")
	WebElement inputConfirmPassword;
	
	@FindBy(xpath = "(//button[contains(@class, 'bg-primary-400')]/strong[text()='Sign Up'])[2]")
	WebElement signUpbtnTwo;
	
	
	
	public void fillSignUpForm(String name, String email, String password, String confirmPassword) {
        inputName.sendKeys(name);
        inputEmail.sendKeys(email);
        inputPassword.sendKeys(password);
        inputConfirmPassword.sendKeys(confirmPassword);
    }

    public void clickFirstSignUpButton() {
        signUpbtnOne.click();
    }

    public void clickSecondSignUpButton() {
        signUpbtnTwo.click();
    }
	
	 
}
