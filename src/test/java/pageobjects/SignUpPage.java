package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Generics;

public class SignUpPage {

	public WebDriver driver;

	public SignUpPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="FormField_1_input")
	private WebElement emailaddresstextbox;
	
	@FindBy(id="FormField_2_input")
	private WebElement passwordtextbox;
	
	@FindBy(id="FormField_3_input")
	private WebElement confirmpasswordtextbox;
	
	@FindBy(id="firstName")
	private WebElement firstnametextbox;
	
	@FindBy(id="lastName")
	private WebElement lastnametextbox;
	
	@FindBy(id="FormField_13_input")
	private WebElement zipcodetextbox;
	
	@FindBy(id="registerButton")
	private WebElement getstartedbutton;
	
	@FindBy(xpath="//span[contains(text(),'My Account')]")
	private WebElement myaccounttext;
	
	public void enterEmailAddress(String email) {
		try {
			Generics.waitForElement(driver, emailaddresstextbox);
			emailaddresstextbox.click();
			emailaddresstextbox.clear();
			emailaddresstextbox.sendKeys(email);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void enterPassword(String password) {
		try {
			Generics.waitForElement(driver, passwordtextbox);
			passwordtextbox.click();
			passwordtextbox.clear();
			passwordtextbox.sendKeys(password);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void enterConfirmPassword(String confirmpassword) {
		try {
			Generics.waitForElement(driver, confirmpasswordtextbox);
			confirmpasswordtextbox.click();
			confirmpasswordtextbox.clear();
			confirmpasswordtextbox.sendKeys(confirmpassword);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void enterFirstName(String firstname) {
		try {
			Generics.waitForElement(driver, firstnametextbox);
			firstnametextbox.click();
			firstnametextbox.clear();
			firstnametextbox.sendKeys(firstname);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void enterLasttName(String lastname) {
		try {
			Generics.waitForElement(driver, lastnametextbox);
			lastnametextbox.click();
			lastnametextbox.clear();
			lastnametextbox.sendKeys(lastname);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void enterZipCode(String zipcode) {
		try {
			Generics.waitForElement(driver, zipcodetextbox);
			zipcodetextbox.click();
			zipcodetextbox.clear();
			zipcodetextbox.sendKeys(zipcode);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void clickGetStarted() {
		try {
			Generics.waitForElement(driver, getstartedbutton);
			getstartedbutton.click();
			Generics.waitForElement(driver, myaccounttext);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
