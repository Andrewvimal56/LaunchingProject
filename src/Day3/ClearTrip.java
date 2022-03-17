package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTrip {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\andre\\eclipse-workspace\\LaunchingProject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://www.cleartrip.com/trains");
		WebElement txtFrom = driver.findElement(By.xpath("//input[@title='From station']"));
		txtFrom.sendKeys("Chennai");
		WebElement txtTo = driver.findElement(By.xpath("//input[@title='To station']"));
		txtTo.sendKeys("Madurai");
		WebElement btn = driver.findElement(By.xpath("//button[@id='trainFormButton']"));
		btn.click();
	}

}
