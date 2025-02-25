/**
 * 
 */
package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.LoginPage;
import com.mystore.utility.Log;


/**
 * @author Rayhan Naufal 
 *
 */

public class IndexPageTest extends BaseClass {
	
	private IndexPage indexPage;

	@Parameters("browser")
	@BeforeMethod(groups = {"Smoke","Sanity","Regression"})
	public void setup(String browser) {
		launchApp(browser); 
	}
	
	@AfterMethod(groups = {"Smoke","Sanity","Regression"})
	public void tearDown() {
		getDriver().quit();
	}
	
	@Test(groups = "Smoke")
	public void verifyLogo() throws Throwable {
		Log.startTestCase("verifyLogo");
		indexPage= new IndexPage();
		LoginPage login = new LoginPage();
		boolean result=indexPage.validateLogo();
		Assert.assertTrue(false);
		Log.endTestCase("verifyLogo");
	}
	
	@Test(groups = "Smoke")
	public void verifyTitle() throws Throwable{
		Log.startTestCase("verifyTitle");
		indexPage= new IndexPage();
		String actTitle= indexPage.getMyStoreTitle();
		Assert.assertEquals(actTitle, "My Shop");
		Log.endTestCase("verifyTitle");
	}

}
