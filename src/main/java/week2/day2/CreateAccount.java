package week2.day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		// Pre-Conditions
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");

		// Launching ChromeBrowser
		ChromeDriver driver = new ChromeDriver(opt);
		opt.addArguments("--disk-cache-size=0");
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		// Enter username and password
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Janani");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester.");
		WebElement industry = driver.findElement(By.name("industryEnumId"));
		Select industry_dd = new Select(industry);
		industry_dd.selectByVisibleText("Computer Software");
		WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
		Select ownership_dd = new Select(ownership);
		ownership_dd.selectByVisibleText("S-Corporation");
		WebElement sourceelement = driver.findElement(By.xpath("//select[@id='dataSourceId']"));
		Select source_dd = new Select(sourceelement);
		source_dd.selectByValue("LEAD_EMPLOYEE");
		WebElement mc = driver.findElement(By.xpath("//select[@id='marketingCampaignId']"));
		Select mcdropdown = new Select(mc);
		mcdropdown.selectByIndex(5);
		new Select(driver.findElement(By.id("generalStateProvinceGeoId"))).selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();
		String expectedName = "Janani (10598)";
		String accName = driver.findElement(By.linkText("Account Name")).getText();
		if (accName.equals(expectedName)) {
			System.out.println("Account name displayed correctly: " + accName);
		} else {
			System.out.println("Account name mismatch. Expected: " + expectedName + ", but got: " + accName);
		}

	}
}
