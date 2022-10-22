package com.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.testleaf.base.ProjectSpecificationMethod;

public class HomePage extends ProjectSpecificationMethod {

	public HomePage(ChromeDriver driver)
	{
		this.driver=driver;
	}
	public MyHomePage clickCRMSFA() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage(driver);
	}
}
