package com.automation.pagescripts;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.base.BaseClass;
import com.automation.pageutils.ForgotAccPageUtils;

public class ForgotAccPageScript extends BaseClass{

	public ForgotAccPageUtils forgotAccPageUtils;
	
	@BeforeClass
	public void loads(){
		forgotAccPageUtils=PageFactory.initElements(driver,ForgotAccPageUtils.class);
	}
	
	@Test
	public void ForgotCredentials() throws InterruptedException{
		forgotAccPageUtils.ForgotAccDetails("9494649814", "hariraju121@gmail.com");
	}
	
}
