package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GreensTech {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\andre\\eclipse-workspace\\LaunchingProject\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get(" http://greenstech.in/selenium-course-content.html");
		WebElement btn = driver.findElement(By.xpath("//span[@title='Overview']"));
		btn.click();
		Thread.sleep(3000);
		WebElement txtParah = driver.findElement(By.xpath("(//p[contains(text(),'Greens Technologies')])[1]"));
		String text = txtParah.getText();
		System.out.println(text);
	}

}
