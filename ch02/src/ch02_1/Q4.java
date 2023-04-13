package ch02_1;

public class Q4 {

	// 배열의 요소 복사
	static void copy(int[] a, int[] b) {
		// 배열 a에 배열 b의 모든 요소를 복사
		// 1) 배열의 길이 설정 - 길이가 짧은 배열의 길이
		// - 길이가 짧은 배열의 길이만큼 요소 복사 후 나머지는 초기값인 0으로 채워짐
		int length = a.length <= b.length ? a.length : b.length;
		// 2) 배열의 요소 복사
		for(int i = 0 ; i < length ; i ++) {
			a[i] = b[i];
		}
	}
	
	// 배열 a에 배열 b의 모든 요소를 복사
	public static void main(String[] args) {
		// 배열 생성
		int[] a = new int[5];
		int[] b = {10, 73, 2, -5, 42};
		
		// 복사 전 배열의 요소 출력
		System.out.println("복사 전");
		System.out.print("a[] = {");
		for(int i = 0 ; i < a.length ; i ++) {
			System.out.print(" " + a[i] + " ");
		}
		System.out.println("}");
		
		System.out.print("b[] = {");
		for(int i = 0 ; i < a.length ; i ++) {
			System.out.print(" " + b[i] + " ");
		}
		System.out.println("}");
		
		// 배열 복사
		copy(a, b);
		
		// 복사 후 배열의 요소 출력
		System.out.println("복사 후");
		System.out.print("a[] = {");
		for(int i = 0 ; i < a.length ; i ++) {
			System.out.print(" " + a[i] + " ");
		}
		System.out.println("}");
		
		System.out.print("b[] = {");
		for(int i = 0 ; i < a.length ; i ++) {
			System.out.print(" " + b[i] + " ");
		}
		System.out.println("}");
	}
}
