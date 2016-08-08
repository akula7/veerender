package com.stockacc.sample;

import java.util.Scanner;

public class reversing 
{
	

	public static void main(String[] args)
	{
//	String org="qedge";
		Scanner sc=new Scanner(System.in);
		String org=sc.next();
		
		String rev="";
		int len=org.length();
	
	
	//for(int i=0;i<len;i++)
	//{
    //char r=org.charAt(i);
    //System.out .println(r);	
	//}
System.out.println(rev);
		
		if (org.equalsIgnoreCase(rev)) 
		{
			System.out.println("Given String is polindrome");
		}
	
		else
		{
			System.out.println("Given String is not a polindrome");
		}
	
	
    
    
	}

}
