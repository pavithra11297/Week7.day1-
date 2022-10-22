package com.testleaf.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.testleaf.base.ProjectSpecificationMethod;
import com.testleaf.pages.LoginPage ;

public class TC004_DeleteLead extends ProjectSpecificationMethod{
	@BeforeTest @BeforeClass
	public void setFileName()
	{
		filename="DeleteLead";
	}
	@Test(dataProvider="excelResult")
	public void createLead(String name,String password,String PhoneNO) throws InterruptedException
	{
		new LoginPage(driver).enterUserName(name).enterPassword(password).ClickLogin().clickCRMSFA()
		.clickLead()
		//go find lead tab and search phone number
		.clickFindLeads().clickPhone().enterPhoneNumber(PhoneNO)
		//after search choose first lead Id
		.clickFindLeadsButton().clickLeadListFirstValue()
		// click deleteButton
		.clickDeleteButton();
	}
}
