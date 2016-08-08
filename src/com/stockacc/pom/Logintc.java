package com.stockacc.pom;

import java.sql.Driver;

import org.testng.annotations.Test;

public class Logintc extends contants
{

@Test
public void login()
{

driver.get(el.url);
driver.manage().window().maximize();
el.stock_login(el.u,el.p);


}
	
	
	
	
	
}
