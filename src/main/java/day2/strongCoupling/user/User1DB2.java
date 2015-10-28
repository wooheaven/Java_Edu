package day2.strongCoupling.user;

import day2.strongCoupling.db.DB2;

public class User1DB2 {
	
	public static void main(String[] args) {
		DB2 user = new DB2() ;
		
		user.login() ;
		user.useTrasaction() ;
		user.save() ;
	}
}