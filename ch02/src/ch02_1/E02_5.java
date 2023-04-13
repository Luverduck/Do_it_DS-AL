package ch02_1;

import java.util.Random;

public class E02_5 {

	// 배열의 최대값 구하기
	static int maxOf(int[] arr) {
		
		// 배열의 0번째 요소가 최대값이라고 가정
		int max = arr[0];
		
		// 최대값 찾기
		for(int i = 0 ; i < arr.length ; i ++) {
			if(arr[i] > max)
				max = arr[i];
		}
		
		// 찾아낸 최대값 반환
		return max;
	}
	
	// 난수 요소로 생성된 배열의 구성요소 최대값 구하기
	public static void main(String[] args) {
		
		// 배열 생성
		int[] arr = new int[5];
		
		// 랜덤 생성
		Random r = new Random();
		
		// 배열 요소 입력
		for(int i = 0 ; i < arr.length ; i ++) {
			// 100 ~ 199까지의 난수 생성
			arr[i] = 100 + r.nextInt(100);
		}
		
		// 배열의 요소 출력
		for(int i = 0 ; i < arr.length ; i ++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
		
		// 최대값 출력
		System.out.print("배열의 최대값은 " + maxOf(arr) + "입니다");
	}
}
