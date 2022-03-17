package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTech {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\andre\\eclipse-workspace\\LaunchingProject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html\r\n");
		WebElement btnIQues = driver.findElement(By.xpath("//div[@id='heading20']"));
		btnIQues.click();
		 WebElement btnCtsQues = driver.findElement(By.xpath("(//a[@title='Interview Questions'])[6]"));
		 btnCtsQues.click();
		//WebElement btnCtsQues = btnIQues.findElement(By.xpath("(//a[@title='Interview Questions'])[6]"));
		//btnCtsQues.click();
		 

	}
}
