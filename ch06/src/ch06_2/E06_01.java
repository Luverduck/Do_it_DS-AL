package ch06_2;

import java.util.Scanner;

public class E06_01 {

	// 배열의 idx1 번째 원소와 idx2 번째 원소 교환
	static void swap(int[] array, int idx1, int idx2) {
		int temp = array[idx2];
		array[idx2] = array[idx1];
		array[idx1] = temp;
	}
	
	// 버블 정렬 ver.1
	static void bubbleSort(int[] array, int count) {
		for(int i = 1 ; i < array.length ; i ++) {
			for(int j = 0 ; j < array.length - i ; j ++) {
				if(array[j] > array[j + 1]) {
					swap(array, j, j + 1);
					count ++;
				}
			}
		}
		System.out.println("총 교환 횟수 : " + count);
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
		
		// 교환 카운트 초기화
		int count = 0;
		
		// 정렬
		bubbleSort(array, count);
		
		for(int i = 0 ; i < n ; i ++) {
			System.out.print(array[i] + " ");
		}
		
		sc.close();
	}
}
