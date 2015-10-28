package day2.looseCoupling.db;

public class Oracle implements DB{
	public void connection() {
		System.out.println("오라클에 접속했습니다");
	}

	public void runTrasaction() {
		System.out.println("오라클을 사용합니다");
	}

	public void commit() {
		System.out.println("오라클을 저장합니다");
	}
}