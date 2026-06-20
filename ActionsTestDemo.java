package com.SeleniumActionsTestDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsTestDemo {
	int linkCount;
	List<WebElement> list;
	List<WebElement> images;
	@Test
	public void actions() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.nopcommerce.com/en?srsltid=AfmBOooSbUlICmhDPk_lU1Npo7qnoq6b_Z_QQux44d-RH-rUPZofqvEI");
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"en-page\"]/body/div[7]/header/nav/div[3]/div/ul[1]/li[3]/span"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).build().perform();
		
		list = driver.findElements(By.tagName("a"));
		System.out.println("Number of links : "+list.size());
		
		images = driver.findElements(By.tagName("img"));
		System.out.println("Number of images: " + images.size());
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
		}
		Thread.sleep(5000);
		
		WebElement ele1 = driver.findElement(By.xpath("//span[normalize-space()='Training']"));
		ele1.click();
		
		System.out.println(driver.getCurrentUrl());
		
		
		
		
		
	}

}
