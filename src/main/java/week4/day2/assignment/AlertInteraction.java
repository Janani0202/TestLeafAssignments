package week4.day2.assignment;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertInteraction {

	public static void main(String[] args) {
		//Initialize Chrome Driver
		ChromeDriver driver = new ChromeDriver();
		//Load the url
		driver.get("https://www.leafground.com/alert.xhtml");
		//maximize the window
		driver.manage().window().maximize();
		//add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//click on prompt box
		WebElement promptBox = driver.findElement(By.xpath("(//span[text()='Show'])[5]"));
		promptBox.click();
		
		//switch
		Alert promptAlert = driver.switchTo().alert();
		promptAlert.sendKeys("Janani");
		promptAlert.dismiss();

		// Retrieve the result text from the page 
		WebElement resultText = driver.findElement(By.id("confirm_result"));
		String displayedText = resultText.getText();
		System.out.println(displayedText);
		// Verify the typed message
		if (displayedText.contains("Janani")) {
		    System.out.println("Verification passed: " + displayedText);
		} else {
		    System.out.println("Verification failed. Expected message not found.");
		}

	}

}
