package net.automation.sqt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TestItem7 {

	public static void main(String[] args) throws InterruptedException {
		//Clicked on Faculty List, the system brings a page titled TEACHERS OF AIUB
		
		WebDriver driver = Base.getDriver();
		
		//Navigating Web-site
		//go to www.aiub.edu
		
		driver.get("http://www.aiub.edu");
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu-primary-navigation\"]/li[5]/a"))).build().perform();

		Thread.sleep(3000);
		
		//check pass/fail
		
		WebElement one=driver.findElement(By.xpath("//*[@id=\"menu-primary-navigation\"]/li[5]/ul/li[5]/a"));
		String itemone = one.getText();
		System.out.println(itemone);
		one.click();
		
		Thread.sleep(2000);
		
		WebElement onecopy=driver.findElement(By.xpath("//*[@id=\"page-header\"]/div/div[2]/h1"));
		String itemonecopy = onecopy.getText();
		
		if(itemonecopy.equals("TEACHERS OF AIUB")) 
		{
			System.out.println("Item is Pass");
		}
		else
		{
			System.out.println("Item is Fail");
		}

	}

}
