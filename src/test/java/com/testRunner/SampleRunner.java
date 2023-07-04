package com.testRunner;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.baseClass.BaseClass;

public class SampleRunner extends BaseClass {

	@BeforeMethod
	private void UrlLaunch() {
		getDriver("chrome");
		launchUrl("https://www.google.com");
	}
	@Test(priority = 0)
	private void searchInput1() throws Exception {
		WebElement element =driver.findElement(By.id("APjFqb"));
		inputToElement(element, "chennai");
		element.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		screenshot("chennai");
	}
	
	@Test(priority = 1)
	private void searchInput2() throws  Exception {
		WebElement element =driver.findElement(By.id("APjFqb"));
		inputToElement(element, "mumbai");
		element.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		screenshot("mumbai");
	}
@AfterMethod
	private void screenshot() {
	
		driver.quit();
	}
}
