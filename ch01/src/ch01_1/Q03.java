package ch01_1;

import java.util.Scanner;

public class Q03 {
 
	// 네 정수 중 최소값 구하기
	static int min4(int a, int b, int c, int d) {
		// a를 최소값으로 가정
		int min = a;
		// 대소 비교를 통해 최소값 구하기
		if(b < min) min = b;
		if(c < min) min = c;
		if(d < min) min = d;
		return min;
	}
	
	public static void main(String[] args) {
		// Scanner 인스턴스 생성
		Scanner sc = new Scanner(System.in);
		// 입력 변수
		int a, b, c, d;
		// 사용자 입력
		System.out.print("a = "); a = sc.nextInt();
		System.out.print("b = "); b = sc.nextInt();
		System.out.print("c = "); c = sc.nextInt();
		System.out.print("d = "); d = sc.nextInt();
		
		// 최소값 출력
		System.out.println("min4(a, b, c, d) = " + min4(a,b,c,d));
		
		sc.close();
	}
}
