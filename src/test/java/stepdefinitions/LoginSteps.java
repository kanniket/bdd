package stepdefinitions;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.DriverManagerType;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjects.LoginPage;
import utilities.Base;

public class LoginSteps extends Base {
	
	@Given("^User Launch Chrome browser$")
	public void user_Launch_Chrome_browser() {
		WebDriverManager.getInstance(DriverManagerType.CHROME).setup();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@When("^User opens URL \"([^\"]*)\"$")
	public void user_opens_URL(String url) {
		driver.get(url);
	}

	@When("^Mouse hover on Account$")
	public void mouse_hover_on_Account() {
		loginPage = new LoginPage(driver);
		loginPage.mouseHoverOnAccount();
	}

	@When("^Click Login/Sign Up$")
	public void click_Login_Sign_Up() {
		loginPage = new LoginPage(driver);
		loginPage.clickLoginSignUp();
	}

	@When("^User enters Email as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
	public void user_enters_Email_as_and_Password_as(String arg1, String arg2) {
		loginPage = new LoginPage(driver);
		loginPage.enterUsernameAndPassword(arg1, arg2);
	}
	
	@When("^Wait till captcha is checked$")
	public void wait_Till_Captcha_Is_Checked() {
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@When("^Click on Login$")
	public void click_on_Login() {
		loginPage = new LoginPage(driver);
		loginPage.clickLogin();
	}

	@Then("^Page Title should be \"([^\"]*)\"$")
	public void page_Title_should_be(String title) {
		assertEquals(driver.getTitle(), title);
	}

	@Then("^close browser$")
	public void close_browser() {
		driver.close();
	}
}
