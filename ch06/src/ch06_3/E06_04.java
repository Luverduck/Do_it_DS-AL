package ch06_3;

import java.util.Scanner;

public class E06_04 {
	
	// 단순 선택 정렬
	static void selectionSort(int[] array) {
		for(int i = 0 ; i < array.length ; i ++) {
			int min = i;		// 현재 루프에서 최소값의 index
			for(int j = i ; j < array.length ; j ++) {
				if(array[min] > array[j]) {
					min = j;
				}
			}
			// 교환
			int temp = array[i];
			array[i] = array[min];
			array[min] = temp;
		}
	}
	
	// 정렬
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("요소 수 : "); int n = sc.nextInt();
		
		// 배열 생성
		int[] array = new int[n];
		
		// 요소 입력
		for(int i = 0 ; i < n ; i ++) {
			System.out.print("array[" + i + "] = ");
			array[i] = sc.nextInt();
		}
		
		// 정렬
		selectionSort(array);
		
		// 정렬된 배열의 요소 출력
		for(int i = 0 ; i < n ; i ++) {
			System.out.print(array[i] + " ");
		}
		
		sc.close();
	}
}
