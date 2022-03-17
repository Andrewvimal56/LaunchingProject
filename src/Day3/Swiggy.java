package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\andre\\eclipse-workspace\\LaunchingProject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		WebElement btnSignUp = driver.findElement(By.xpath("//a[@class='r2iyh']"));
		btnSignUp.click();
		WebElement txtPhno = driver.findElement(By.xpath("//input[@name='mobile']"));
		txtPhno.sendKeys("8754621961");
		WebElement txtName = driver.findElement(By.xpath("//input[@name='name']"));
		txtName.sendKeys("Vimal");
		WebElement txtMail = driver.findElement(By.xpath("//input[@name='email']"));
		txtMail.sendKeys("andrewvimal07@gmail.com");
		WebElement txtPass = driver.findElement(By.xpath("//input[@name='password']"));
		txtPass.sendKeys("Arulvimal-09");
		WebElement btn = driver.findElement(By.xpath("//a[@class='a-ayg']"));
		btn.click();

	}
}