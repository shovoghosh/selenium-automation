package net.automation.sqt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TestItem6 {

	public static void main(String[] args) throws InterruptedException {
		//Clicking on Faculty of Arts & Social Sciences bring to a page titled FASS
		
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
				one.click();
				
				Thread.sleep(2000);
				
				WebElement onecopy=driver.findElement(By.xpath("/html/body/div[2]/div/a"));
				String itemonecopy = onecopy.getText();
				
				if(itemonecopy.equals("FASS")) 
				{
					System.out.println("Item is Pass");
				}
				else
				{
					System.out.println("Item is Fail");
				}

	}

}
