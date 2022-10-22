package com.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.testleaf.base.ProjectSpecificationMethod;

public class DuplicateLeadPage extends ProjectSpecificationMethod {

	public DuplicateLeadPage(ChromeDriver driver)
	{
		this.driver=driver;
	} 
	public DuplicateLeadPage enterDuplicateCompanyName(String compName) {

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(compName);
		return this;
	}
	public DuplicateLeadPage enterDuplicateFirstName(String FirstName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(FirstName);
		return this;
	}
	public DuplicateLeadPage enterDuplicateLastName(String LastName) {

		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(LastName);
		return this;
	}
	public ViewLeadPage clickDuplicateCreateLeadSubmit() {

		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage(driver);
	}
}
