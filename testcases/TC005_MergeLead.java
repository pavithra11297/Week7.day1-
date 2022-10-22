package com.testleaf.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.testleaf.base.ProjectSpecificationMethod;
import com.testleaf.pages.LoginPage;

public class TC005_MergeLead extends ProjectSpecificationMethod {
	@BeforeTest @BeforeClass
	public void setFileName()
	{
		filename="MergeLead";
	}
	@Test(dataProvider="excelResult")
	public void createLead(String name,String password,String PhoneNO,String companyName) throws InterruptedException
	{
		new LoginPage(driver).enterUserName(name).enterPassword(password).ClickLogin().clickCRMSFA()
		.clickLead()
		.clickMergeLead().clickFromLead().clickLeadId().clickMerge();
	}
}
