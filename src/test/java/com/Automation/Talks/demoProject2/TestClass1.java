package com.Automation.Talks.demoProject2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class TestClass1 {

	public static WebDriver driver;

	/*public static final String USERNAME = "vijendra11";
	public static final String AUTOMATE_KEY = "KjszawGpsgMzaMj2xyx5";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";*/

	@BeforeMethod
	public void launchDriver() throws MalformedURLException {
		
		DesiredCapabilities dr = null;
		
		dr = DesiredCapabilities.chrome();
		dr.setBrowserName("chrome");
		dr.setPlatform(Platform.WIN10);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\17786\\chromedriver_win32\\chromedriver.exe");
		
		driver = new RemoteWebDriver(new URL("http://192.168.0.19:4444/wd/hub") , dr);
		
		/*DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("browser", "Firefox");
		caps.setCapability("browser_version", "60.0");
		caps.setCapability("os", "Windows");
		caps.setCapability("os_version", "7");
		caps.setCapability("resolution", "1024x768");
		caps.setCapability("name", "Bstack-[Java] Sample Test");

		driver = new RemoteWebDriver( new URL(URL), caps);*/

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().fullscreen();
	}

	@Test
	public void test1() {

		driver.navigate().to("https://automationtalks.com/");

		System.out.println("Test 1 title is " + driver.getTitle());

	}

	@Test
	public void test2() {

		driver.navigate().to("https://automationtalks.com/");

		System.out.println("Test 2 title is " + driver.getTitle());

	}

	@Test
	public void test3() {

		driver.navigate().to("https://automationtalks.com/");

		System.out.println("Test 3 title is " + driver.getTitle());

	}

	@AfterMethod
	public void quit() {

		driver.quit();
	}

}
