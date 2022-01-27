package utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.function.Function;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Generics {

	// Generate random number
	public static String getRandomNumber(int length) {
		Random random = new Random();
		int randomNumber = 0;
		boolean loop = true;
		while (loop) {
			randomNumber = random.nextInt();
			if (Integer.toString(randomNumber).length() == length && !Integer.toString(randomNumber).startsWith("-")) {
				loop = false;
			}
		}
		return Integer.toString(randomNumber);
	}

	// Generate time stamp
	public static long generateTimeStamp() {
		long timestamp = new java.sql.Timestamp(System.currentTimeMillis()).getTime();
		return timestamp;
	}

	// Scroll Page
	public static void scrollPage(WebDriver driver, int number) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0," + number + ")", "");
	}

	// Wait condition
	public static void waitForElement(WebDriver driver, WebElement element) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	// Wait condition_2
	public static void waitForElementToInvisible(WebDriver driver, WebElement element) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 90);
		wait.until(ExpectedConditions.invisibilityOf(element));
	}

	// Wait condition_3
	public static void waitForElementToBeEnabled(WebDriver driver, WebElement element) throws InterruptedException {
		for (int i = 0; i <= 60; i++) {
			if (element.isEnabled()) {
				break;
			}
			Thread.sleep(1000);
		}
	}

	// Wait condition_4
	public static void refreshForElementToVisible(WebDriver driver, String locator, String presenttext)
			throws InterruptedException {
		for (int second = 0; second <= 120; second++) {
			String updatedprogressbar = driver.findElement(By.xpath(locator)).getText();
			if (updatedprogressbar.equalsIgnoreCase(presenttext)) {
				driver.navigate().refresh();
			} else if (updatedprogressbar != (presenttext)) {
				break;
			}
			Thread.sleep(1000);
		}
	}

	// Wait condition_4
	public static void waitForElementToClickable(WebDriver driver, String locator) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 90);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
	}

	// Wait condition_5
	public static void waitForFileDownloaded(WebDriver driver, final String path, final String fileName) {
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(40))
				.pollingEvery(Duration.ofMillis(500))
				.ignoring(NoSuchElementException.class, StaleElementReferenceException.class);
		wait.until(new Function<WebDriver, Object>() {
			@Override
			public Object apply(WebDriver x) {
				File[] files = new File(path).listFiles();
				for (File file : files) {
					if (file.getName().contains(fileName)) {
						return true;
					}
				}
				return false;
			}
		});
	}

	// Get current date
	public static String getCurrentDate() {
		String pattern = "dd/MM/yyyy";
		String dateInString =new SimpleDateFormat(pattern).format(new Date());
		return dateInString;
	}

	// Take Screenshot
	public static void takeScreenShots(WebDriver driver, String screenshot_path) {
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File(screenshot_path));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Upload File
	public void uploadDocument(WebDriver driver, WebElement firstuploadButton, WebElement seconduploadbutton,
			WebElement choosefile, String upload_file_path) throws InterruptedException {
		Generics.waitForElement(driver, firstuploadButton);
		firstuploadButton.click();
		Generics.waitForElement(driver, seconduploadbutton);
		choosefile.sendKeys(upload_file_path);
		seconduploadbutton.click();
		Generics.waitForElement(driver, firstuploadButton);
	}
	
	// Alert Accept
	public static void alertAction(WebDriver driver, String action) {
		if (action.equalsIgnoreCase("Yes")) {
			driver.switchTo().alert().accept();
		}
		else if (action.equalsIgnoreCase("No")) {
			driver.switchTo().alert().dismiss();
		}
	}
}
