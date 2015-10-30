package day5.factorymethod1;

class Company {
	String companyName;

	public Company() {

	}
}

class MyCompany {
	public void makeCompany() {
		Company myCompany = new Company();
	}
}

class YourCompany {
	public void makeCompany() {
		Company yourCompany = new Company();
	}
}

public class FactoryMethod1 {

	public static void main(String[] args) {
		MyCompany mc = new MyCompany();
		YourCompany yc = new YourCompany();

		mc.makeCompany();
		yc.makeCompany();
	}
}
