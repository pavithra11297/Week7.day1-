package com.testleaf.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.testleaf.base.ProjectSpecificationMethod;
import com.testleaf.pages.LoginPage;

public class TC001_createLead extends ProjectSpecificationMethod {
	@BeforeTest @BeforeClass
	public void setFileName()
	{
		filename="CreateLead";
	}
	@Test(dataProvider="excelResult")
	public void createLead(String name,String password,String CompName, String FirstName,String LastName)
	{
		new LoginPage(driver).enterUserName(name).enterPassword(password).ClickLogin().clickCRMSFA()
		.clickLead()
		.clickCreateLead()
		.enterCompanyName(CompName).enterCompanyName(FirstName).enterCompanyName(LastName).clickCreateLeadSubmit();
	}
}
