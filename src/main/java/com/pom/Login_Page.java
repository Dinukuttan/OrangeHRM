package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseClass.BaseClass;

public class Login_Page extends BaseClass {
	
	public Login_Page() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='username']")	
	private WebElement username;
	@FindBy(xpath="//input[@name='password']")	
	private WebElement password;
	@FindBy(xpath="//button[@type='submit']")	
	private WebElement loginbtn;
	
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
}
