
package day1.stringspeed;

public class StringSpeedCheck {

	public static void main(String[] args) {
				
		String str = "SAMSUNG";
		String target = "SDS";
		
		long start = System.currentTimeMillis();
		
		for(int i = 0;i<100000;i++){
			str = str + target;
		}
		
		long end = System.currentTimeMillis();
		System.out.println(end-start);
	}
}
