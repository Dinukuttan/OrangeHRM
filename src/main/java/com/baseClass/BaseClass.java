package com.baseClass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	protected static WebDriver driver;
	public static WebDriver getDriver(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Practice\\Driver\\chromedriver.exe");
			driver=new ChromeDriver();
		} else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\eclipse-workspace\\Practice\\Driver\\chromedriver.exe");
			driver=new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\admin\\eclipse-workspace\\Practice\\Driver\\chromedriver.exe");
			driver=new EdgeDriver();
		}
		return driver;
	}
	public static void launchUrl(String Url) {
		driver.manage().window().maximize();
		driver.get(Url);
	}
	public static void clickonElement(WebElement element) {
		element.click();
	}
	public static void inputToElement(WebElement element,String value) {
		element.sendKeys(value);
	}
	public static void clearTheElement(WebElement element) {
		element.clear();
	}
	public static void navigatToUrl(String url) {
		driver.navigate().to(url);;
	}
	public static void Backspace(WebElement element) {
		element.sendKeys(Keys.BACK_SPACE);
	}
	public static void dropdownForSelect(WebElement element,String option,String value) {
		Select s = new Select(element);
		if (option.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		} else if(option.equalsIgnoreCase("text")){
			s.selectByVisibleText(value);
		} else if(option.equalsIgnoreCase("index")){
			int index = Integer.parseInt(value);
			s.deselectByIndex(index);
		}
	}
	public static void screenshot(String fileName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\admin\\eclipse-workspace\\cucumberproject\\OrangeHrm\\Screenshots\\"+fileName+".png");
		FileHandler.copy(src, dest);
	}
	public static void implicitWait(int sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}
}
