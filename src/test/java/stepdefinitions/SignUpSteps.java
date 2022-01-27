package stepdefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.LoginPage;
import pageobjects.SignUpPage;
import utilities.Base;

public class SignUpSteps extends Base {
	
	@When("^Click Sign Up$")
	public void click_Sign_Up() {
		loginPage = new LoginPage(driver);
		loginPage.clickSignUp();
	}

	@Then("^Enter Email Address as \"([^\"]*)\"$")
	public void enter_Email_Address_as(String arg1) {
		signUpPage = new SignUpPage(driver);
		signUpPage.enterEmailAddress(arg1);
	}

	@Then("^Enter Password as \"([^\"]*)\"$")
	public void enter_Password_as(String arg1) {
		signUpPage = new SignUpPage(driver);
		signUpPage.enterPassword(arg1);
	}

	@Then("^Enter Confirm Password as \"([^\"]*)\"$")
	public void enter_Confirm_Password_as(String arg1) {
		signUpPage = new SignUpPage(driver);
		signUpPage.enterConfirmPassword(arg1);
	}

	@Then("^Enter First Name as \"([^\"]*)\"$")
	public void enter_First_Name_as(String arg1) {
		signUpPage = new SignUpPage(driver);
		signUpPage.enterFirstName(arg1);
	}

	@Then("^Enter Last Name as \"([^\"]*)\"$")
	public void enter_Last_Name_as(String arg1) {
		signUpPage = new SignUpPage(driver);
		signUpPage.enterLasttName(arg1);
	}

	@Then("^Enter Zip as \"([^\"]*)\"$")
	public void enter_Zip_as(String arg1) {
		signUpPage = new SignUpPage(driver);
		signUpPage.enterZipCode(arg1);
	}

	@Then("^Click on Get Started$")
	public void click_on_Get_Started() {
		signUpPage = new SignUpPage(driver);
		signUpPage.clickGetStarted();
	}
}
