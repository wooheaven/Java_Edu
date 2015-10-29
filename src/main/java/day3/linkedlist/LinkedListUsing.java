package day3.linkedlist;

import java.util.*;

public class LinkedListUsing {
	private static LinkedList<Integer> mLinkedList;

	public static void main(String[] args) {
		// LinkedList 생성
		mLinkedList = new LinkedList<Integer>();

		// LinkedList 값 추가
		mLinkedList.add(1);
		mLinkedList.add(2);
		mLinkedList.add(3);
		mLinkedList.add(4);
		mLinkedList.add(5);
		System.out.println();

		// LinkedList 값 확인
		for (int i = 0; i < mLinkedList.size(); i++) {
			System.out.println("one index " + i + " : value "
					+ mLinkedList.get(i));
		}

		System.out.println();

		// LinkedList 특정 index 값 제거
		mLinkedList.remove(0);
		// 0번째 index가 지워지면서 자동으로 1번이 0번째 index가 되었다.

		for (int i = 0; i < mLinkedList.size(); i++) {
			System.out.println("two index " + i + " : value "
					+ mLinkedList.get(i));
		}
		System.out.println();

		// LinkedList 특정 index 값 추가
		mLinkedList.add(0, 7777);
		// 0번째 index가 추가되고 나머지 index들은 뒤로 밀린다.

		for (int i = 0; i < mLinkedList.size(); i++) {
			System.out.println("three index " + i + " : value "
					+ mLinkedList.get(i));
		}
		System.out.println();

		// LinkedList 특정 index 값 수정
		mLinkedList.set(0, 77779);

		for (int i = 0; i < mLinkedList.size(); i++) {
			System.out.println("four index " + i + " : value "
					+ mLinkedList.get(i));
		}
		System.out.println();

		// LinkedList Value 포함 여부 확인
		Integer checkNumber = new Integer(99999);
		mLinkedList.add(checkNumber);

		boolean isFind = mLinkedList.contains(checkNumber);
		System.out.println("five : " + isFind + "\n");

		for (int i = 0; i < mLinkedList.size(); i++) {
			System.out.println("five index " + i + " : value "
					+ mLinkedList.get(i));
		}
		System.out.println();

		// LinkedList Value index 확인
		int index = mLinkedList.indexOf(checkNumber);
		System.out.println("six : index " + index + "\n");
		// LinkedList 값 전체 삭제
		mLinkedList.clear();

		System.out.println("seven : size " + mLinkedList.size() + "\n");

		// LinkedList의 값 존재 여부 확인
		boolean isEmpty = mLinkedList.isEmpty();

		System.out.println("eight : empty " + isEmpty + "\n");
	}

}
