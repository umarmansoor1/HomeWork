package HomeWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Google {
	

	@Test
	public void GoogleTest() {
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		String url = "https://www.google.com/";
		driver.get(url);
		String abc = "Google";
		String xyz = driver.getTitle();
		Assert.assertEquals(abc, xyz);
	}

}
