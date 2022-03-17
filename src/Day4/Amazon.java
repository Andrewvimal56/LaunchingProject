package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\andre\\eclipse-workspace\\LaunchingProject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		// Finding Mobile Locator Using Attribuite value coontains method
		//WebElement txt = driver.findElement(By.xpath("//a[contains(@data-csa-c-slot-id,'nav_cs_')][2]"));
		//txt.click()
;		
		WebElement txt = driver.findElement(By.xpath("//a[text()='Conditions of Use & Sale']"));
		String text = txt.getText();
		System.out.println(text);

	}
}
