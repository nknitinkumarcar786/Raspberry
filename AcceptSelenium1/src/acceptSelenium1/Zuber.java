package acceptSelenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Zuber {

	static {
		
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		
	}
	
	public static void main(String[] args) {

		FirefoxOptions fs = new FirefoxOptions();
		fs.addPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip");
		WebDriver driver = new FirefoxDriver(fs);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.seleniumhq.org/");
		driver.findElement(By.xpath("//span[text()='Downloads']")).click();
		int y = driver.findElement(By.xpath("//h2[text()='Selenium Clients and WebDriver Language Bindings']")).getLocation().getY();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,"+y+")");
		driver.findElement(By.xpath("//p[text()='Java']//ancestor::div//descendant::a[text()='3.141.59 (November 14, 2018)']")).click();
	}

}
