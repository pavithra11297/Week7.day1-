package com.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.testleaf.base.ProjectSpecificationMethod;

public class LoginPage extends ProjectSpecificationMethod{
	public LoginPage(ChromeDriver driver)
	{
		this.driver=driver;
	}
	public LoginPage enterUserName(String name) {
		driver.findElement(By.id("username")).sendKeys(name);
		return this ;
	}
	public LoginPage enterPassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
		return this;
	}
	public HomePage ClickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new HomePage(driver);
	}
}