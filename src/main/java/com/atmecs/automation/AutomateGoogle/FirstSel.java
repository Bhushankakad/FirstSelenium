package com.atmecs.automation.AutomateGoogle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.sql.rowset.WebRowSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSel {

	
	
	
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> name=new HashMap<Integer, String>();
		name.put(10,"Ram");
		name.put(85,"shyam");
		name.put(5,"sumedh");
		
		
		//Set<String> lisyOfName=name.keySet();
		Set<Integer> nam=name.keySet();
		
		
		ArrayList<String> al=new ArrayList<String>();
		Iterator ite=name.entrySet().iterator();
		while(ite.hasNext()){
			Map.Entry<Integer, String> entry=(Map.Entry)ite.next();
			if(entry.getValue()==""){
				al.add(entry.getValue());
			}
		}
		
		
	/*	WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\New folder\\chromedriver.exe");

		driver = new ChromeDriver();
		String baseUrl="https://www.google.com/";
		driver.get(baseUrl);
		
		driver.findElement(By.name("q")).sendKeys("xpath");;
		
		driver.findElement(By.linkText("Gmail")).click();
		
		try {
			driver.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			driver.wait(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println(driver.findElement(By.cssSelector("a.gb_P")).getText());
		
		driver.findElement(By.cssSelector("a.gb_P")).click();;
		
		
		
		
		
		
		//driver.findElement(By.xpath("//*[@id='gbw']/div/div/div[1]/div[1]/a")).click();;
		
	
		
		System.out.println(driver.getCurrentUrl());
		
		driver.get("http://www.atmecs.com/");
		
		driver.navigate().back();
		
		
		//*[@id="gsr"]
		
		
		String expectedTitle=driver.getTitle();
		String actualTitle="";
		
		if(expectedTitle.contentEquals(actualTitle)){
			System.out.println("testPassed");
		}else{
			System.out.println("testFailed");
		}

		
		driver.close();
		
		driver.quit();*/
	}
	
	

	
	

}
