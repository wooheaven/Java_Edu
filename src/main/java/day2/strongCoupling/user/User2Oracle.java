package day2.strongCoupling.user;

import day2.strongCoupling.db.Oracle;

public class User2Oracle {
	
	public static void main(String[] args) {
		Oracle user = new Oracle() ;
		
		user.connection() ;
		user.runTrasaction() ;
		user.commit() ;
	}
}