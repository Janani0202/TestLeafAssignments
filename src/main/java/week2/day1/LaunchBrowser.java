package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {

		//Launch Browser
		ChromeDriver driver = new ChromeDriver();
		//launch url
		driver.get("https://www.facebook.com/");
		// to maximize the page
		driver.manage().window().maximize();

	}

}
