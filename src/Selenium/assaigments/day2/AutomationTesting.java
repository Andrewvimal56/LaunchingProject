package Selenium.assaigments.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTesting {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\andre\\eclipse-workspace\\LaunchingProject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html\r\n");
		WebElement txtname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		txtname.sendKeys("Vimal");
		WebElement txtlastname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		txtlastname.sendKeys("Pragasam");
		WebElement txtAddress = driver.findElement(By.xpath("//textarea[@rows='3']"));
		txtAddress.sendKeys("No.53, Gangai Amman Koil(st, Choolaimedu, Chennai-600010");
		WebElement txtMail = driver.findElement(By.xpath("//input[@type='email']"));
		txtMail.sendKeys("andrewvimal07@gmail.com");
		WebElement txtPhno = driver.findElement(By.xpath("//input[@type='tel']"));
		txtPhno.sendKeys("8765432190");
		WebElement txtGender = driver.findElement(By.xpath("//input[@value='Male']"));
		txtGender.click();

		List<WebElement> txtHobbies = driver.findElements(By.xpath("//input[@type='checkbox']"));
		int size = txtHobbies.size();
		for (int i = 0; i < size; i++) {
			txtHobbies.get(i).click();

		}

		WebElement txtLang = driver.findElement(By.xpath("//div[@id='msdd']"));
		txtLang.sendKeys("Tamil");
		WebElement txtFirstPassword = driver.findElement(By.xpath("//input[@id='firstpassword']"));
		txtFirstPassword.sendKeys("Arulvimal-07");
		WebElement txtConfirmPassword = driver.findElement(By.xpath("//input[@id='secondpassword']"));
		txtConfirmPassword.sendKeys("Arulvimal-07");

	}
}
