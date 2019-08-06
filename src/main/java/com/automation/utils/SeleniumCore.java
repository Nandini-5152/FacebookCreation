package com.automation.utils;

import org.openqa.selenium.WebElement;

import com.automation.base.BaseClass;

public class SeleniumCore extends BaseClass{
//selenium reusable methods
	
	public void enterText(WebElement element,String value){
		element.sendKeys(value);
	}
	
	public void clickOnEle(WebElement element){
		element.click();
	}
	
}
