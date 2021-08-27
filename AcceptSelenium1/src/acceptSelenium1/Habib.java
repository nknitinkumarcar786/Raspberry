package acceptSelenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Habib {

	static {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
	
	public static void main(String[] args) {

		ChromeOptions opts = new ChromeOptions();
		opts.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opts);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("file:///E:/9.html");
		WebElement frame = driver.findElement(By.id("f1"));
		WebElement unTB = driver.findElement(By.id("t1"));
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(unTB));
		unTB.sendKeys("Kajal Agarwal");
		driver.switchTo().frame(0);
		WebElement pwTB = driver.findElement(By.id("t2"));
		wait.until(ExpectedConditions.visibilityOf(pwTB));
		pwTB.sendKeys("Mariko A");
		driver.switchTo().parentFrame();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('t1').value=' '");
		WebDriver driver1 = (WebDriver)js;
		wait.until(ExpectedConditions.visibilityOf(unTB));
		unTB.sendKeys("Darla Crane");
		driver1.switchTo().frame("f1");
		pwTB.sendKeys(Keys.CONTROL+"ax");
		wait.until(ExpectedConditions.visibilityOf(pwTB));
		pwTB.sendKeys("Rithika Sood");
		driver.switchTo().defaultContent();
		unTB.clear();
		wait.until(ExpectedConditions.visibilityOf(unTB));
		unTB.sendKeys("Meenakshi");
		driver.switchTo().frame(frame);
		pwTB.sendKeys(Keys.CONTROL+"a", Keys.DELETE);
		wait.until(ExpectedConditions.visibilityOf(pwTB));
		pwTB.sendKeys("Kamakshi");
	}

}
