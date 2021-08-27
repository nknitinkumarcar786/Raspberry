package acceptSelenium1;
import org.openqa.selenium.chrome.ChromeDriver;
public class Jalikattu {

	public static void main(String[] args) {

		String key = "webdriver.chrome.driver";
		String value = "./driver/chromedriver.exe";
		System.setProperty(key, value);
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.xvideos3.com");
	}

}
