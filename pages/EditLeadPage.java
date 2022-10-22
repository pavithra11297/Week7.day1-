package com.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.testleaf.base.ProjectSpecificationMethod;

public class EditLeadPage extends ProjectSpecificationMethod {
	public EditLeadPage(ChromeDriver driver)
	{
		this.driver=driver;	
	}
	public EditLeadPage updatecompanyName(String companyName) {
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(companyName);
		return this;
	}
	public EditLeadPage clickUpdateButton()
	{
		driver.findElement(By.name("submitButton")).click();
		return this;
	}
}
