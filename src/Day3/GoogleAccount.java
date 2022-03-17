package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAccount {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\andre\\eclipse-workspace\\LaunchingProject\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get(" https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
WebElement txtFname = driver.findElement(By.xpath("//input[@name='firstName']"));
txtFname.sendKeys("Andrew");
WebElement txtLname = driver.findElement(By.xpath("//input[@name='lastName']"));
txtLname.sendKeys("Vimal");
WebElement txtMail = driver.findElement(By.xpath("//input[@name='Username']"));
txtMail.sendKeys("arulvimal09876");
WebElement txtPass = driver.findElement(By.xpath("//input[@type='password'][1]"));
txtPass.sendKeys("Arulvimal-09");
WebElement txtCpass = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
txtCpass.sendKeys("Arulvimal-09");
WebElement btn = driver.findElement(By.xpath("(//span[@jsname='V67aGc'])[2]"));
btn.click();
}
}
