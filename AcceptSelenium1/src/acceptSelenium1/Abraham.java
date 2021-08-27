package acceptSelenium1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Abraham {
	
	static {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com/");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst = new File("./photo/OSB.png");
		FileUtils.copyFile(src, dst);
	}

}
