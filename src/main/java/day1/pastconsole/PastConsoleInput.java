
package day1.pastconsole;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PastConsoleInput {

	public static void main(String[] args)
	{
		try {
			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(isr);
			System.out.print("정수를 입력하세요: ");
			String str=br.readLine();
			int num=Integer.parseInt(str);
			System.out.println("입력된 정수는: "+num+"입니다");
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
}
