package com.automation.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automation.base.BaseClass;

public class FogotAccPageObjects extends BaseClass{

	@FindBy(xpath="//a[text()='Forgotten account?']")
	public WebElement forgotAcc;
	
	@FindBy(xpath="(//input[@name='email'])[2]")
	public WebElement phnum;
	
	@FindBy(xpath="//input[@name='did_submit']")
	public WebElement search1;
	
	@FindBy(xpath="//input[@name='go_back']")
	public WebElement back1;
	
	@FindBy(xpath="(//input[@name='email'])[2]")
	public WebElement email;
	
	@FindBy(xpath="//input[@name='did_submit']")
	public WebElement search2;
	
	@FindBy(xpath="//a[@name='reset_action']")
	public WebElement notyouobj;
	
	
	
}
