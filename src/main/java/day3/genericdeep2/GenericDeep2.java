
package day3.genericdeep2;

interface Computer
{
	public void runProgram();
}

class TV
{
	public void watchingTV()
	{
		System.out.println("Basic TV");
	}
}

class SamsungTV extends TV implements Computer
{
	public void runProgram()
	{
		System.out.println("Samsung SmartTV");
	}
}

class LgTV  extends TV implements Computer
{
	public void runProgram() 
	{
		System.out.println("Lg SmartTV");
	}
}

public class GenericDeep2 {

	public static <T extends Computer> void seeSmartTV(T param)
	{
		param.runProgram();
	}
	
	public static <T extends TV> void seeTV(T param)
	{
		param.watchingTV();
	}
	
	public static void main(String[] args) {
		SamsungTV samsungTV=new SamsungTV();
		LgTV lgTV=new LgTV();
		
		seeSmartTV(samsungTV);
		seeTV(samsungTV);
		seeSmartTV(lgTV);
		seeTV(lgTV);

	}
}
