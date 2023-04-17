package ch02_1;

public class E02C_1 {

	// 확장 for문을 통한 배열 스캔
	public static void main(String[] args) {
		// 배열 생성
		double[] a = {1.0, 2.0, 3.0, 4.0, 5.0};
		
		// 기본 for문 (basic for statement)
		System.out.println("기본 for문");
		for(int i = 0 ; i < a.length ; i ++) {
			System.out.print(" " + a[i] + " ");
		}
		System.out.println();
		
		System.out.println("확장 for문");
		// 확장 for문 (enhanced for statement)
		double sum = 0;
		// 배열 a의 처음부터 끝까지 모든 요소를 한 개씩 스캔합니다.
		// 루프에서 주목하고 있는 요소를 i라고 표현합니다.
		for(double i : a) {
			sum += i;
		}
		System.out.println("확장 for문을 이용한 배열 요소의 합 : " + sum);
	}
}
