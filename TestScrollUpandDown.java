package com.SeleniumActionsTestDemo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestScrollUpandDown {
	WebDriver driver;
	String url = "https://www.nopcommerce.com/en?srsltid=AfmBOooSbUlICmhDPk_lU1Npo7qnoq6b_Z_QQux44d-RH-rUPZofqvEI";
	
	@Test
	public void Test() throws Exception{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(url);
		Thread.sleep(2000);
		
		((JavascriptExecutor)driver).executeScript("scroll(0,6000)");
		Thread.sleep(2000);
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-4200)", " ");
		
		
	}
	

}
