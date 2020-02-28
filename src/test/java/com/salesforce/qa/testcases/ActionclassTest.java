package com.salesforce.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.salesforce.qa.base.TestBase;

public class ActionclassTest extends TestBase {
	
	ActionclassTest()
	{
		super();
	}
	@Test
	public void verifyMouseactions() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[contains(text(),'Credit Cards')]")).click();
		System.out.println("control in the credit cards page");
		driver.navigate().back();
		System.out.println("now we are in homepage");
		WebElement wb=driver.findElement(By.xpath("//span[@class='flyBtn']"));
		wb.click();
		System.out.println("control in signin page");
		driver.findElement(By.xpath("//button[contains( text(), 'Sign In')]"));
		Thread.sleep(3000);
	 //String s	=driver.getWindowHandle();
	 //driver.switchTo().window(s);
		
	 //driver.close();
	 
	 //System.out.println(s);
		//Actions act=new Actions(driver);
		//act.moveToElement(wb).perform();
		//driver.findElement(By.xpath("//a[contains(text(),'Start shopping')]")).click();;
	}
}
