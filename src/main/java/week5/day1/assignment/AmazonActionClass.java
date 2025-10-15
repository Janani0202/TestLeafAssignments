package week5.day1.assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class AmazonActionClass {

	public static void main(String[] args) throws IOException {
		//Precondition
		ChromeOptions opt = new ChromeOptions();
		ChromeDriver driver = new ChromeDriver(opt);
		opt.addArguments("--disable-notifications");
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		//Scroll down to the "Conditions of Use and Sale" 
		Actions actions = new Actions(driver);
		WebElement condition = driver.findElement(By.xpath("//a[text()='Conditions of Use & Sale']"));
		actions.scrollToElement(condition).perform();
		
		String text = condition.getText();
		System.out.println(text);
		
		//Take the Screenshot
        File screenshotAs = condition.getScreenshotAs(OutputType.FILE);
        //Store the file
        File Destination= new File("./Data/amazon.png");
        FileUtils.copyFile(screenshotAs, Destination);
        driver.close();

	}

}
