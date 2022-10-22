package com.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.testleaf.base.ProjectSpecificationMethod;

public class FindLeadPage extends ProjectSpecificationMethod{

	public FindLeadPage(ChromeDriver driver)
	{
		this.driver=driver;
	}
	public FindLeadPage clickPhone()
	{
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		return this;
	}
	public FindLeadPage enterPhoneNumber(String phoneNO)
	{
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phoneNO);
		return this;
	}
	public FindLeadPage clickFindLeadsButton() throws InterruptedException
	{
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();		
		Thread.sleep(2000);
		return this;
	}
	public ViewLeadPage clickLeadListFirstValue()
	{
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return new ViewLeadPage(driver);
	}
}

