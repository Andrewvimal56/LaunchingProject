package launching.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) throws InterruptedException {

		// Configure Browser
		// System.setProperty("Webdriver.chrome.driver","C:\Users\andre\eclipse-workspace\LaunchingProject\Driver\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\andre\\eclipse-workspace\\LaunchingProject\\Driver\\chromedriver.exe");

		// Reference name creation
		WebDriver driver = new ChromeDriver();

		// To launch url
		driver.get("https://www.facebook.com/");
		// driver.get("http://www.greenstechnologys.com/");
		// driver.get("http://gmail.com/");
		// driver.get("http://www.flipkart.com/");
		// driver.get("http://greenstech.in/selenium-course-content.html\r\n"
		// + "");

		// driver.quit();

		// To get current url
		// String url = driver.getCurrentUrl();
		// System.out.println(url);

		// To get title
		// String title = driver.getTitle();
		// System.out.println(title);
		// driver.manage().window().maximize();
		// Thread.sleep(1000);
		// driver.quit();
		// WebElement element = driver.findElement(By.id("email"));
		// element.sendKeys("vimal");
	}

}
