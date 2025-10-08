package week4.day2.assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandlingInteractions {

	public static void main(String[] args) {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");
		
		//Initialize Chrome Driver
		ChromeDriver driver = new ChromeDriver(opt);
		//Load the url
		driver.get("http://leaftaps.com/opentaps/control/login");
		//maximize the window
		driver.manage().window().maximize();
		//add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Enter username and password
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click on link
		driver.findElement(By.className("decorativeSubmit")).click();
		//Click on CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		//contacts button
		driver.findElement(By.linkText("Contacts")).click();
		//Merge contacts
		driver.findElement(By.linkText("Merge Contacts")).click();
		//choose the widget
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		//switch to list
		List<String> childWindow= new ArrayList<String>(windowHandles);
		driver.switchTo().window(childWindow.get(1));
		WebElement firstELement = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		firstELement.click();
		driver.switchTo().window(childWindow.get(0));
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Set<String> windowHandles1 = driver.getWindowHandles();
		//switch to list
		List<String> child2Window= new ArrayList<String>(windowHandles1);
		driver.switchTo().window(child2Window.get(1));
	
		WebElement secondELement = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]"));
		secondELement.click();
		driver.switchTo().window(childWindow.get(0));
		driver.findElement(By.linkText("Merge")).click();
		driver.switchTo().alert().accept();
		String title = driver.getTitle();
		if(title.contains("View Contact")) {
			System.out.println("Title verified"+title);
		}
		else {
			System.out.println("Not verified");
		}
		
	}

}
