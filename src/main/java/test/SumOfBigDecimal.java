package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.math.BigDecimal;

public class SumOfBigDecimal {
	public static void main(String[] args) {
		BigDecimal sum = new BigDecimal("0");
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File("/home/rwoo/tmp/3_xMA_Normalize/4.txt")));
			String stringValue;
			while(null!=(stringValue=br.readLine())){
				sum=sum.add(new BigDecimal(stringValue));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(sum);
	}
}
