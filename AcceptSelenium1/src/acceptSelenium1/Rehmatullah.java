package acceptSelenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Rehmatullah {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {

		ChromeOptions opts = new ChromeOptions();
		opts.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opts);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.vtiger.com");
		Actions a = new Actions(driver);
		WebElement madha = driver.findElement(By.xpath("//a[contains(text(),'Resources')]"));
		a.moveToElement(madha).perform();
		driver.findElement(By.xpath("//a[contains(text(),'Contact Us')]")).click();
		int y = driver.findElement(By.xpath("//h2[text()='Phone Sales & Support']")).getLocation().getY();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,"+y+")");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		String text = driver.findElement(By.xpath("//p[contains(text(),'U.S.')]//ancestor::div//descendant::p[contains(text(),'1-877-784-9277')]")).getText();
		WebElement element = driver.findElement(By.xpath("//p[contains(text(),'U.S.')]//ancestor::div//descendant::p[contains(text(),'1-877-784-9277')]"));
		wait.until(ExpectedConditions.visibilityOf(element));
		System.out.println(text);
		driver.close();
	}

}
