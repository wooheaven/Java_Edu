
package day1.stringbuilder;

public class StringBuilderExam {
	
	public static void main(String[] args)
	{
		StringBuilder strBuf=new StringBuilder("SDS");
		strBuf.append(30);
		strBuf.append('V').append(true);
		System.out.println(strBuf);		
		
		strBuf.insert(3, " MultiCampus");
		strBuf.insert(strBuf.length(), 'X');
		System.out.println(strBuf);
	}
}
