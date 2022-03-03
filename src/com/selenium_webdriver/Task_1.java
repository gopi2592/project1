package com.selenium_webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GOPI\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		WebDriver rundrive = new ChromeDriver();
		rundrive.get("https://www.facebook.com/");

	}

}
