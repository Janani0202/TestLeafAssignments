package week5.day2assignment;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class AnnotationsTestNg extends ProjectSpecificMethod {

	@Test
	public void LegalEntity() throws InterruptedException {

		Thread.sleep(50000);
		// toggle menu
		driver.findElement(By.xpath("//span[text() = 'App Launcher']/parent::div")).click();

		Thread.sleep(5000);

		// view all
		driver.findElement(By.xpath("//button[contains(text(),'View All')]")).click();
		// Create an action
		Actions action = new Actions(driver);

		// find the element to perform the action
		WebElement legalEntity = driver.findElement(By.xpath("//p[text()='Legal Entities']"));
		action.scrollToElement(legalEntity).perform();
		legalEntity.click();

		// wait for the page to load
		Thread.sleep(5000);

		// Click on the new button to create new legal entities
		driver.findElement(By.xpath("//div[text()='New']")).click();
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Janani");
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("Test Leaf");
		driver.findElement(By.xpath("//label[text()='Description']/following::div//textarea")).sendKeys("Salesforces");
		// wait for the page to load
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@aria-label = 'Status']")).click();
		driver.findElement(By.xpath("//span[@title='Active']")).click();
		driver.findElement(By.xpath("//button[text()='Save']")).click();

		String entityName = driver.findElement(By.xpath("//slot[@name='primaryField']/lightning-formatted-text")).getText();
		System.out.println(entityName);
	}

}
