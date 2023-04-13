package ch02_1;

public class E02_4 {

	// 키의 최대값 구하기
	static int maxOf(int[] arr) {
		
		// 배열의 0번째 요소를 최대값으로 가정
		int max = arr[0];
		
		// 배열의 구성요소를 탐색하면서 최대값 교체
		for(int i = 0 ; i < arr.length ; i ++) {
			// 배열의 i번째 요소가 현재 최대값보다 크다면
			if(arr[i] > max) 
				max = arr[i]; // 최대값 교체
		}
		
		// 최대값 반환
		return max;
	}
	
	public static void main(String[] args) {
		
		// 배열 생성 및 초기화
		int[] arr = {172, 153, 192, 140, 165};
		
		// 배열 값 출력
		for(int i = 0 ; i < arr.length ; i ++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
		
		// 최대값 출력
		System.out.print("배열의 최대값은 " + maxOf(arr) + "입니다.");
	}
}
