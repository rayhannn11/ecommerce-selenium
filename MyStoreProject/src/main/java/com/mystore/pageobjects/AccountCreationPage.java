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
 * @author  Rayhan Naufal
 *
 */
public class AccountCreationPage extends BaseClass {
	
	Action action = new Action();
	

	@FindBy(xpath = "//h1[text()='Create an account']")
	private WebElement formTitle;
	
	@FindBy(xpath = "//*[@id=\"id_gender1\"]")
	private WebElement mr;
	
	@FindBy(xpath = "//*[@id=\"id_gender2\"]")
	private WebElement mrs;

	@FindBy(xpath = "//*[@id=\"customer_firstname\"]")
	private WebElement firstName;

	@FindBy(xpath = "//*[@id=\"customer_lastname\"]")
	private WebElement lastName;

	@FindBy(xpath = "//*[@id=\"passwd\"]")
	private WebElement passWord;

	@FindBy(name = "days")
	private WebElement days;

	@FindBy(name = "months")
	private WebElement months;

	@FindBy(name = "years")
	private WebElement years;
	
//	br

	@FindBy(name = "firstname")
	private WebElement customerNirstName;

	@FindBy(name = "lastname")
	private WebElement customerLastName;

	@FindBy(name = "company")
	private WebElement companyName;

	@FindBy(name = "address1")
	private WebElement address;

	@FindBy(name = "city")
	private WebElement city;

	@FindBy(name = "id_state")
	private WebElement state;

	@FindBy(name = "postcode")
	private WebElement postCode;

	@FindBy(name = "id_country")
	private WebElement country;

	@FindBy(name = "phone")
	private WebElement phone;

	@FindBy(name = "phone_mobile")
	private WebElement mobile;

	@FindBy(name = "alias")
	private WebElement ref;

	@FindBy(name = "submitAccount")
	private WebElement registerBtn;
	
	
	public AccountCreationPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public void createAccount(String gender,String fName, 
			String lName, 
			String pswd, 
			String day, 
			String month, 
			String year) throws Throwable {
		
		if(gender.equalsIgnoreCase("Mr")) {
			action.click(getDriver(), mr);
		} else {
			action.click(getDriver(), mrs);
		}
		
		action.type(firstName, fName);
		action.type(lastName, lName);
		action.type(passWord, pswd);
		action.selectByValue(days, day);
		action.selectByValue(months, month);
		action.selectByValue(years, year);
	}
	
	public HomePage validateRegistration() throws Throwable {
		registerBtn.click();
		return new HomePage();
	}
	
	public boolean validateAcountCreatePage() throws Throwable {
		 return action.isDisplayed(getDriver(), formTitle);
	}

}
