package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseClass.BaseClass;

public class PimPage extends BaseClass {
public PimPage() {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath = "(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[2]")
private WebElement pim;
@FindBy(xpath = "//a[text()='Add Employee']")
private WebElement addemp;
@FindBy(xpath = "//input[@name='firstName']")
private WebElement firstname;
@FindBy(xpath = "//input[@name='middleName']")
private WebElement middlename;
@FindBy(xpath = "//input[@name='lastName']")
private WebElement lastname;
@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
private WebElement empId;
@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
private WebElement savebtn;
@FindBy(xpath = "//span[@ class='oxd-switch-input oxd-switch-input--active --label-right']")
private WebElement createlogindetails;
@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[3]")
private WebElement username;
@FindBy(xpath = "(//input[@type='password'])[1]")
private WebElement password;
@FindBy(xpath = "(//input[@type='password'])[2]")
private WebElement confirmpass;
public WebElement getUsername() {
	return username;
}
public WebElement getPassword() {
	return password;
}
public WebElement getConfirmpass() {
	return confirmpass;
}
public WebElement getCreatelogindetails() {
	return createlogindetails;
}
public WebElement getPim() {
	return pim;
	
}
public WebElement getAddemp() {
	return addemp;
}
public WebElement getFirstname() {
	return firstname;
}
public WebElement getMiddlename() {
	return middlename;
}
public WebElement getLastname() {
	return lastname;
}
public WebElement getEmpId() {
	return empId;
}
public WebElement getSavebtn() {
	return savebtn;
}
}
