package com.stockacc.test;

import java.io.IOException;

import com.stockacc.master.Stockaccmaster;

public class Suppliertest {

	public static void main(String[] args) throws IOException {
		Stockaccmaster sm=new Stockaccmaster();
		sm.stockAcc_Launch(sm.strUrl);
		sm.stockAcc_Login(sm.strUsername,sm.strPassword);
		sm.stockAcc_suppliercreation("kholi", "delhi", "delhi", "india", "v.kholi", "987654322", "v.kholi", "78787878778", "i love cricket");
		sm.stockAcc_Logout();
		

	}

}
