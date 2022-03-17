package Selenium.assaigments.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDeal {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\andre\\eclipse-workspace\\LaunchingProject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/login");
		driver.manage().window().maximize();
		WebElement txtUserName = driver.findElement(By.id("userName"));
		txtUserName.sendKeys("9987654321");
		WebElement btnclick = driver.findElement(By.xpath("(//button[@class='btn col-xs-24 btn-large btn-skyblue continueBtn marT20 marB30'])"));
		btnclick.click();
		
		//driver.quit();
	}
}
