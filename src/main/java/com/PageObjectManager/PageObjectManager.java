package com.PageObjectManager;

import com.pom.LeavePage;
import com.pom.Login_Page;
import com.pom.PimPage;

public class PageObjectManager {
	static PageObjectManager pom;
	Login_Page lp;
	PimPage pim;
	LeavePage le;
	
	public static PageObjectManager getPom() {
		if (pom == null) {
			pom = new PageObjectManager();
		}
		return pom;
	}
	public Login_Page getLp() {
		if (lp == null) {
			lp = new Login_Page();
		}
		return lp;
	}
	public PimPage getPim() {
		if (pim == null) {
			pim = new PimPage();
		}
		return pim;
	}
	public LeavePage getLe() {
		if (le == null) {
			le = new LeavePage();
		}
		return le;
	}
}
