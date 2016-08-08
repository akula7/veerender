package com.stockacc.master;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Stockaccmaster 
{
	//Global Variables
	
		public static String strUrl="http://webapp.qedgetech.com";

		public static String expval,actval;
		public WebDriver driver;
		public String strUsername="admin",strPassword="master";
	    public static	String filepath="C:\\Users\\veerender\\workspace\\Stockaccounting\\src\\com\\stockacc\\properties\\stockaccoutingLocatervalues.properties";
		public FileInputStream fis;
		Properties pr;
		
		
		/*Domain Name:ERP
		Project Name :Stock Accounting
		Function Name: stockAcc_Launch()
		Arguments      : url
		Description    : It will launch Stock Accounting Application
		Return Type    : String
		Author         :xxxxxxxxxxx
		Creation Date  :19/7/2016*/
		
		
		public String stockAcc_Launch(String strUrl) throws IOException
		{
			 fis=new FileInputStream(filepath);
			 pr=new Properties();
			 pr.load(fis);
			
			expval="Login";
			driver=new FirefoxDriver();
			driver.get(strUrl);
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			actval=driver.findElement(By.id(pr.getProperty("login"))).getText();
			if (expval.equalsIgnoreCase(actval)) 
			{
				return "Pass";
				
			}
			else
			{
				return "Fail";
			}
			
		}
		
		
		/*Domain Name:ERP
		Project Name :Stock Accounting
		Function Name: stockAcc_Login()
		Arguments      : strUsername,strPassword
		Description    : It will login  Stock Accounting Application
		Return Type    : String
		Author         :xxxxxxxxxxx
		Creation Date  :19/7/2016*/
		
		public String stockAcc_Login(String strUsername, String strPassword)

		{
			expval="administrator";
			driver.findElement(By.id(pr.getProperty("username"))).clear();
			driver.findElement(By.id("username")).sendKeys(strUsername);
			
			driver.findElement(By.id(pr.getProperty("password"))).clear();
			driver.findElement(By.id("password")).sendKeys(strPassword);
			
			driver.findElement(By.id(pr.getProperty("login"))).click();
			
			actval=driver.findElement(By.xpath(".//*[@id='msUserName']/font/strong")).getText();
			if (expval.equalsIgnoreCase(actval))
			{
				return "Pass";
			}
			else
			{
				return "Fail";
			}
			
		}
		public String stockacc_categeorie(String strCatagerioename)
		{
			expval=strCatagerioename;
			Boolean flag=false;
			int count=0;
			Actions act=new Actions(driver);
			act.moveToElement(driver.findElement(By.xpath(pr.getProperty("stockiteam")))).build().perform();
			driver.findElement(By.xpath(pr.getProperty("stockcategory"))).click();
			driver.findElement(By.xpath(pr.getProperty("add"))).click();
			Sleeper.sleepTightInSeconds(5);
			driver.findElement(By.xpath(pr.getProperty("catagerioename"))).sendKeys(strCatagerioename);
			driver.findElement(By.xpath(pr.getProperty("addbtn"))).click();
			driver.findElement(By.xpath(pr.getProperty("okbtn"))).click();
			driver.findElement(By.xpath(pr.getProperty("okbutton"))).click();
		    String pcnt=driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/form/div[2]/span[2]")).getText();
		    String[] split=pcnt.split(" ");
		    System.out.println(split.length );
		    String cnt=split[2];
		    int pc=Integer.parseInt(cnt);
		    do 
		  {
		    List<WebElement> rows=driver.findElements(By.xpath("//table[@id='tbl_a_stock_categorieslist']/tbody/tr"));
		    for (int i = 0; i < rows.size(); i++)
		       {

			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			String actval=cols.get(3).getText();
			if (expval.equalsIgnoreCase(actval));
			    {
			    	System.out.println("true");
				 flag = true;
				 break;
				
			   }
			}
		    
		
		    
		    
		    if (flag)
		    {
		    	break;
		    }
		    else
		    {
		    	driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/form/div[2]/div/div/div[2]/a[1]")).click();
		    }
		    count++;
		 }
		  while (count <= pc);
		    
		
		   
		    if(flag) 
		{
			return "Pass";
		}
		    else
		{
			return "Fail";

			
	    }
		
	}


            public String stockacc_unitmeasurement( String strUid,String strUDes)
            		    
            {
            	boolean flag=false;
            	String expname=strUid;
            	Actions act=new Actions(driver);
    			act.moveToElement(driver.findElement(By.xpath(pr.getProperty("stockiteam")))).build().perform();
    			driver.findElement(By.xpath(pr.getProperty("unitmeasurment"))).click();
    			driver.findElement(By.xpath(pr.getProperty("addumo"))).click();
    			driver.findElement(By.xpath(pr.getProperty("idumo"))).sendKeys(strUid);
    			driver.findElement(By.xpath(pr.getProperty("umodescription"))).sendKeys(strUDes);
    			driver.findElement(By.xpath(pr.getProperty("addumo1"))).click();
    			driver.findElement(By.xpath(pr.getProperty("okbtn"))).click();
    			driver.findElement(By.xpath(pr.getProperty("okbutton"))).click();
    			driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[2]/div[2]/div/button")).click();
    			driver.findElement(By.xpath(".//*[@id='psearch']")).sendKeys(strUid);
				driver.findElement(By.xpath(".//*[@id='btnsubmit']")).click();
    			
List<WebElement> names=driver.findElements(By.xpath(".//table[@id='tbl_a_unit_of_measurementlist']/tbody/tr/td[3]/div/span"));
for (int i = 0; i < names.size(); i++) {
	
	String actname=names.get(i).getText();
	if (expname.equalsIgnoreCase(actname)) {
		
		
	 flag=true;
	break;
		
	}
	
}
	
	if (flag) {
		
		return "pass";
		
	}
	else
	{
		return "fail";
	}
            
            
            
            
            
            
 }
	public String stockAcc_Logout()
	
	{
		expval="Login";
		driver.findElement(By.xpath(pr.getProperty("logoutbtn"))).click();
		actval=driver.findElement(By.id(pr.getProperty("login"))).getText();
		if (expval.equalsIgnoreCase(actval))
		{
			return "Pass";
		}
	else
		{
			return "Fail";
		}
	}
		public String stockAcc_suppliercreation(String add,String address,String city,String country,String cperson,String pno,String email,String omn,String notes)
		
		{
		actval="Add succeeded";
		driver.findElement(By.xpath(pr.getProperty("supplier"))).click();
		driver.findElement(By.xpath(pr.getProperty("addsupplier"))).click();
	
		driver.findElement(By.id(pr.getProperty("suppliername"))).sendKeys(add);
		driver.findElement(By.id(pr.getProperty("supplieraddress"))).sendKeys(address);
		driver.findElement(By.id(pr.getProperty("suppliercity"))).sendKeys(city);
		driver.findElement(By.id(pr.getProperty("suppliercountry"))).sendKeys(country);
		driver.findElement(By.id(pr.getProperty("suppliercp"))).sendKeys(cperson );
		driver.findElement(By.id(pr.getProperty("suppliermobile"))).sendKeys(pno);
		driver.findElement(By.id(pr.getProperty("supplieremail"))).sendKeys(email);
		driver.findElement(By.id(pr.getProperty("suppliermb"))).sendKeys( omn);
		driver.findElement(By.id(pr.getProperty("suppliernote"))).sendKeys(notes);
		driver.findElement(By.id(pr.getProperty("supplierad"))).click();
		driver.findElement(By.xpath(pr.getProperty("adsupplierok"))).click();
	
		expval=driver.findElement(By.xpath("//*[@class='ajs-dialog']/div[3]/div/div")).getText();
		driver.findElement(By.xpath(pr.getProperty("okokbtn"))).click();
		if(expval.equalsIgnoreCase(actval))
		
	    {
			return "pass";
		}
	    else
	    {
	    	return "fail";
	    }
		}
       public void close()
       {
    	   driver.close();
       }


	



				
			




	  

