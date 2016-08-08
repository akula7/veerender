package com.stockacc.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.stockacc.master.Stockaccmaster;

public class Catcreationnotepadopt {

	public static void main(String[] args) throws IOException
	{
		Stockaccmaster sm=new Stockaccmaster();
		String path="C:\\Users\\veerender\\workspace\\Stockaccounting\\src\\com\\stockacc\\testdata\\catnodepad.txt";
		String path1="C:\\Users\\veerender\\workspace\\Stockaccounting\\src\\com\\stockacc\\results\\catres.txt";
		FileReader fr=new FileReader(path);
		BufferedReader br=new BufferedReader(fr);
		br.readLine();
		
		
		FileWriter fw=new FileWriter(path);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.newLine();
	     
	    String y="";
	    sm.stockAcc_Launch("http://webapp.qedgetech.com");
	    sm.stockAcc_Login("admin", "master");
	    while ((y=br.readLine())!=null)
	    {
		String catname=y;
		String res=sm.stockacc_categeorie(catname);
		bw.write(y+"#"+res);
		
		}
	    br.close();
	    bw.close();
	    

	}

}
