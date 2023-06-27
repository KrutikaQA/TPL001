package TPL001.TPL001;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App {
	public void open() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
  
  }
}
