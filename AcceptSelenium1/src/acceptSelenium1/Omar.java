package acceptSelenium1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Omar {
	
	static
	{
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	
	}
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companions");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//input[@id='travel_date']")).click();
		driver.findElement(By.xpath("(//th[@class='datepicker-switch'])[1]")).click();
		Thread.sleep(3000);
		while(!driver.findElement(By.xpath("(//th[@class='datepicker-switch'])[2]")).getText().contains("2022"))
		{
			driver.findElement(By.xpath("(//th[@class='next'])[2]")).click();
		}
		Thread.sleep(3000);
		List<WebElement> months = driver.findElements(By.xpath("//span[@class='month']"));
		int mcount = months.size();
		for(int i=0;i<mcount;i++)
		{
			String month = months.get(i).getText();
			if(month.contains("Sep"))
			{
				months.get(i).click();
				break;
			}
		}
		Thread.sleep(3000);
		List<WebElement> days = driver.findElements(By.xpath("//td[@class='day']"));
		int dcount = days.size();
		for(int i=0;i<dcount;i++)
		{
			String day = days.get(i).getText();
			if(day.contains("21"))
			{
				days.get(i).click();
				break;
			}
		}
	}

}
