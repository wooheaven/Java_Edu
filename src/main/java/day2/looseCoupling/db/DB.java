package day2.looseCoupling.db;

public interface DB {
	void connection();
	void runTrasaction();
	void commit();
}
