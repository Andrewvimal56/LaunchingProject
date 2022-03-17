package Selenium.assaigments.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\andre\\eclipse-workspace\\LaunchingProject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en) login page ");
		driver.manage().window().maximize();

		WebElement txtName = driver.findElement(By.xpath("//input[@class='2hvTZpexuQzyHYP']"));
		// Thread.sleep(3000);
		txtName.sendKeys("Andrewvimal07");
		WebElement txtPassword = driver.findElement(By.xpath("//input[@class='2hvTZpexuQzyHYP']"));
		txtPassword.sendKeys("vimal_07");
		// driver.quit();
	}

}
