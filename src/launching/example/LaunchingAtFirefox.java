package launching.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchingAtFirefox {
	public static void main(String[] args) {
		// Configure Browser
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\andre\\eclipse-workspace\\LaunchingProject\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		// driver.get("http://www.greenstechnologys.com/");
		// driver.get("https://www.facebook.com/");
		// driver.get("https://www.amazon.in");
		driver.get("http://greenstech.in/selenium-course-content.html\r\n" + "");

		driver.quit();
		// String url = driver.getCurrentUrl();
		// System.out.println(url);

		// WebElement findElement = driver.findElement(By.id("email"));
		// findElement.sendKeys("Vimal");

		// String title = driver.getTitle();
		// System.out.println(title);

	}

}
