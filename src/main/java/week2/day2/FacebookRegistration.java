package week2.day2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookRegistration {

	public static void main(String[] args) {
		//Initialize ChromeDriver 
		ChromeDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		// load url
		driver.get("https://en-gb.facebook.com/");
		//maximize the browser window
		driver.manage().window().maximize();
		//Click on the Create new account button
		driver.findElement(By.linkText("Create new account")).click();
		//Enter the First name. 
		driver.findElement(By.name("firstname")).sendKeys("Janani");
		//Enter the Surname. 
		driver.findElement(By.name("lastname")).sendKeys("Dharuman");
		//Enter the Mobile number or email address. 
		driver.findElement(By.name("reg_email__")).sendKeys("abc.gmail.com");
		//Enter the New password.
		driver.findElement(By.id("password_step_input")).sendKeys("Janani_001");
		
		// ----- Handle Date of Birth dropdowns -----
		new Select(driver.findElement(By.id("day"))).selectByVisibleText("23");
        new Select(driver.findElement(By.id("month"))).selectByVisibleText("July");
        new Select(driver.findElement(By.id("year"))).selectByVisibleText("1995");
		//Gender
        driver.findElement(By.xpath("//input[@name='sex' and @value='1']")).click();
        System.out.println("✅ Sign up form filled successfully.");
        driver.quit();
	
		
		
	}

}
