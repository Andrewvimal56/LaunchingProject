package Selenium.assaigments.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HdfcBank {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\andre\\eclipse-workspace\\LaunchingProject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/ \r\n" + "");
		//driver.switchTo().frame("login_page");
		//WebElement txtId = driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
		//txtId.sendKeys("Vimal");
		// driver.quit();
	//	driver.findElement(By.c)
	}

}

