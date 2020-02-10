package com.salesforce.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.salesforce.qa.base.TestBase;

public class ContactsPage extends TestBase {
@FindBy(name="first_name")
WebElement firstname;
@FindBy(name="last_name")
WebElement lastname;
@FindBy(name="middle_name")
WebElement middlename;
@FindBy(id="title")
WebElement title;
@FindBy(name="company")
WebElement company;
@FindBy(id="save")
WebElement savebutton;
ContactsPage()
{
PageFactory.initElements(driver,this);
}
public void createNewContact(int i,String un,String ln,String md)
{


	Select select=new Select(title);
	select.selectByIndex(1);
firstname.sendKeys("un");
lastname.sendKeys("ln");
middlename.sendKeys("mn");
savebutton.click();
}

}