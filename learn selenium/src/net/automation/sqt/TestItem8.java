package net.automation.sqt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TestItem8 {

	public static void main(String[] args) throws InterruptedException {
		//The mouse pointer is put over Administration, a drop-down list with the following items will be displayed
		
		WebDriver driver = Base.getDriver();
		
		//Navigating Web-site
		//go to www.aiub.edu
		
		driver.get("http://www.aiub.edu");
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu-primary-navigation\"]/li[4]/a"))).build().perform();

		Thread.sleep(3000);
		
		//check pass/fail
		
		WebElement one=driver.findElement(By.xpath("//*[@id=\"menu-primary-navigation\"]/li[4]/ul/li[1]/a"));
		String itemone = one.getText();
		System.out.println(itemone);
		
		WebElement two=driver.findElement(By.xpath("//*[@id=\"menu-primary-navigation\"]/li[4]/ul/li[2]/a"));
		String itemtwo = two.getText();
		System.out.println(itemtwo);
		
		WebElement three=driver.findElement(By.xpath("//*[@id=\"menu-primary-navigation\"]/li[4]/ul/li[3]/a"));
		String itemthree = three.getText();
		System.out.println(itemthree);
		


		
		if(itemone.equals("The Vice Chancellor")) 
		{
			if(itemtwo.equals("The Chairman")) 
			{
				if(itemthree.equals("The Pro-Vice Chancellor")) 
				{
					System.out.println("Item is Pass");
							
				}
				else
				{
					System.out.println("Item is Fail");
				}
			}
			else
			{
				System.out.println("Item is Fail");
			}
			
		}
		else
		{
			System.out.println("Item is Fail");
		}


	}

}
