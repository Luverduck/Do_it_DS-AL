package ch03_2;

import java.util.Scanner;

public class E03_02 {

	// 선형 탐색 후 index 반환 (for문 사용)
	static int linearSearch(int[] array, int key) {
		
		for(int i = 0 ; i < array.length ; i ++) {
			if(array[i] == key)	// 검색 성공시
				return i;		// i(index) 반환
		};
		return -1;				// 그 외 -1(검색 실패) 반환
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 요소 수 : "); 
		int n = sc.nextInt();
		
		int[] array = new int[n];
		
		for(int i = 0 ; i < array.length ; i ++) {
			System.out.print("array[" + i + "] : ");
			array[i] = sc.nextInt();
		}
		
		System.out.print("검색할 값 : ");
		int key = sc.nextInt();
		
		// key 값이 있는 index
		int idx = linearSearch(array, key);
		
		if(idx == -1) 
			System.out.println("해당 값은 존재하지 않습니다.");
		else
			System.out.println(key + "는 array[" + idx + "]에 있습니다.");
		
		sc.close();
	}
}
