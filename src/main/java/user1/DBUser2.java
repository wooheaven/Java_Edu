package user1;

import day2.db2.DB2;

public class DBUser2 {
	public static void main(String[] args) {
		DB2 user = new DB2();
		
		user.login();
		user.useTrasaction();
		user.save();
	}
}
