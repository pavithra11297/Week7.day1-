package com.testleaf.base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.testleaf.utils.ExcelData;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectSpecificationMethod {
	public ChromeDriver driver;
	public String filename;

	@BeforeMethod
	public void preCondition() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
	}

		 @DataProvider(name="excelResult")
			public String[][] fetchdata() throws IOException{
				String[][] data;
				data=ExcelData.readSheetData(filename);
				return data;
		 
	}

	@AfterMethod
	public void postCondition() {
		driver.close();
	}
	
}