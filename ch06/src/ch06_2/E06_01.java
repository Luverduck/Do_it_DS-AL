package ch06_2;

import java.util.Scanner;

public class E06_01 {

	// 버블 정렬 ver.1
	static void bubbleSort(int[] array) {
		for(int i = 1 ; i < array.length ; i ++) {
			for(int j = 0 ; j < array.length - i ; j ++) {
				if(array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
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
		
		// 버블 정렬
		bubbleSort(array);
		
		for(int i = 0 ; i < n ; i ++) {
			System.out.print(array[i] + " ");
		}
		
		sc.close();
	}
}
