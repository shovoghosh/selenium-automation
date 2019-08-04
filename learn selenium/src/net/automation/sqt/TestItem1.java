package net.automation.sqt;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestItem1 {

	public static void main(String[] args)  throws InterruptedException {
		JavascriptExecutor jes; 
		
		// Clicked on the ‘Academic Calendar’, it displays the academic calendar for all semesters.
		
		WebDriver driver = Base.getDriver();
		
		//Navigating Web-site
		//go to www.aiub.edu
		
		driver.get("http://www.aiub.edu");
		
		
		//click on login
				
		//find Academic Calendar element
				
				WebElement element=driver.findElement(By.xpath("//*[@id=\"tile8\"]/div/div/a[2]"));
				element.click();
				
			//check pass/fail
				
				WebElement panel_title=driver.findElement(By.xpath("//*[@id=\"frame\"]/div/div[2]/div[1]/h2"));
				String paneltitle = panel_title.getText();
				System.out.println(paneltitle);
				
				Thread.sleep(3000);
				jes = (JavascriptExecutor)driver;
				jes.executeScript("scroll(0, 1500)");
				
				WebElement panel_end=driver.findElement(By.xpath("//*[@id=\"frame\"]/div/div[2]/div[1]/p[4]"));
				String panelend = panel_end.getText();
				System.out.println(panelend);
				
				if(paneltitle.equals("Summer 2018-19")) 
				{
					
					if(panelend.equals("AIUB reserves the right to change the academic calendar.")) 
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

}
