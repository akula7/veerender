package com.stockacc.testsuits;

import java.io.IOException;

import com.stockacc.master.Stockaccmaster;

public class Testsuite {

	public static void main(String[] args) throws IOException {
		//login test
		Stockaccmaster sm=new Stockaccmaster();
		sm.stockAcc_Launch(sm.strUrl);
		sm.stockAcc_Login(sm.strUsername, sm.strPassword);
		sm.stockAcc_Logout();
		//categerioes
		sm.stockAcc_Launch(sm.strUrl);
		sm.stockAcc_Login(sm.strUsername, sm.strPassword);
		sm.stockacc_categeorie("veera");
		sm.stockAcc_Logout();
        //unitmeasearements
		sm.stockAcc_Launch(sm.strUrl);
		sm.stockAcc_Login(sm.strUsername, sm.strPassword);
		sm.stockacc_unitmeasurement("999", "dhoni");
		
		sm.stockAcc_Logout();
		//suppliers
		sm.stockAcc_Launch(sm.strUrl);
		sm.stockAcc_Login(sm.strUsername, sm.strPassword);
		sm.stockAcc_suppliercreation("venu", "gunture", "guntur", "andhra", "venugopa","78676878", "8767878", "vjhvbb", " i am venugopal reddy");
		
		sm.stockAcc_Logout();
		sm.close();
		
        


	}

}
