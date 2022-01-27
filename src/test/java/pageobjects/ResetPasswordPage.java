package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Generics;

public class ResetPasswordPage {

	public WebDriver driver;

	public ResetPasswordPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	private WebElement emailaddresstextbox;
	
	@FindBy(xpath="//input[@class='button button--primary form-prefixPostfix-button--postfix']")
	private WebElement resetpasswordbutton;
	
	@FindBy(id="message")
	private WebElement message;
	
	public void enterEmailAddress(String email) {
		try {
			Generics.waitForElement(driver, emailaddresstextbox);
			emailaddresstextbox.click();
			emailaddresstextbox.click();
			emailaddresstextbox.sendKeys(email);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void clickResetPasswordButton() {
		try {
			Generics.waitForElement(driver, resetpasswordbutton);
			resetpasswordbutton.click();
			Generics.waitForElement(driver, message);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
