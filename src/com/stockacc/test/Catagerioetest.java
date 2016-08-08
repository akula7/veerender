package com.stockacc.test;

import java.io.IOException;

import com.stockacc.master.Stockaccmaster;

public class Catagerioetest {

	public static void main(String[] args) throws IOException {
	Stockaccmaster sm=new Stockaccmaster();
	sm.stockAcc_Launch(sm.strUrl);
	sm.stockAcc_Login(sm.strUsername, sm.strPassword);
	sm.stockacc_categeorie("veerender");
	sm.stockAcc_Logout();

	}

}
