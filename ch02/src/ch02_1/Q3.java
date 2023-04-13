package ch02_1;

public class Q3 {

	// 배열의 모든 요소의 합계 구하기
	static int sumOf(int[] arr) {
		
		// 합계 변수 초기화
		int sum = 0;
		
		// 합계 구하기
		for(int i = 0 ; i < arr.length ; i ++) {
			sum += arr[i];
		}
		
		// 합계 반환
		return sum;
	}
	
	// 배열의 모든 요소의 합계 출력
	public static void main(String[] args) {
		
		// 배열 생성
		int[] arr = {5, 10, 73, 2, -5};
		
		// 요소의 합계 출력
		System.out.println("배열의 구성요소의 합계는 " + sumOf(arr) + "입니다.");
	}
}
