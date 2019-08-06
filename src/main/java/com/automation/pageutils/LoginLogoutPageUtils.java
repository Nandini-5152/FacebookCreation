package com.automation.pageutils;

import org.openqa.selenium.support.PageFactory;

import com.automation.base.BaseClass;
import com.automation.pageobjects.LoginLogoutPageObjects;
import com.automation.utils.SeleniumCore;
import com.automation.utils.SeleniumUtils;

public class LoginLogoutPageUtils extends BaseClass{

	public SeleniumCore seleniumCore;
	public SeleniumUtils seleniumUtils;
	public LoginLogoutPageObjects loginLogoutPageObjects;

	public LoginLogoutPageUtils(){
		seleniumCore=PageFactory.initElements(driver,SeleniumCore.class);
		seleniumUtils=PageFactory.initElements(driver,SeleniumUtils.class);
		loginLogoutPageObjects = PageFactory.initElements(driver,LoginLogoutPageObjects.class);
		/*seleniumCore = new SeleniumCore();
		seleniumUtils = new SeleniumUtils();
		loginLogoutPageObjects = new LoginLogoutPageObjects();*/
	}

	public void logIn(String usename,String password){
		seleniumCore.enterText( loginLogoutPageObjects.usenameobj, usename);
		seleniumCore.enterText(loginLogoutPageObjects.passwordobj, password);
		seleniumCore.clickOnEle(loginLogoutPageObjects.loginobj);
	}

}
