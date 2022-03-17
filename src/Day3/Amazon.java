package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\andre\\eclipse-workspace\\LaunchingProject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement btn = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		btn.click();
		btn.sendKeys("iphone");
		WebElement btn2 = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		btn2.click();
		driver.quit();
	}

}
