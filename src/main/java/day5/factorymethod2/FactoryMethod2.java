package day5.factorymethod2;

class Company {
	String companyName;

	public Company(String companyName) {
		this.companyName = companyName;
	}

	@Override
	public String toString() {
		return "Company [companyName=" + companyName + "]";
	}
}

class MyCompany {
	public void makeCompany() {
		Company myCompany = new Company("SDS");
		System.out.println(myCompany);
	}
}

class YourCompany {
	public void makeCompany() {
		Company yourCompany = new Company("SDS");
		System.out.println(yourCompany);
	}
}

public class FactoryMethod2 {

	public static void main(String[] args) {
		MyCompany mc = new MyCompany();
		YourCompany yc = new YourCompany();

		mc.makeCompany();
		yc.makeCompany();
	}
}
