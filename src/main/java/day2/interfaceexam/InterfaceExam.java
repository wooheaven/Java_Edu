package day2.interfaceexam;

interface Afunction {
	void searchInform(String name, int phoneNum);
	void runService(int memberId, int request);
}

class AfunctionImpl implements Afunction {

	public void searchInform(String name, int phoneNum) {
		// TODO Auto-generated method stub
		
	}

	public void runService(int memberId, int request) {
		// TODO Auto-generated method stub
		
	}

//	public void searchInform(String name, int phoneNum) {
//		System.out.println(name + " 고객님의 정보를 찾았습니다");
//
//	}
//
//	public void runService(int memberId, int request) {
//		System.out.println(memberId + " 고객님의 요청하신 서비스를 수행합니다");
//
//	}
}

public class InterfaceExam {

	public static void main(String[] args) {
		Afunction aref = new AfunctionImpl();

		aref.searchInform("장그래", 0101112222);
		aref.runService(100, 1);
	}
}
