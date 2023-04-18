package ch06_4;

import java.util.Scanner;

public class E06_06 {

	// 삽입 정렬
	static void insertionSort(int[] array) {
		for(int i = 1 ; i < array.length ; i ++) {
			int j;
			int temp = array[i];
			for(j = i ; j > 0 && array[j - 1] > temp ; j --) {
				array[j] = array[j - 1];
			}
			array[j] = temp;
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
		insertionSort(array);
		
		for(int i = 0 ; i < n ; i ++) {
			System.out.print(array[i] + " ");
		}
		
		sc.close();
	}
}
