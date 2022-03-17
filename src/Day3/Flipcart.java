package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flipcart {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\andre\\eclipse-workspace\\LaunchingProject\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		WebElement btnClose = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		btnClose.click();
		WebElement btnLogin = driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
		btnLogin.click();
		WebElement txtEmail = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		txtEmail.sendKeys("andrevimal07@gmail.com");
		WebElement txtPass = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
		txtPass.sendKeys("Arulvimal_08");
	}
}
