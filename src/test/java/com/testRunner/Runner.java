package com.testRunner;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.PageObjectManager.PageObjectManager;
import com.baseClass.BaseClass;

public class Runner extends BaseClass {
	@BeforeSuite
	private void driverlaunch() {
		getDriver("chrome");
	}

	@BeforeMethod
	private void urllaunch() {
		launchUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		implicitWait(1000);
	}

	@Test
	private void login() {
		inputToElement(PageObjectManager.getPom().getLp().getUsername(), "Admin");
		inputToElement(PageObjectManager.getPom().getLp().getPassword(), "admin123");
		clickonElement(PageObjectManager.getPom().getLp().getLoginbtn());
		// implicitWait(5000);
	}
	@Test(dependsOnMethods ="login")
	private void pim() {
		clickonElement(PageObjectManager.getPom().getPim().getPim());
		//implicitWait(1000);
		clickonElement(PageObjectManager.getPom().getPim().getAddemp());
		//implicitWait(1000);
		inputToElement(PageObjectManager.getPom().getPim().getFirstname(), "Dinesh");
		inputToElement(PageObjectManager.getPom().getPim().getMiddlename(), "Kumar");
		inputToElement(PageObjectManager.getPom().getPim().getLastname(), "M");
		clickonElement(PageObjectManager.getPom().getPim().getEmpId());
		Backspace(PageObjectManager.getPom().getPim().getEmpId());
		Backspace(PageObjectManager.getPom().getPim().getEmpId());
		Backspace(PageObjectManager.getPom().getPim().getEmpId());
		Backspace(PageObjectManager.getPom().getPim().getEmpId());
		inputToElement(PageObjectManager.getPom().getPim().getEmpId(), "1234");
		clickonElement(PageObjectManager.getPom().getPim().getCreatelogindetails());
		inputToElement(PageObjectManager.getPom().getPim().getUsername(), "Mdinesh");
		inputToElement(PageObjectManager.getPom().getPim().getPassword(),"Mdinesh@25");
		inputToElement(PageObjectManager.getPom().getPim().getConfirmpass(),"Mdinesh@25");
		clickonElement(PageObjectManager.getPom().getPim().getSavebtn());
		implicitWait(2000); 
		try { 
			screenshot("Employee ID creation"); 
		} catch
		(IOException e) { e.printStackTrace(); } }

	/*
	 * @Test(dependsOnMethods = "pim") private void leave() {
	 * clickonElement(PageObjectManager.getPom().getLe().getLeave());
	 * clickonElement(PageObjectManager.getPom().getLe().getAssignleave());
	 * inputToElement(PageObjectManager.getPom().getLe().getEmpname(), "h");
	 * implicitWait(2000);
	 * dropdownForSelect(PageObjectManager.getPom().getLe().getEmpname(),
	 * "value","Hey you bro");
	 * clickonElement(PageObjectManager.getPom().getLe().getLeavetype());
	 * dropdownForSelect(PageObjectManager.getPom().getLe().getLeavetype(),
	 * "index","4");
	 * 
	 * }
	 */

}
