/**
 * 
 */
package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

/**
 * @author Rayhan Naufal 
 *
 */
public class HomePage extends BaseClass{
	
Action action= new Action();
	
	@FindBy(xpath="//*[@id=\"center_column\"]/h1")
	private WebElement myAccount;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/div/div/ul/li[2]/a/span")
	private WebElement orderHistory;
	
	public HomePage() {
		PageFactory.initElements(getDriver(), this);
	}

	
	public boolean validateMyAccount() throws Throwable {
		return action.isDisplayed(getDriver(), myAccount);
	}
	
	public boolean validateOrderHistory() throws Throwable {
		return action.isDisplayed(getDriver(), orderHistory);
	}
	
	public String getCurrURL() throws Throwable {
		String homePageURL=action.getCurrentURL(getDriver());
		return homePageURL;
	}

}
