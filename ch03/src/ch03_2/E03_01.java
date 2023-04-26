package ch03_2;

import java.util.Scanner;

public class E03_01 {

	// 선형 검색 후 index 반환
	static int linearSearch(int[] array, int key) {
		int i = 0;	// 배열 index 초기화
		
		while(true) {
			if(i == array.length) 	// 배열의 끝을 지나간 경우
				return -1;			// -1(못찾음)을 반환
			if(array[i] == key) 	// key 값에 해당하는 요소를 찾은 경우
				return i;			// i(index)를 반환
			i ++;
		}
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
