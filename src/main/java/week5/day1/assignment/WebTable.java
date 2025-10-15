package week5.day1.assignment;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTable {

	public static void main(String[] args) {
		//Precondition
		ChromeOptions opt = new ChromeOptions();
		ChromeDriver driver = new ChromeDriver(opt);
		opt.addArguments("--disable-notifications");
		driver.get("https://erail.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		//From station
		WebElement txtStationFrom = driver.findElement(By.id("txtStationFrom"));
		txtStationFrom.clear();
		txtStationFrom.sendKeys("MAS");
		driver.findElement(By.xpath("//div[text()='Mgr Chennai Ctr']")).click();
		//To Station
		WebElement txtStationTo = driver.findElement(By.id("txtStationTo"));
		txtStationTo.clear();
		txtStationTo.sendKeys("MDU");
		driver.findElement(By.xpath("//div[text()='Madurai Jn']")).click();
		//Uncheck sort on date box
		WebElement chkSelectDateOnly = driver.findElement(By.id("chkSelectDateOnly"));
		chkSelectDateOnly.click();
		//Retrive train names from web table
		Set<String> names = new HashSet<>();
		boolean hasDuplicates = false;

		List<WebElement> trainList = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']"));
		for (WebElement name : trainList) {
		    System.out.println(name.getText());
		}

		for (WebElement cell : trainList) {
		String name = cell.getText().trim();
		if (!names.add(name)) {
        System.out.println("Duplicate found: " + name);
        hasDuplicates = true;
		}
		}

		if (!hasDuplicates) {
		System.out.println("No duplicates found.");
		}


	}

}
