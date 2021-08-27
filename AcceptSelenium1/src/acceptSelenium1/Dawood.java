package acceptSelenium1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dawood {

	static {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
	
	public static void main(String[] args) throws AWTException, InterruptedException {

		ChromeOptions opts = new ChromeOptions();
		opts.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opts);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.gmail.com");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("nknitincar786@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		WebDriverWait w = new WebDriverWait(driver, 10);
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("Papajaan2129#");
		w.until(ExpectedConditions.visibilityOf(pass));
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.xpath("//div[@gh='cm']")).click();
		driver.findElement(By.xpath("//img[@aria-label='Full screen (Shift for pop-out)']")).click();
		driver.findElement(By.xpath("//div[@class='a1 aaA aMZ']")).click();
		StringSelection select = new StringSelection("C:\\Users\\krishna\\Desktop\\Nitin Kumar G Betgeri CV.pdf");
		Toolkit tool = Toolkit.getDefaultToolkit();
		Clipboard clip = tool.getSystemClipboard();
		clip.setContents(select, null);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);
		Actions a = new Actions(driver);
		WebElement waterMark = driver.findElement(By.xpath("//div[text()='Recipients'"));
		a.moveToElement(waterMark).click(waterMark).sendKeys("krishnagb02@gmail.com",Keys.ENTER).perform();
		WebElement send = driver.findElement(By.xpath("//div[@class='dC']"));
		Thread.sleep(5000);
		send.click();
		r.keyPress(KeyEvent.VK_ENTER);
	}

}
