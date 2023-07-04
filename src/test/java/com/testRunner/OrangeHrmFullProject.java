package com.testRunner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmFullProject {
	static WebDriver driver;
	public static void driverLaunch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Practice\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	public static void UrlLaunch() throws Exception {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
	}
	public static void login() throws Exception {
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("Admin");
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("admin123");
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		Thread.sleep(3000);
	}
	public static void pimPage() throws Exception {
		WebElement pim = driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[2]"));
		pim.click();
		Thread.sleep(2000);
		WebElement addemp = driver.findElement(By.xpath("//a[text()='Add Employee']"));
		addemp.click();
		Thread.sleep(1000);
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstName']"));
		firstname.sendKeys("Dinesh");
		WebElement middlename = driver.findElement(By.xpath("//input[@name='middleName']"));
		middlename.sendKeys("Kumar");
		WebElement lastname = driver.findElement(By.xpath("//input[@name='lastName']"));
		lastname.sendKeys("M");
		WebElement empId = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
		empId.clear();
		empId.sendKeys("007");
		WebElement savebtn = driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']"));
		savebtn.click();
	}

	public static void main(String[] args) throws Exception {
		driverLaunch();
		UrlLaunch();
		login();
		pimPage();
	}
}
