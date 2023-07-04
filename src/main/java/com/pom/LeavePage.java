package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseClass.BaseClass;

public class LeavePage extends BaseClass {
	public LeavePage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[3]")	
	private WebElement leave;
	@FindBy(xpath = "//a[text()='Assign Leave']")
	private WebElement assignleave;
	@FindBy(xpath ="//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']" )
	private WebElement empname;
	@FindBy(xpath = "//div[text()='-- Select --']")
	private WebElement leavetype;
	public WebElement getLeave() {
		return leave;
	}
	public WebElement getLeavetype() {
		return leavetype;
	}
	public WebElement getAssignleave() {
		return assignleave;
	}
	public WebElement getEmpname() {
		return empname;
	}
}
