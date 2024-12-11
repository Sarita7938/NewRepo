package SeleniumFremwork;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class MytestListner {
	
	@BeforeSuite
	public void setup() {
		System.out.println("Before suit run method");
	}
	
	@AfterSuite
	void closeSetup() {
		System.out.println("Setup close successfully");
	}
	
	@BeforeMethod
	void login() {
		System.out.println("Login successfully");
	}
	@AfterMethod
	void logOutMethod() {
		System.out.println("Logout successfully");
	}
	@Test(priority =1 , retryAnalyzer = SeleniumFremwork.RetryMethods.class)
	public void homepage(){
		System.out.println("Home page is display");
	}
	@Test(priority = 2)
	void titleOfThePage() {
		System.out.println("Login successfully and title of the page is display");
	}
}
