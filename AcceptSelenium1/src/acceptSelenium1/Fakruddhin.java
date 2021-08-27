package acceptSelenium1;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fakruddhin {

	static {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
	
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String[] array = {"Cucumber", "Brocolli", "Tomato", "Carrot", "Beetroot"};
		List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));
		Thread.sleep(4000);
		int j = 0;
		for(int i=0;i<products.size();i++)
		{
			String name = products.get(i).getText();
			String[] check = name.split("-");
			String get = check[0].trim();
			List<String> checkList = Arrays.asList(array);
			if(checkList.contains(get))
			{
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				j++;
			}
			if(j == array.length)
			{
				break;
			}
		}
	}

}
