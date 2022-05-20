package com.college.collegebagtestng;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class collegebag {
	

@Test
	
	public void collegebagtest() throws InterruptedException
	{
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\eclipse-workspace\\test\\drivers\\geckodriver.exe");
		//WebDriver d=new FirefoxDriver();
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\webdrivers\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://hrlabs-at.web.app/");
		d.manage().window().maximize();
		d.get("https://hrlabs-at.web.app/");
		d.manage().window().maximize();
	
		
		WebElement email=d.findElement(By.id("input-userName"));
		email.sendKeys("admin@gmail.com");
		
		WebElement PasswordField =d.findElement(By.id("input-password"));
		PasswordField.sendKeys("admin123");
		
		
		d.findElement(By.xpath("//*[@id=\"button-submit\"]")).click();
		

		
		String u = d.getCurrentUrl();
		if
		(u.equals("https://hrlabs-at.web.app/cbag/dashboard"))
		
		
		{
			System.out.println("Test case Passed");
		}
		
		else
			
			
		{
			System.out.println("Test case Failed");
		}
		
		
		String t = d.getTitle();
		if
		(t.equals("college bag"))
		
		
		{
			System.out.println(" Title Test case Passed");
		}
		
		else
			
			
		{
			System.out.println("Title Test case Failed");
		}
		
		
		
		
			
		d.findElement(By.xpath("//*[@id=\"nav-courses\"]")).click();
		d.findElement(By.xpath("//*[@id=\"button-add\"]")).click();
		
		
		WebElement coursename=d.findElement(By.id("input-courseName"));
		coursename.sendKeys("Master of Business Administration");
		
		WebElement Acronym=d.findElement(By.id("input-acronym"));
		Acronym.sendKeys("MBA");
		
		Thread.sleep(2000);
		
		d.findElement(By.id("button-save")).click();
		
		d.navigate().back();
		Thread.sleep(2000);
		
		d.navigate().forward();
		Thread.sleep(2000);
		
		
		d.findElement(By.xpath("//*[@id=\"nav-students\"]")).click();d.findElement(By.xpath("//*[@id=\"nav-students\"]")).click();
		d.findElement(By.xpath("//*[@id=\"button-add\"]")).click();
	
		WebElement dd = d.findElement(By.xpath("//*[@id=\"select-courses\"]"));
		//dd means drop down
		//
		Select select= new Select(dd);
		select.selectByVisibleText("Master of Business Administration");
		
		
	
		
		WebElement firstname=d.findElement(By.id("input-firstName"));
		firstname.sendKeys("chandrika");
		
		WebElement lastname =d.findElement(By.id("input-lastName"));
		lastname.sendKeys("Pasupulety");
		
		
		WebElement radio1 = d.findElement(By.id("flexRadioDefault1"));
		WebElement radio2 = d.findElement(By.id("flexRadioDefault1"));
		
		
		radio2.click();
		
		
		Thread.sleep(2000);
		
		d.findElement(By.id("button-save")).click();
		
		d.navigate().refresh();
		Thread.sleep(2000);
		
		
		
		
		d.findElement(By.id("nav-signout")).click();
		
		d.close();
		
		
	}
}
