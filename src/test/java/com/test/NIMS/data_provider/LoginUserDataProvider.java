package com.test.NIMS.data_provider;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
//import org.testng.annotations.Parameters;
import org.testng.annotations.Parameters;

public class LoginUserDataProvider extends BaseProvider{

	public static Object[][] dataFromExcel;
	
	@BeforeTest
	@DataProvider
	@Parameters({"username,password"})
	public static void loginData() throws IOException
	{
		BaseProvider.sheetIndex = 0;
		dataFromExcel = BaseProvider.readExcel();
		System.out.println(dataFromExcel);
	}
}
