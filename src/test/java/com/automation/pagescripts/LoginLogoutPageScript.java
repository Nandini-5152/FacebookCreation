package com.automation.pagescripts;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.base.BaseClass;
import com.automation.pageutils.LoginLogoutPageUtils;

public class LoginLogoutPageScript extends BaseClass {

	public LoginLogoutPageUtils  loginLogoutPageUtils;

	@BeforeClass
	public void loads(){
		loginLogoutPageUtils = PageFactory.initElements(driver,LoginLogoutPageUtils.class);
	}

	@Test
	public void LogInLogoutInValidCredentials(){
		loginLogoutPageUtils.logIn("samplefb@gmail.com", "sample");
	}

}
