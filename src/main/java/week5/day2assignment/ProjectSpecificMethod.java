package week5.day2assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ProjectSpecificMethod {
		// Launching ChromeBrowser
		public ChromeDriver driver;
		@Parameters({"url","username","password"})
		@BeforeMethod
		public void preConditions(String url, String username, String password)
		{
			driver = new ChromeDriver();
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("guest");
			//getting url
			driver.get(url);
			//maximise and made implicit wait
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			//Login
			driver.findElement(By.id("username")).sendKeys(username);
			driver.findElement(By.id("password")).sendKeys(password);
			driver.findElement(By.id("Login")).click();
		}
		
		  @AfterMethod 
		  public void postConditions()
		  { 
			  driver.close();
		  
		  }
		 


}
