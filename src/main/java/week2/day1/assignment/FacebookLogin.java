package week2.day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		//Instantiate the Browser
		ChromeDriver driver = new ChromeDriver();
		//loading the URL
		driver.get("https://www.facebook.com/");
		//Entering email id
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		//Entering password
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		//Login Button
		driver.findElement(By.name("login")).click();
		driver.findElement(By.linkText("Find your account and log in.")).click();
		//To get title name
		String title = driver.getTitle();
        System.out.println("Page Title is: " + title);
        driver.close();

	}

}
