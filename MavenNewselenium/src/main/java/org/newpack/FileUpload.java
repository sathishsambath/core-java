package org.newpack;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

public class FileUpload {

	public static void main(String[] args) {
		
org.openqa.selenium.WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
		
		
		
		driver.get("https://letcode.in/windows");
		
		//String windowid = driver.getWindowHandle();
		
		
		driver.findElement(By.id("home")).click();
		
		 Set<String> windoids = driver.getWindowHandles();
		 
		 List<String> list = new ArrayList<String>(windoids);
		 
		 driver.switchTo().window(list.get(1));
		
		driver.findElement(By.linkText("Dialog")).click();
		
		//driver.quit();
		
	   driver.switchTo().window(list.get(0));
		
		driver.switchTo().window(list.get(1)).close();
	}
}
