package com.automation.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.automation.base.BaseClass;

public class SeleniumCore extends BaseClass{
//selenium reusable methods
	
	public void enterText(WebElement element,String value){
		element.sendKeys(value);
	}
	
	public void clickOnEle(WebElement element){
		element.click();
	}
	
	public void selectEle(WebElement element,String text){
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}
}
