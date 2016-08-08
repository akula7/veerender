package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.examples.html.XSSFHtmlHelper;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Utilities
{
	
	public static void main(String[] args) throws IOException
	{
		String path="C:\\Users\\veerender\\Desktop\\veeraxl.xlsx";
		Utilities ut=new Utilities();
		int rc=ut.rowcnt(path, "Sheet1");
		System.out.println(rc);
		

	}
	public int rowcnt(String xlpath,String sheetname) throws IOException
	{
	FileInputStream fi=new FileInputStream(xlpath);
	XSSFWorkbook wb=new XSSFWorkbook(fi);
	XSSFSheet ws=wb.getSheet(sheetname);
	int rowcnt=ws.getLastRowNum();
	return rowcnt;
	
  }
	{
		
	}
	
	
	
	

}
