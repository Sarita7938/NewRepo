package SeleniumFremwork;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class ListnerTestClass implements ITestListener{
	 WebDriver driver;

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("onTestStart mehtod executed");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\Sarita\\131.0.6778.69 chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	     driver = new ChromeDriver();
	     driver.get("https://www.facebook.com/");
	     driver.manage().window().maximize();
	    
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("onTestSuccess mehtod executed");

	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("onTestFailure mehtod executed");

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("onTestSkipped mehtod executed");

	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("onStart mehtod executed");

	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("onFinish mehtod executed");
	}

}
