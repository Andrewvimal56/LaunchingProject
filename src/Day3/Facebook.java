package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Facebook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\andre\\eclipse-workspace\\LaunchingProject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement txtmail = driver.findElement(By.xpath("//input[@name='email']"));
		txtmail.sendKeys("8754621961");
		WebElement txtPassword = driver.findElement(By.xpath("//input[@name='pass']"));
		boolean enabled = txtPassword.isEnabled();
		System.out.println(enabled);
		txtPassword.sendKeys("Arulvimal_0");
		WebElement btn = driver.findElement(By.xpath("//button[@name='login']"));
		boolean displayed = btn.isDisplayed();
		System.out.println(displayed);
		
		
		
		
		
		
		
		
		//String tagName = btn.getTagName();
	//	btn.click();
	//	driver.quit();
//		Point location = btn.getLocation();
//		System.out.println(location);
		//System.out.println(tagName);
	}
}
