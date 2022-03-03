package com.selenium_webdriver;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mini_Project_1 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GOPI\\eclipse-workspace\\Selenium_Testing\\Driver1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.get("http://adactinhotelapp.com/");
		WebElement Username = driver.findElement(By.id("username"));
		Username.sendKeys("gopinath2592");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("X@vat69");
		WebElement Login = driver.findElement(By.id("login"));
		Login.click();
		WebElement Location = driver.findElement(By.id("location"));
		Select Ref1 = new Select(Location);
		Ref1.selectByVisibleText("London");
		WebElement hotels = driver.findElement(By.id("hotels"));
		Select Ref2 = new Select(hotels);
		Ref2.selectByIndex(2);
		WebElement Roomtype = driver.findElement(By.id("room_type"));
		Select Ref3 = new Select(Roomtype);
		Ref3.selectByVisibleText("Deluxe");
		WebElement Room = driver.findElement(By.id("room_nos"));
		Select Ref4 = new Select(Room);
		Ref4.selectByVisibleText("2 - Two");
		WebElement check_in = driver.findElement(By.xpath("//input[@id='datepick_in']"));
		check_in.sendKeys("25/04/2022");
		WebElement check_out = driver.findElement(By.xpath("//input[@id='datepick_out']"));
		check_out.sendKeys("28/04/2022");
		WebElement Adults = driver.findElement(By.xpath("//select[@id='adult_room']"));
		Adults.sendKeys("2 - Two");
		WebElement Children = driver.findElement(By.xpath("//select[@id='child_room']"));
		Children.sendKeys("2 - Two");
		WebElement submit = driver.findElement(By.id("Submit"));
		submit.click();
		Thread.sleep(1000);
		WebElement Booking = driver.findElement(By.id("radiobutton_0"));
		Booking.click();
		WebElement Continue = driver.findElement(By.id("continue"));
		Continue.click();
		WebElement FirstName = driver.findElement(By.id("first_name"));
		FirstName.sendKeys("gopinath");
		WebElement LastName = driver.findElement(By.id("last_name"));
		LastName.sendKeys("p");
		WebElement Address = driver.findElement(By.id("address"));
		Address.sendKeys("periyar st");
		WebElement ccnum = driver.findElement(By.id("cc_num"));
		ccnum.sendKeys("0987654987969888");
		WebElement cctype = driver.findElement(By.id("cc_type"));
		Select Ref5 = new Select(cctype);
		Ref5.selectByIndex(2);
		WebElement ccmonth = driver.findElement(By.id("cc_exp_month"));
		Select Ref6 = new Select(ccmonth);
		Ref6.selectByVisibleText("April");
		WebElement ccexpyear = driver.findElement(By.id("cc_exp_year"));
		Select Ref7 = new Select(ccexpyear);
		Ref7.selectByVisibleText("2022");
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		cvv.sendKeys("5678");
		WebElement Booknow = driver.findElement(By.id("book_now"));
		Booknow.click();

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\GOPI\\eclipse-workspace\\Selenium_Testing\\screenshot\\booking.png");
		FileUtils.copyFile(src, dest);
		

	}

}
