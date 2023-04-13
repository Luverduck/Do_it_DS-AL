package ch02_1;

import java.util.Scanner;

public class E02_6 {

	// 배열의 요소를 역순으로 정렬
	static void swap(int[] arr, int idx1, int idx2) {
		
		// 1) temp에 배열의 idx1 번째 요소의 값 저장
		int temp = arr[idx1];
		
		// 2) 배열의 idx1 번째 요소에 idx2 번째 요소의 값 대입
		arr[idx1] = arr[idx2];
		
		// 3) 배열의 idx2번째 요소에 temp의 값 대입
		arr[idx2] = temp;
	}
	
	public static void main(String[] args) {
		
		// 배열 생성 및 초기화
		int[] arr = new int[5];
		
		// 사용자 입력
		Scanner sc = new Scanner(System.in);
		for(int i = 0 ; i < arr.length ; i ++) {
			System.out.print("arr[" + i + "] = "); arr[i] = sc.nextInt();
		}
		
		// 배열의 요소를 역순으로 정렬
		// - 요소 교환 횟수는 "배열의 길이/2"
		// - 배열의 길이가 홀수일 경우 가운데 있는 요소는 교환할 필요가 없다.
		for(int i = 0 ; i < arr.length / 2 ; i ++) { 
			swap(arr, i, (arr.length-1) - i);
		}
		
		System.out.println("배열을 역순으로 정렬합니다.");
		
		// 배열의 요소 출력
		for(int i = 0 ; i < arr.length ; i ++) {
			System.out.println("arr["+ i + "] = " + arr[i]);
		}
		
		sc.close();
	}
}
