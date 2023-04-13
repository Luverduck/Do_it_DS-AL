package ch02_1;

import java.util.Scanner;

public class E02_7 {

	// 두 배열의 비교 (같다/다르다)
	static boolean equals(int[] arr1, int[] arr2) {
		// 1) 배열의 길이 비교
		if(arr1.length != arr2.length) 	// 배열의 길이가 다르다면
			return false;				// false를 반환
		
		// 2) 배열의 요소 비교
		for(int i = 0 ; i < arr1.length ; i ++) { // 이미 두 배열의 길이는 같으므로
			if(arr1[i] != arr2[i]) 		// arr1과 arr2의 i번째 요소가 서로 다르다면
				return false;			// false를 반환
		}
		
		// 1)과 2)를 모두 만족할 경우
		return true;						// true를 반환
	}
	
	// 두 배열의 비교 (같다/다르다)
	public static void main(String[] args) {
		// 사용자 입력
		Scanner sc = new Scanner(System.in);
		
		// 배열 arr1의 길이
		System.out.print("배열 a의 길이 : "); int nA = sc.nextInt();
		
		// 배열 arr1 생성
		int[] arr1 = new int[nA];
		
		// 배열 arr1의 요소 대입
		for(int i = 0 ; i < arr1.length ; i ++) {
			System.out.print("arr[" + i + "] : "); arr1[i] = sc.nextInt();
		}
		
		// 배열 arr2의 길이
		System.out.print("배열 b의 길이 : "); int nB = sc.nextInt();
		
		// 배열 arr1 생성
		int[] arr2 = new int[nB];
				
		// 배열 arr1의 요소 대입
		for(int i = 0 ; i < arr2.length ; i ++) {
			System.out.print("arr[" + i + "] : "); arr2[i] = sc.nextInt();
		}
		
		// 배열 비교
		System.out.println(
				"배열 arr1과 배열 arr2는 "
				+ (equals(arr1, arr2) ? "같습니다." : "같지 않습니다.") // 3항 연산자 이용
				);
		
		sc.close();
	}
}
