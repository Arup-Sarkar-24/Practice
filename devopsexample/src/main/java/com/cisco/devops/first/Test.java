package com.cisco.devops.first;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public String baseUrl="www.google.com";
	String driverPath ="C:\\Users\\arusarka\\Downloads\\chromedriver_mac64\\chromedriver";
	public WebDriver driver;
	@org.testng.annotations.Test
	public void Test() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseUrl);
		String URL=driver.getCurrentUrl();
		if(URL==baseUrl) {
			System.out.println("we are ok");
		}
	}

}
 