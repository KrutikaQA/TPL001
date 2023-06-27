package TPL001.TPL001;

import java.awt.AWTException;
import java.lang.module.ModuleDescriptor.Exports;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32_02\\chromedriver.exe");
		this.driver = new ChromeDriver();

		test.log(Status.INFO, "Starting Test Case");

		driver.manage().window().maximize();
		driver.get("https://tpl.wiantech.in/index.html");
		driver.close();
}
}