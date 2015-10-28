package user1;

import day2.oracle.Oracle;

public class DBUser1 {
	
	public static void main(String[] args){
		Oracle user = new Oracle();
		
		user.connection();
		user.runTrasaction();
		user.commit();
	}
}
