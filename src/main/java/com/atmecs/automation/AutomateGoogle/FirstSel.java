package com.atmecs.automation.AutomateGoogle;

import javax.sql.rowset.WebRowSet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSel {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\New folder\\chromedriver.exe");

		driver = new ChromeDriver();
		String baseUrl="https://www.google.com/";
		driver.get(baseUrl);
		
		
		String expectedTitle=driver.getTitle();
		String actualTitle="";
		
		if(expectedTitle.contentEquals(actualTitle)){
			System.out.println("testPassed");
		}else{
			System.out.println("testFailed");
		}

	}

}
