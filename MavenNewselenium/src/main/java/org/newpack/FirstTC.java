package org.newpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTC {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	
//	driver.findElement(By.className("ico-login")).click();
//	
//	WebElement emailid = driver.findElement(By.id("Email"));
//	//Thread.sleep(2000);
//	
//	WebElement password = driver.findElement(By.name("Password"));
//	
//	//Thread.sleep(2000);
//	
//	WebElement loginbtn = driver.findElement(By.className("login-button"));
//
//	
//	emailid.sendKeys("sathish.s@collabera.com");
//	password.sendKeys("!Coll$@ctpl23");
//	loginbtn.click();
//	
	
	
//	driver.navigate().back();
//	driver.navigate().back();
//	
//	driver.navigate().forward();
//	driver.navigate().refresh();
	
	WebElement orghrm = driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']"));
	orghrm.click();
//	WebElement rememberme = driver.findElement(By.id("RememberMe"));
//	rememberme.click();
	
	
	
	
	
	
	

	}

}
