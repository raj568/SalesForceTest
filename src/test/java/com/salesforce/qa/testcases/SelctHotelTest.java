package com.salesforce.qa.testcases;

import org.testng.annotations.Test;

import com.salesforce.qa.base.TestBase;
import com.salesforce.qa.pages.Loginpage;
import com.salesforce.qa.pages.SearchHotelspage;

public class SelctHotelTest extends TestBase {
	SelctHotelTest()
	{
	super();	
	}
Loginpage loginpage;
SearchHotelspage obj;
@Test
public void searchtest() throws InterruptedException
{
	loginpage=new Loginpage();
	loginpage.login(un, pwd);
	Thread.sleep(3000);
	 obj=new SearchHotelspage();
	 obj.selectlocation("Sydney");
	 obj.selecthotels("Hotel Creek");
	 obj.selectroomtype("Standard");
	 obj.selectrommnos(2);
	 obj.pickdatein("10", "05", "20");
	 obj.datepickout("13", "05", "20");
	 obj.selectadultroom(2);
	 obj.selectchilds(2);
	 obj.submit();
}

}
