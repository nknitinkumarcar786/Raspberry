package alpha;
import org.apache.logging.log4j.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import alpha.Amazon;
public class Amazon
{
	private static Logger log = LogManager.getLogger(Amazon.class.getName());
	public static void main(String[] args) 
	{
		log.debug("Setting chrome driver property");
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		log.info("Window Maximized");
		log.debug("Now hitting Amazon server");
		driver.get("https://www.amazon.com/");
		log.info("Landed on amazon home page");
		Actions a =new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"))) .click().keyDown(Keys.SHIFT).sendKeys("capitalletters").doubleClick().build().perform();
		a.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).build().perform();
		a.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).contextClick().build().perform();
	}
}