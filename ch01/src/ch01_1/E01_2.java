package ch01_1;

public class E01_2 {
 
	// 최대값 반환 메소드
	static int maxValue(int a, int b, int c) {
		// a를 최대값으로 가정
		int max = a;
		// 세 정수를 비교하여 최대값 반환
		if(b > max) max = b;
		if(c > max) max = c;
		return max; // 메소드를 호출한 곳으로 최대값(max)를 반환
	}
	
	public static void main(String[] args) {
		
		// 여러 개의 정수 중 최대값 출력
		System.out.println("maxValue(3,2,1) = " + maxValue(3,2,1));
		System.out.println("maxValue(3,2,2) = " + maxValue(3,2,2));
		System.out.println("maxValue(3,1,2) = " + maxValue(3,1,2));
		System.out.println("maxValue(3,2,3) = " + maxValue(3,2,3));
		System.out.println("maxValue(2,1,3) = " + maxValue(2,1,3));
		System.out.println("maxValue(3,3,2) = " + maxValue(3,3,2));
		System.out.println("maxValue(3,2,1) = " + maxValue(3,2,1));
		System.out.println("maxValue(3,3,3) = " + maxValue(3,3,3));
		System.out.println("maxValue(2,2,3) = " + maxValue(2,2,3));
		System.out.println("maxValue(2,3,1) = " + maxValue(2,3,1));
		System.out.println("maxValue(2,3,2) = " + maxValue(2,3,2));
		System.out.println("maxValue(2,3,3) = " + maxValue(2,3,3));
		System.out.println("maxValue(1,2,3) = " + maxValue(1,2,3));
	}
}
