package org.newpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://letcode.in/alert");
		
	
		
//		WebElement chatbotclose = driver.findElement(By.id("prompt"));
//				
//		       
//				chatbotclose.click();
//				Thread.sleep(2000);
//				
//				driver.switchTo().alert().sendKeys("sathish");
//				Thread.sleep(2000);
//				driver.switchTo().alert().accept()

		System.out.println(driver.getCurrentUrl());
		
		String pagetitle= driver.getTitle();
		
		System.out.println(pagetitle);
		
		//System.out.println(driver.getPageSource());
		
		System.out.println(driver.getClass());
		
		
		
		
		
				
				
	}

}
