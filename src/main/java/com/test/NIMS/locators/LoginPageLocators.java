package com.test.NIMS.locators;

import com.test.NIMS.base.NIMSBase;

public class LoginPageLocators extends NIMSBase{
	
	public static String username = "//input[@id='j_username']";
	public static String password = "//input[@id='j_password']";
	public static String organization = "//select[@id='cookieValue']";
	public static String login = "//input[@id='loginBtn']";
	
}