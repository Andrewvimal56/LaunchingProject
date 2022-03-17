package Selenium.assaigments.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdactionHotelApp {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\andre\\eclipse-workspace\\LaunchingProject\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://adactinhotelapp.com/");
		WebElement txtname = driver.findElement(By.id("username"));
		txtname.sendKeys("Vimal_07");
		WebElement txtpassword = driver.findElement(By.id("password"));
		txtpassword.sendKeys("Aruljegan-09");
		driver.quit();
	}

}
