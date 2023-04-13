package ch02_1;

public class E02_3 {

	// 배열의 복제
	public static void main(String[] args) {
		// 배열 a 선언
		int[] a = {1, 2, 3, 4, 5};
		
		// 배열 b 선언 및 배열 a를 복제
		int[] b = a.clone();
		
		// 배열 b의 요소값 확인
		for(int i = 0 ; i < b.length ; i ++) {
			System.out.println("b[" + i + "] = " + b[i]);
		}
	}
}
