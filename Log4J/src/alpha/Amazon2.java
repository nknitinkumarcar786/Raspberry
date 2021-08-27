package alpha;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Amazon2
{
	private static Logger log = LogManager.getLogger(Amazon2.class.getName());
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		log.debug("Starting browser");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		log.info("Maximizing browser");
		driver.get("http://www.amazon.com");
		log.info("Injecting url");
		WebElement srchBox = driver.findElement(By.id("twotabsearchtextbox"));
		log.debug("Found the searchbox");
		Actions a = new Actions(driver);
		try
		{
			log.debug("Entered keys Comfortably");
			a.click(srchBox).keyDown(Keys.SHIFT).sendKeys("capital letters").doubleClick().perform();
			WebElement link = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
			a.moveToElement(link).contextClick().perform();
			log.debug("Performed the suitable actions");
		}
		catch(Exception e)
		{
			log.error("Its neither entering keys nor performing actions");
			log.fatal("Object not found");
		}
	}	
}
