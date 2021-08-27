package acceptSelenium1;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jabbar {
	
	static {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://qaclickacademy.com/practice.php");
		WebElement footer = driver.findElement(By.xpath("//div[@id='gf-BIG']"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		WebElement coloumn = driver.findElement(By.xpath("//div[@id='gf-BIG']//descendant::td[1]"));
		int count = coloumn.findElements(By.tagName("a")).size();
		for(int i=1;i<count;i++)
		{
			String next = Keys.chord(Keys.CONTROL, Keys.ENTER);
			coloumn.findElements(By.tagName("a")).get(i).sendKeys(next);
		}
		Iterator<String> whole = driver.getWindowHandles().iterator();
		while(whole.hasNext())
		{
			driver.switchTo().window(whole.next());
			System.out.println(driver.getTitle());
		}
	}

}
