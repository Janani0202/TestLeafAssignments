package week2.day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		//Launching as a guest
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");
		
		//Launching ChromeBrowser
		ChromeDriver driver = new ChromeDriver(opt);
		//loading the URL
		driver.get("http://leaftaps.com/opentaps/");
		
		//Maximize the screen
		driver.manage().window().maximize();
		
		//Enter a username and password
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//click on login
		driver.findElement(By.className("decorativeSubmit")).click();
		//Click on CRM/SFA
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		//Click on Leads
		driver.findElement(By.linkText("Leads")).click();
		//CreateLead
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Janani");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Dharuman");
		driver.findElement(By.xpath("//input[contains(@class,'smallSubmit')]")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
       
	}
}
