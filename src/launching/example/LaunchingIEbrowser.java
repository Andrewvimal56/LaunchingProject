package launching.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchingIEbrowser {
	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver",
				"C:\\Users\\andre\\eclipse-workspace\\LaunchingProject\\Driver\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		// driver.get("http://www.greenstechnologys.com/");
		// driver.get(" http://demo.automationtesting.in/Register.html");
		// driver.get("http://www.greenstechnologys.com/");
		// driver.get("http://greenstech.in/selenium-course-content.html");
		driver.quit();
	}
}
