package com.automation.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automation.base.BaseClass;

public class CreateAccPageObjects extends BaseClass{

	@FindBy(name="firstname")
	public WebElement firstname;

	@FindBy(name="lastname")
	public WebElement surname;

	@FindBy(xpath="//input[@aria-label='Mobile number or email address']")
	public WebElement email;

	@FindBy(xpath="//input[@aria-label='Re-enter email address']")
	public WebElement re_email;

	@FindBy(xpath="//input[@aria-label='New password']")
	public WebElement newpass;

	@FindBy(xpath="//select[@id='day']")
	public WebElement day;

	@FindBy(xpath="//select[@id='month']")
	public WebElement month;

	@FindBy(xpath="//select[@id='year']")
	public WebElement year;

	@FindBy(xpath="(//input[@name='sex'])[1]")
	public WebElement female;

	@FindBy(xpath="(//input[@name='sex'])[2]")
	public WebElement male;

	@FindBy(xpath="(//input[@name='sex'])[3]")
	public WebElement custom;

	@FindBy(xpath="(//button[text()='Sign Up'])[1]")
	public WebElement singup;

}
