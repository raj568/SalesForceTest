package com.salesforce.qa.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.salesforce.qa.base.TestBase;

public class Testng1featureTest{
	@Test(invocationCount=10)
	public void sum()
	{
		int a=10;
		int b=10;
		System.out.println(a+b);
	}
	@Test (invocationTimeOut=2,expectedExceptions=NumberFormatException.class)
	public void sub()
	{
		String str="100A";
		Integer.parseInt(str);
		System.out.println(str);
		
	}
}
