package net.automation.sqt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TestItem3 {

	public static void main(String[] args) throws InterruptedException {
		
		//Clicked on Faculty of Science & Information Technology, the system displays a page titled 
		//Faculty of Science & Information Technology
		WebDriver driver = Base.getDriver();
		
		//Navigating Web-site
		//go to www.aiub.edu
		
		driver.get("http://www.aiub.edu");
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu-primary-navigation\"]/li[5]/a"))).build().perform();

		Thread.sleep(3000);
		
		//check pass/fail
		
		WebElement one=driver.findElement(By.xpath("//*[@id=\"menu-primary-navigation\"]/li[5]/ul/li[4]/a"));
		String itemone = one.getText();
		System.out.println(itemone);
		one.click();
		
		Thread.sleep(2000);
		
		WebElement onecopy=driver.findElement(By.xpath("/html/body/div[2]/div/a"));
		String itemonecopy = onecopy.getText();
		
		if(itemonecopy.equals("Faculty of Science & Technology")) 
		{
			System.out.println("Item is Pass");
		}
		else
		{
			System.out.println("Item is Fail");
		}
		
		
		
	}

}
