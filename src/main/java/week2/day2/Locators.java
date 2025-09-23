package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		//launch browser
		ChromeDriver driver = new ChromeDriver();
		// load url
		driver.get("https://www.facebook.com/");
		//maximize
		driver.manage().window().maximize();
		//Enter emailid
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		//Enter passwordd
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		//enter loggin button
		driver.findElement(By.name("login")).click();
		
		String titleofpage = driver.getTitle();
		System.out.println("The tile of the page is:"+ titleofpage );
		
	}

}
