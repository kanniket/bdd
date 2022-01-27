package utilities;

import org.openqa.selenium.WebDriver;

import pageobjects.LoginPage;
import pageobjects.ResetPasswordPage;
import pageobjects.SignUpPage;

public class Base {
	
	public static WebDriver driver;
	public LoginPage loginPage;
	public SignUpPage signUpPage;
	public ResetPasswordPage resetPasswordPage;
}
