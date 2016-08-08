package com.stockacc.master;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.swing.text.AbstractDocument.BranchElement;
import javax.xml.ws.Action;

import org.apache.http.annotation.Experimental;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Mastertestng 
{
public static String url="http://webapp.qedgetech.com";
public static WebDriver driver;
public FileInputStream fi;
public Properties pr;
public String actval,excval;
public Stockaccmaster sm;
public static String uname="admin",pwd="master";
@BeforeSuite
public void stockacc_launch() throws IOException
{
	fi=new FileInputStream("C:\\Users\\veerender\\workspace\\Stockaccounting\\src\\com\\stockacc\\properties");
	pr=new Properties();
	pr.load(fi);
	excval="btnsubmit";
	
	String br=pr.getProperty("browser");
	if (br.equalsIgnoreCase("firefox"))
	{
		driver=new FirefoxDriver();
	}
	else if (br.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\VEEREN~1\\AppData\\Local\\Temp\\Rar$DRa0.052\\chromedriver.exe");
	driver=new ChromeDriver();	
	}
	else if (br.equalsIgnoreCase("ie"))
	{
		System.setProperty("webdriver.ie.driver","C:\\Users\\VEEREN~1\\AppData\\Local\\Temp\\Rar$DRa0.877\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
	}
	driver.getCurrentUrl();
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	actval=driver.findElement(By.id("btnsubmit")).getAttribute("id");
	Assert.assertEquals(actval, excval,"launch is failed");
	
	
	 
	
	
}
@BeforeTest
public void stockacc_login()
excval="Administrator";
driver.findElement(By.id("username")).clear();
driver.findElement(By.id("username")).sendKeys(uname);
driver.findElement(By.id("password")).clear();
driver.findElement(By.id("password")).sendKeys(pwd);
driver.findElement(By.id("btnsubmit")).click();
actval=driver.findElement(By.xpath(".//*[@id='msUserName']/font/strong")).getText();
Assert.assertEquals(actval, excval,"Login Failed");
}











}
