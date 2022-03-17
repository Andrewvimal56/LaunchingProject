package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\andre\\eclipse-workspace\\LaunchingProject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		WebElement btn = driver.findElement(By.xpath("//div[@id='sign-in-icon-down']"));
		btn.click();
		WebElement btnSignin = driver.findElement(By.xpath("//li[@id='signInLink']"));
		btnSignin.click();
		WebElement txtNumber = driver.findElement(By.xpath("//input[@type='number']"));
		txtNumber.sendKeys("8754621961");
		WebElement btnOtp = driver.findElement(By.xpath("//div[@id='otp-container']"));
		btnOtp.click();
	}
}
