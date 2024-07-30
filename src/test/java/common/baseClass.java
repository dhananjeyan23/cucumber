package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseClass {

	public static WebDriver driver;
	public void launchBrowser() {
		   driver = new ChromeDriver();
		   driver.get("https://www.facebook.com");
}
	
	public void quitBrowser() {
		driver.quit();

}
	
}