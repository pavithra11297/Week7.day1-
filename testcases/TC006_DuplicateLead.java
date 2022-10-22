package com.testleaf.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.testleaf.base.ProjectSpecificationMethod;
import com.testleaf.pages.LoginPage ;

public class TC006_DuplicateLead extends ProjectSpecificationMethod{
	@BeforeTest @BeforeClass
	public void setFileName()
	{
		filename="DuplicateLead";
	}
	@Test(dataProvider="excelResult")
	public void createLead(String name,String password,String PhoneNO,String CompName, String FirstName,String LastName) throws InterruptedException
	{
		new LoginPage(driver).enterUserName(name).enterPassword(password).ClickLogin().clickCRMSFA()
		.clickLead().clickFindLeads().clickPhone().enterPhoneNumber(PhoneNO).clickFindLeadsButton()
		.clickLeadListFirstValue().clickDuplicateButton()
		.enterDuplicateCompanyName(CompName).enterDuplicateFirstName(FirstName).enterDuplicateLastName(LastName)
		.clickDuplicateCreateLeadSubmit();
	}
}