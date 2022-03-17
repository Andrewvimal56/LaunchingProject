package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdactionHotelApp {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\andre\\eclipse-workspace\\LaunchingProject\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://adactinhotelapp.com/");

		// Finding attribute value method
		//WebElement txtUser = driver.findElement(By.xpath("//input[@id='username']"));
	//	WebElement txtPass = driver.findElement(By.xpath("//input[@id='password']"));
	//	txtUser.sendKeys("Vimal-09");
		//txtPass.sendKeys("Arulvimal-09");
		//String data = txtUser.getAttribute("value");
		//String data2 = txtPass.getAttribute("value");
		//System.out.println(data);
		//System.out.println(data2);
		// Using text Contains Method
		// WebElement txt = driver
		// .findElement(By.xpath("//p[contains(text(),'Adactin Launches The Adactin
		// Hotel App!')]"));
		// WebElement txt2 = driver.findElement(By.xpath("//p[contains(text(),' The
		// Adactin Hotel App!')]"));
		// If you use get.Text Method it will give us the hole sentence or passage
		// String text = txt.getText();
		// String text2 = txt2.getText();
		// System.out.println(text);
		// System.out.println(text2);

		 WebElement txt = driver.findElement(By.xpath("//p[text()='Adactin Launches The Adactin Hotel App! ']"));
		 String data = txt.getText();
		 System.out.println(data);

		 
	}
}
