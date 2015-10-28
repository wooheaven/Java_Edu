package day2.looseCoupling.user;

import day2.looseCoupling.db.DB;
import day2.looseCoupling.db.DB2;

public class User1DB2 {
	public static void main(String[] args) {
		DB user = new DB2();

		user.connection();
		user.runTrasaction();
		user.commit();
	}
}