package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\andre\\eclipse-workspace\\LaunchingProject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement btnImage = driver.findElement(By.xpath("//img[@alt='Bedsheets, curtains & more']"));
		btnImage.click();
		WebElement btn = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		//WebElement btn = driver.findElement(By.xpath("//div[@class='a-section a-spacing-mini a-spacing-top-micro acs-product-block__product-image'][1] "));
		btn.click()
;	}

}