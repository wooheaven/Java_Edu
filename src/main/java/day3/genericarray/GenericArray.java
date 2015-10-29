
package day3.genericarray;

public class GenericArray {

	public static <T> void printArr(T[] arr)
	{
		for(int i=0; i<arr.length; i++)
			System.out.println(arr[i]);
	}
	
	public static void main(String[] args)
	{
		String[] stArr=new String[]{
				"SAMSUNG",
				"SDS",
				"JAVA",
				"Advanced Course"
		};
		
		printArr(stArr);
	}
}
