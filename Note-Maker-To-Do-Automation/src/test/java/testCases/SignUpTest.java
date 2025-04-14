package testCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import pageObj.SignUpPage;
import testBase.Base;

public class SignUpTest extends Base {

	@Test (priority = 1)
	public void testSuccessfulSignUp() {
		SignUpPage signUpPage = new SignUpPage(driver);
		signUpPage.clickFirstSignUpButton();
		signUpPage.fillSignUpForm("Vikas Sahani", emailGenerator(), "1234567", "1234567");
		signUpPage.clickSecondSignUpButton();

	}

	@Test(priority = 2)
	public void testSignUpWithEmptyFields() {
		SignUpPage signUpPage = new SignUpPage(driver);
		signUpPage.clickFirstSignUpButton();
		signUpPage.fillSignUpForm("", "", "", "");
		signUpPage.clickSecondSignUpButton();

	}

	@Test(priority = 3)
	public void testSignUpWithInvalidEmail() {
		SignUpPage signUpPage = new SignUpPage(driver);
		signUpPage.clickFirstSignUpButton();
		signUpPage.fillSignUpForm("Vikas", "vsl@gmai", "1234567", "1234567");
		signUpPage.clickSecondSignUpButton();
		

	}

	@Test(priority = 4)
	public void testSignUpWithPasswordMismatch() {
		SignUpPage signUpPage = new SignUpPage(driver);
		signUpPage.clickFirstSignUpButton();
		signUpPage.fillSignUpForm("Vikas", "vs@gmail..com", "1234567", "7654321");
		signUpPage.clickSecondSignUpButton();

	}

	@Test(priority = 5)
	public void testSignUpWithWeakPassword() {
		SignUpPage signUpPage = new SignUpPage(driver);
		signUpPage.clickFirstSignUpButton();
		signUpPage.fillSignUpForm("Vikas", "vikas@gmail.com", "123", "123");
		signUpPage.clickSecondSignUpButton();

	}

	@Test(priority = 6)
	public void testSignUpWithExistingEmail() {
		SignUpPage signUpPage = new SignUpPage(driver);
		signUpPage.clickFirstSignUpButton();
		signUpPage.fillSignUpForm("Viki", "vikas@gmail.com", "1234567", "1234567");
		signUpPage.clickSecondSignUpButton();

	}

	public String emailGenerator() {
		return RandomStringUtils.randomAscii(5) + "@gmail.com";
	}

}
