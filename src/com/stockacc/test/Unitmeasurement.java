package com.stockacc.test;

import java.io.IOException;

import com.stockacc.master.Stockaccmaster;

public class Unitmeasurement {

	public static void main(String[] args) throws IOException {
		Stockaccmaster sm=new Stockaccmaster();
		sm.stockAcc_Launch(sm.strUrl);
		sm.stockAcc_Login(sm.strUsername, sm.strPassword);
		sm.stockacc_unitmeasurement("6666", "veera");
		sm.stockAcc_Logout();
		

	}

}
