package CounterWebAppTestNGpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestNGFile {

	public String baseurl = "http://localhost:8080/CounterWebApp/";
	public String driverpath = "C:/Users/m1032732/Downloads/chromedriver_win32";
	public WebDriver driver;

	@Test
	public void CheckCurrectPageDisplayed() {

		System.out.println("Launching Chrome Browser");
		System.setProperty("webdriver.chrome.driver", driverpath + "/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(baseurl);
		String ExpectedTitle = "Welcome crevisei!!!";
		boolean BooleanValue = driver.getPageSource().contains(ExpectedTitle);
		Assert.assertEquals(true, BooleanValue);
	}

	@Test
	public void CheckWrongPageIsNotDisplayed() {
		System.setProperty("webdriver.chrome.driver", driverpath + "/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(baseurl);
		String ExpectedTitle = "HTTP Status 404 – Not Found";
		boolean BooleanValue = driver.getPageSource().contains(ExpectedTitle);
		Assert.assertEquals(false, BooleanValue);

	}

}
