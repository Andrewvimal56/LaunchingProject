package Selenium.assaigments.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\andre\\eclipse-workspace\\LaunchingProject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://www.redbus.in/ \r\n" + "");
		WebElement txtFrom = driver.findElement(By.id("src"));
		txtFrom.sendKeys("Chennai");
		WebElement txtTo = driver.findElement(By.id("dest"));
		txtTo.sendKeys("Madurai");
		String pageSource = driver.getPageSource();
		//driver.quit();
		System.out.println(pageSource);
	}

}
