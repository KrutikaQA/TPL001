package Academy_Login;

import java.lang.module.ModuleDescriptor.Exports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Login {

	Exports extent;

	WebDriver driver;
	
@Test
	public void Login() throws InterruptedException {
		String path = System.getProperty("user.dir") + "\\Extent Report\\Login.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Krutika");

		ExtentTest test = extent.createTest("Login Page", "This to validate Dashboard page");
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		this.driver = new ChromeDriver();

		test.log(Status.INFO, "Starting Test Case");

		driver.manage().window().maximize();
		driver.get("https://www.tplsport.com/sign-in");
		
		WebElement loginButton = driver.findElement(By.id(""));
		loginButton.click();
		
		driver.close();
}
}

