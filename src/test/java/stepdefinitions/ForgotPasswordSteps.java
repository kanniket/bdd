package stepdefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.LoginPage;
import pageobjects.ResetPasswordPage;
import utilities.Base;

public class ForgotPasswordSteps extends Base {

	@When("^Click Forgot Password$")
	public void click_Forgot_Password() {
		loginPage = new LoginPage(driver);
		loginPage.clickForgotPassword();
	}

	@Then("^Enter Email as \"([^\"]*)\"$")
	public void enter_Email_as(String arg1) {
		resetPasswordPage = new ResetPasswordPage(driver);
		resetPasswordPage.enterEmailAddress(arg1);
	}

	@Then("^Click on Reset Password$")
	public void click_on_Reset_Password() {
		resetPasswordPage = new ResetPasswordPage(driver);
		resetPasswordPage.clickResetPasswordButton();
	}
}
