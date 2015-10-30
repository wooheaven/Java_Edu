package day5.factorymethod3;

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

class CompanyFactory {

	public static Company getInstance() {
		return new Company("SDS");
	}
}

class MyCompany {
	public void makeCompany() {
		Company myCompany = CompanyFactory.getInstance();
		System.out.println(myCompany);
	}
}

class YourCompany {
	public void makeCompany() {
		Company yourCompany = CompanyFactory.getInstance();
		System.out.println(yourCompany);
	}
}

public class FactoryMethod3 {

	public static void main(String[] args) {
		MyCompany mc = new MyCompany();
		YourCompany yc = new YourCompany();

		mc.makeCompany();
		yc.makeCompany();
	}
}
