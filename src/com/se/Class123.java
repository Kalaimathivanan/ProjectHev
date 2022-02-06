package com.se;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class123 {
	
public void sub() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\ProjectOne\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/"); 
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.id("email"));
		element.sendKeys("kalaidon98@gmail.com");
		
		WebElement element2 = driver.findElement(By.id("pass"));
		element2.sendKeys("lionelkalai@98");
      
		WebElement element3 = driver.findElement(By.name("login"));
		element3.click();
		driver.quit();
	}
}
