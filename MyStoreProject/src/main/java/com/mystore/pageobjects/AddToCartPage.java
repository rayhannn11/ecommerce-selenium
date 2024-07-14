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

public class AddToCartPage extends BaseClass {

Action action= new Action();
	
	@FindBy(id="quantity_wanted")
	private WebElement quantity;
	
	@FindBy(name="group_1")
	private WebElement size;
	
	@FindBy(xpath="//*[@id=\"color_8\"]")
	private WebElement color;
	
	@FindBy(xpath="//span[text()='Add to cart']")
	private WebElement addToCartBtn;
	
	@FindBy(xpath="//*[@id=\"layer_cart\"]//h2/i")
	private WebElement addToCartMessag;
	
	@FindBy(xpath="//span[contains(text(),'Proceed to checkout')]")
	private WebElement proceedToCheckOutBtn;
	
	public AddToCartPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public void clickToProductPage() throws Throwable {
		action.JSClick(getDriver(), color);
	}

	public void enterQuantity(String quantity1) throws Throwable {
		Thread.sleep(2000);
		action.type(quantity, quantity1);
	}
	
	public void selectSize(String size1) throws Throwable {
		Thread.sleep(2000);
		action.selectByVisibleText(size1, size);
	}
	
	public void selectColor() throws Throwable {
		Thread.sleep(5000);
		action.JSClick(getDriver(), color);

	}
	
	public void clickOnAddToCart() throws Throwable {
		Thread.sleep(2000);
		action.click(getDriver(), addToCartBtn);
	}
	
	public boolean validateAddtoCart() throws Throwable {
		action.fluentWait(getDriver(), addToCartMessag, 10);
		return action.isDisplayed(getDriver(), addToCartMessag);
	}
	
	public OrderPage clickOnCheckOut() throws Throwable {
		action.fluentWait(getDriver(), proceedToCheckOutBtn, 10);
		action.JSClick(getDriver(), proceedToCheckOutBtn);
		return new OrderPage();
	}
}
