package net.automation.sqt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TestItem2 {

	public static void main(String[] args) throws InterruptedException {
		
		//In the homepage, putting the mouse pointer over 'Faculty' display a drop-down list with the items
		
				WebDriver driver = Base.getDriver();
				
				//Navigating Web-site
				//go to www.aiub.edu
				
				driver.get("http://www.aiub.edu");
				
				Actions action = new Actions(driver);
				action.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu-primary-navigation\"]/li[5]/a"))).build().perform();
		
				Thread.sleep(3000);
				
				//check pass/fail
				
				WebElement one=driver.findElement(By.xpath("//*[@id=\"menu-primary-navigation\"]/li[5]/ul/li[1]/a"));
				String itemone = one.getText();
				System.out.println(itemone);
				
				WebElement two=driver.findElement(By.xpath("//*[@id=\"menu-primary-navigation\"]/li[5]/ul/li[2]/a"));
				String itemtwo = two.getText();
				System.out.println(itemtwo);
				
				WebElement three=driver.findElement(By.xpath("//*[@id=\"menu-primary-navigation\"]/li[5]/ul/li[3]/a"));
				String itemthree = three.getText();
				System.out.println(itemthree);
				
				WebElement four=driver.findElement(By.xpath("//*[@id=\"menu-primary-navigation\"]/li[5]/ul/li[4]/a"));
				String itemfour = four.getText();
				System.out.println(itemfour);
				
				WebElement five=driver.findElement(By.xpath("//*[@id=\"menu-primary-navigation\"]/li[5]/ul/li[5]/a"));
				String itemfive = five.getText();
				System.out.println(itemfive);
		
				
				if(itemone.equals("Faculty of Arts And Social Science")) 
				{
					if(itemtwo.equals("Faculty of Business Administration")) 
					{
						if(itemthree.equals("Faculty of Engineering")) 
						{
							if(itemfour.equals("Faculty of Science And Technology")) 
							{
								if(itemfive.equals("Faculty List")) 
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
