package com.salesforce.qa.testcases;

import org.testng.annotations.Test;

import com.salesforce.qa.base.TestBase;
import com.salesforce.qa.pages.CreateUserpage;

public class Createusertest extends TestBase {
	CreateUserpage createupage;
	Createusertest()
	{
		super();
	}
	@Test
	public void createusertest()
	{
		createupage=new CreateUserpage();
		createupage.clickaddnewuser();
		createupage.setusername("Rajani");
		createupage.setpassword("123@");
		createupage.setcpassword("123@");
		createupage.setfullname("Rajani Boddu");
		createupage.setemail("rajani@gmail.com");
		createupage.agreeterms();
		createupage.register();
	}

}
