package com.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.testleaf.base.ProjectSpecificationMethod;

public class ViewLeadPage extends ProjectSpecificationMethod{
	public ViewLeadPage(ChromeDriver driver)
	{
		this.driver=driver;	
	}
	public EditLeadPage clickEditButton()
	{
		driver.findElement(By.linkText("Edit")).click();
		return new EditLeadPage(driver);
	}
	public LeadPage clickDeleteButton()
	{
		driver.findElement(By.linkText("Delete")).click();
		return new LeadPage(driver);
	}
	public DuplicateLeadPage clickDuplicateButton()
	{
		driver.findElement(By.linkText("Duplicate Lead")).click();
		return new DuplicateLeadPage(driver);
	}


}
