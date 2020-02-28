package com.salesforce.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.salesforce.qa.base.TestBase;

public class SearchHotelspage extends TestBase {
@FindBy(id="location")
WebElement Location;
@FindBy(xpath="//*[@id='hotels']")
WebElement hotels;
@FindBy(id="room_type")
WebElement roomtype;
@FindBy(id="room_nos")
WebElement roomnos;
@FindBy(xpath="/input[@id='datepick_in']")
WebElement datepick_in;
@FindBy(id="datepick_out")
WebElement datepickout;
@FindBy(id="adult_room")
WebElement adultroom;
@FindBy(xpath="//*[@id='child_room']")
WebElement childroom;
@FindBy(id="Submit")
WebElement search;
@FindBy(id="Reset")
WebElement Reset;
public SearchHotelspage()
{
	PageFactory.initElements(driver, this);
}
public void selectlocation(String val)
{
	Select obj=new Select(Location);
	obj.selectByValue(val);
}
public void selecthotels(String val){
	
new Select(hotels).selectByValue(val);
}
public void selectroomtype(String val)
{
	new Select(roomtype).selectByValue(val);
}
public void selectrommnos(int val)
{
	new Select(roomnos).selectByIndex(val);
}
public void pickdatein(String dd,String mm,String yy){
	datepick_in.sendKeys(dd);
	datepick_in.sendKeys(mm);
	datepick_in.sendKeys(yy);
	
}
public void datepickout(String dd,String mm,String yy){
	datepickout.sendKeys(dd);
	datepickout.sendKeys(mm);
	datepickout.sendKeys(yy);
}
public void selectadultroom(int val){
	new Select(adultroom).selectByIndex(val);
}
public void selectchilds(int val){
	new Select(childroom).selectByIndex(val);
}
public void submit()
{
	search.click();
}
public void reset()
{
	Reset.click();
}

}

