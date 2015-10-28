package day2.looseCoupling.user;

import day2.looseCoupling.db.DB;
import day2.looseCoupling.db.Oracle;

public class User2Oracle {
	public static void main(String[] args) {
		DB user = new Oracle() ;
		
		user.connection() ;
		user.runTrasaction() ;
		user.commit() ;	
	}
}