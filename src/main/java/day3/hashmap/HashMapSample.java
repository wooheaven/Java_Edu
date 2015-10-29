package day3.hashmap;

import java.util.HashMap;

class HashMapSample {
	public static void main(String[] args) {
		HashMap<Integer, String> hMap = new HashMap<Integer, String>();

		hMap.put(1, "추신수");
		hMap.put(5, "류현진");
		hMap.put(10, "강정호");

		System.out.println("텍사스: " + hMap.get(1));
		System.out.println("다저스: " + hMap.get(5));
		System.out.println("피치버그: " + hMap.get(10));

		hMap.remove(5);
		System.out.println("다저스: " + hMap.get(5));
	}
}