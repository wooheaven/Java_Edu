package day1.encap1;

class FuncA{
	public void calDegree(){
		System.out.println("진입각도를 계산합니다");
	}
}

class FuncB{
	public void speedDown(){
		System.out.println("속도를 줄입니다");
	}
}

class FuncC{
	public void revAnLanding(){
		System.out.println("역추진 및 착륙성공!!");
	}
}

class Astronaut{
	public void controlFuncA(FuncA a){
		a.calDegree();
	}
	
	public void controlFuncB(FuncB b){
		b.speedDown();
	}
	
	public void controlFuncC(FuncC c){
		c.revAnLanding();
	}
}

public class EncapsulationExam1 {

	public static void main(String[] args) {
		Astronaut pilot = new Astronaut();
		
		FuncA fa = new FuncA();
		FuncB fb = new FuncB();
		FuncC fc = new FuncC();
		
		pilot.controlFuncA(fa);
		pilot.controlFuncB(fb);
		pilot.controlFuncC(fc);
	}
}
