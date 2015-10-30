package day5.reflectioninstance;

class Company {
	private String name;
	private int rank;

	Company() {
		name = "SDS";
		rank = 1;
	}

	@Override
	public String toString() {
		return "Company [name=" + name + ", rank=" + rank + "]";
	}
}