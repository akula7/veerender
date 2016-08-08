package com.stockacc.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class Adminpage
{

	@FindBy(linkText="dashboard")
	WebElement dashboard;
	
	

	@FindBy(xpath=".//*[@id='mi_a_stock_items']/a")
	WebElement stockitem ;
	

	@FindBy(xpath=".//*[@id='mi_a_suppliers']/a")
	WebElement supplier ;
	
	
	public void dashboardclick()
	{
		dashboardclick();
	}
	public void stockitemsclick()
	{
		stockitemsclick();
	}
	public void suppliersclick()
	{
		suppliersclick();
	}
	
	
	
	
	
	
	
	
}
