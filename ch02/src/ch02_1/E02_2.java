package ch02_1;

public class E02_2 {

	// 배열의 요소값을 초기화하며 배열 선언
	public static void main(String[] args) {
		
		// 배열 선언 및 초기화
		int[] arr = {1, 2, 3, 4, 5};
		
		// 배열 구성요소의 값 출력
		for(int i = 0 ; i < arr.length ; i ++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
	}
}
