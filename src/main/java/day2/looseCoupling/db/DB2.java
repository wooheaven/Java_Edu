package day2.looseCoupling.db;

public class DB2 implements DB{
	@Override
	public void connection() {
		System.out.println("DB2에 접속합니다");
	}

	@Override
	public void runTrasaction() {
		System.out.println("DB2를 사용합니다");
	}

	@Override
	public void commit() {
		System.out.println("DB2를 저장합니다");		
	}
}