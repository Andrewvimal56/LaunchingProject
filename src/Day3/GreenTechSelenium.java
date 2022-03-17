package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenTechSelenium {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\andre\\eclipse-workspace\\LaunchingProject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		//driver.manage().window().maximize();
		WebElement btnModel = driver.findElement(By.xpath("//div[@id='heading201']"));
		btnModel.click();
		WebElement btn2 = driver.findElement(By.xpath("(//a[@title='Model Resume training in chennai'])[1]"));
		btn2.click();
	}

}
