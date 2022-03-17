package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SnapDeal {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\andre\\eclipse-workspace\\SeleniumWorks2\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://www.snapdeal.com/");
		driver.manage().window().maximize();
		WebElement btnSignup = driver.findElement(By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']"));
		btnSignup.click();
		WebElement btnRegister = driver.findElement(By.xpath("//span[@class='newUserRegister']"));
		btnRegister.click();
		Thread.sleep(3000);
		WebElement txtPhno = driver.findElement(By.xpath("//input[@id='userName']"));
		//txtPhno.click();
		txtPhno.sendKeys("8754621961");
		WebElement btn = driver.findElement(By.xpath("//button[@id='checkUser']"));
		btn.click();
	}
}