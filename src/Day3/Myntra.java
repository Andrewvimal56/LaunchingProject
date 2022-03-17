package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\andre\\eclipse-workspace\\LaunchingProject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://www.myntra.com/register?referer=https://www.myntra.com/");
		WebElement txtPhno = driver.findElement(By.xpath("//input[@autocomplete='new-password']"));
		txtPhno.sendKeys("8754621961");
		WebElement btn = driver.findElement(By.xpath("//div[@class='submitBottomOption']"));
		btn.click();

	}
}
