package com.stockacc.pom;

import org.apache.poi.sl.draw.geom.Path;
import org.eclipse.jetty.servlet.ErrorPageErrorHandler;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class contants
{

	WebDriver driver=new FirefoxDriver();
	Erp_login el=PageFactory.initElements(driver, Erp_login.class);
	Adminpage al=PageFactory.initElements(driver, Adminpage.class);
	
	
	
}
