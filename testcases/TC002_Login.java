package com.testleaf.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.testleaf.base.ProjectSpecificationMethod;
import com.testleaf.pages.LoginPage;

public class TC002_Login extends ProjectSpecificationMethod {
	@BeforeTest @BeforeClass
	public void fileNameSet()
	{
		filename="LeafLogin";
	}
	@Test (dataProvider="excelResult")
	public void runLogin(String name,String password)
	{
		new LoginPage(driver).enterUserName(name).enterPassword(password).ClickLogin();
	}
}
