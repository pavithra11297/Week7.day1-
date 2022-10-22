package com.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.testleaf.base.ProjectSpecificationMethod;

public class CreateLeadPage extends ProjectSpecificationMethod{

	public CreateLeadPage(ChromeDriver driver)
	{
		this.driver=driver;
	}


	public CreateLeadPage enterCompanyName(String compName) {

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(compName);
		return this;
	}
		public CreateLeadPage enterFirstName(String FirstName) {
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys(FirstName);
			return this;
		}
		public CreateLeadPage enterLastName(String LastName) {

			driver.findElement(By.id("createLeadForm_lastName")).sendKeys(LastName);
			return this;
		}
		public ViewLeadPage clickCreateLeadSubmit() {

			driver.findElement(By.name("submitButton")).click();
			return new ViewLeadPage(driver);
		}
	}
