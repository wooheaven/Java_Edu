
package day1.staticclass;

class Project{
	private static String projectName = "SDS HR" ;
	private static String programName = "인사관리" ;
	
	public static void projectDesign(){
		System.out.println(Project.projectName + "프로젝트 디자인 중");
	}

	public static void programming(){
		System.out.println(Project.programName + "프로그램 작성 중");
	}

	public static void maintenance(){
		System.out.println(Project.projectName + "유지보수 중");
	}
}

public class StaticClass {

	public static void main(String[] args) {
		Project.projectDesign() ;
		Project.programming() ;
		Project.maintenance() ;
	}
}
