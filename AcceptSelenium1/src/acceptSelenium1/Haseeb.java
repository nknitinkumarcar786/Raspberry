package acceptSelenium1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Haseeb {

	static {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
	
	public static void main(String[] args) {

		ChromeOptions opts = new ChromeOptions();
		opts.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("file:///E:/8.html");
		List<WebElement> list = driver.findElements(By.xpath("//option"));
		System.out.println(list.size());
		WebElement drop = driver.findElement(By.id("fruits"));
		Select sel = new Select(drop);
		System.out.println(sel.isMultiple());
		System.out.println("==============================================");
		sel.selectByIndex(2);
		sel.selectByValue("c");
		sel.selectByVisibleText("Papaya");
		System.out.println("==============================================");
		sel.deselectAll();
		List<WebElement> item = sel.getOptions();
		for(WebElement i:item)
		{
			String s = i.getText();
			System.out.println(s);
		}
		System.out.println("==============================================");
		WebElement wrap = sel.getWrappedElement();
		String f = wrap.getText();
		System.out.println(f);
		System.out.println("==============================================");
		sel.selectByIndex(0);
		sel.selectByValue("c");
		sel.selectByVisibleText("Berries");
		List<WebElement> selected = sel.getAllSelectedOptions();
		System.out.println(selected.size());
		for(WebElement itemSelect:selected)
		{
			String d = itemSelect.getText();
			System.out.println(d);
		}
		System.out.println("==============================================");
		WebElement first = sel.getFirstSelectedOption();
		System.out.println(first.getText());
	}

}
