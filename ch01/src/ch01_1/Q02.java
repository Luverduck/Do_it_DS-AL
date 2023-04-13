package ch01_1;

import java.util.Scanner;

public class Q02 {

	// 세 정수 중 최소값 찾기
	static int min3(int a, int b, int c) {
		// a를 최소값으로 가정
		int min = a;
		// 값을 비교하여 최소값 반환
		if(b < min) min = b; // 현재 최소값보다 b가 작으면 b를 최소값으로 변경
		if(c < min) min = c; // 현재 최소값보다 c가 작으면 c를 최소값으로 변경
		return min;
	}
	
	public static void main(String[] args) {
		// Scanner 인스턴스 생성
		Scanner sc = new Scanner(System.in);
		// 입력 변수
		int a, b, c;
		// 사용자 입력
		System.out.print("a = "); a = sc.nextInt();
		System.out.print("b = "); b = sc.nextInt();
		System.out.print("c = "); c = sc.nextInt();
		
		// 최소값 출력
		System.out.println("min3(a, b, c,) = " + min3(a,b,c)); 
		
		sc.close();
	}
}
