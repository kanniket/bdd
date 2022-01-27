package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Generics;

public class LoginPage {

	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//li[@class='accountNav']//button")
	private WebElement accountlink;
	
	@FindBy(xpath="(//li[@class='accountNav']//span)[1]")
	private WebElement login_signuplink;
	
	@FindBy(id="login_email")
	private WebElement emailaddresstextbox;
	
	@FindBy(id="login_pass")
	private WebElement passwordtextbox;
	
	@FindBy(xpath="(//span[@id='recaptcha-anchor']/div)[1]")
	private WebElement  capchacheckbox;
	
	@FindBy(id="loginBtn")
	private WebElement loginbutton;
	
	@FindBy(xpath="//span[contains(text(),'My Account')]")
	private WebElement myaccounttext;
	
	@FindBy(xpath="//a[@class='signupBtn desktoponly event_profile_register']")
	private WebElement signupbutton;
	
	@FindBy(xpath="//div[@class='title']")
	private WebElement signuptitle;
	
	@FindBy(xpath="//a[@class='forgot-password']")
	private WebElement forgotpasswordlink;
	
	public void mouseHoverOnAccount() {
		Actions actions = new Actions(driver);
		actions.moveToElement(accountlink).perform();
	}
	
	public void clickLoginSignUp() {
		try {
			Generics.waitForElement(driver, login_signuplink);
			login_signuplink.click();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void enterUsernameAndPassword(String username, String password) {
		try {
			Generics.waitForElement(driver, emailaddresstextbox);
			emailaddresstextbox.click();
			emailaddresstextbox.clear();
			emailaddresstextbox.sendKeys(username);
			
			Generics.waitForElement(driver, passwordtextbox);
			passwordtextbox.click();
			passwordtextbox.clear();
			passwordtextbox.sendKeys(password);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void clickLogin() {
		try {
			Generics.waitForElement(driver, loginbutton);
			loginbutton.click();
			Generics.waitForElement(driver, myaccounttext);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void clickSignUp() {
		try {
			Generics.waitForElement(driver, signupbutton);
			signupbutton.click();
			Generics.waitForElement(driver, signuptitle);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void clickForgotPassword() {
		try {
			Generics.waitForElement(driver, forgotpasswordlink);
			forgotpasswordlink.click();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
