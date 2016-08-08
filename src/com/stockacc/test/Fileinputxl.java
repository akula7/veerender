package com.stockacc.test;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.stockacc.master.Stockaccmaster;
import com.sun.jna.platform.unix.X11.Font;
import com.thoughtworks.selenium.webdriven.commands.GetAlert;

public class Fileinputxl {

	public static void main(String[] args) 
	{
		{
		Stockaccmaster sm=new Stockaccmaster(xlpath);
		String xlpath="C:\\Users\\veerender\\workspace\\Stockaccounting\\src\\com\\stockacc\\testdata\\excelfile.xlsx";
		
		String xlout="C:\\Users\\veerender\\workspace\\Stockaccounting\\src\\com\\stockacc\\results";
		FileInputStream fi=new FileInputStream(xlpath);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("testdata");
		int rc=ws.getLastRowNum();
		CellStyle style=wb.createCellStyle();
		Font font=wb.createFont();
		
		
		
		

		
		
		
		}
		
		
		

	}

}
