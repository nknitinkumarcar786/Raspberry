package acceptSelenium1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Javed {

	static {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
	
	public static void main(String[] args) {

		ChromeOptions opts = new ChromeOptions();
		opts.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opts);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.naukri.com");
		String pwh = driver.getWindowHandle();
		System.out.println("Parent window reference"+pwh);
		Set<String> whs = driver.getWindowHandles();
		int count = whs.size();
		System.out.println(count);
		System.out.println("Multiple window reference"+whs);
	}

}
