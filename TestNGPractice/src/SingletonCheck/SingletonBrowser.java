package SingletonCheck;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingletonBrowser {
	
	private static SingletonBrowser instance;
	private WebDriver driver;
	
	/**
	 * 
	 */
	private SingletonBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\SKhuswah\\eclipse-workspace\\TestNGPractice\\src\\Resources\\chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.get("https://www.amazon.in/");
		JavascriptExecutor jsc = (JavascriptExecutor)driver;	
        driver.switchTo().parentFrame(); // to the parent frame from the child frame
        driver.switchTo().defaultContent(); // to main web page which has all these frames
	}
	
	public static SingletonBrowser getinstance() {
		if(instance==null) {
			SingletonBrowser instance = new SingletonBrowser();
		}
		return instance;
	}

	public WebDriver getdriver() {
		 return driver;
	}
}
