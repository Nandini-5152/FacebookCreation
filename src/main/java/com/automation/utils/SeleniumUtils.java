package com.automation.utils;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.automation.base.BaseClass;

public class SeleniumUtils extends BaseClass{
//all mouse and keybord related re usable methods
	
	public void selectMenu(WebElement element){
		Actions act =  new Actions(driver);
		act.click(element).build().perform();
	}
	
	public void SelectSubMenu(WebElement element1,WebElement element2){
		Actions act =  new Actions(driver);
		act.moveToElement(element1).build().perform();
		act.click(element2).build().perform();
	}
	
	public void clickEnter(){
		Actions act =  new Actions(driver);
		act.sendKeys(Keys.ENTER);
	}
}

