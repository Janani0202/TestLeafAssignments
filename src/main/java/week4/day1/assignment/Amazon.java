package week4.day1.assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon {

	public static void main(String[] args) {
		//LaunchBrowser
		ChromeDriver driver = new ChromeDriver();
		//loading url
		driver.get("https://www.amazon.in/");
		//maximize the window
		driver.manage().window().maximize();
		
		//Implict wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30000));
		//Search
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phones");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']/span[text()='Featured']")).click();
		//getting value ascending: Price: Low to High
		driver.findElement(By.xpath("(//a[@class='a-dropdown-link']/ancestor::li[@class='a-dropdown-item a-declarative'])[1]")).click();
		//GEtting the list
		List<WebElement> priceElements = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		//Getting the least value
		String rupees=priceElements.get(0).getText();
		System.out.println("The least value is:"+rupees);
		

	}
}
