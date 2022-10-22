package com.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.testleaf.base.ProjectSpecificationMethod;

public class MyHomePage extends ProjectSpecificationMethod{
	public MyHomePage(ChromeDriver driver)
	{
		this.driver=driver;
	}
	
	public LeadPage clickLead()
	{
	driver.findElement(By.linkText("Leads")).click();
	return new LeadPage(driver);
	}
	
}
