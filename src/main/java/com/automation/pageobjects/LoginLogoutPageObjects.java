package com.automation.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automation.base.BaseClass;

public class LoginLogoutPageObjects extends BaseClass {

	@FindBy(id="email")
	public WebElement usenameobj;

	@FindBy(id="pass")
	public WebElement passwordobj;

	@FindBy(xpath="//input[@type='submit']")
	public WebElement loginobj;

	
}
