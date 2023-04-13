package ch01_1;

import java.util.Scanner;

public class Q01 {
 
	static int max4(int a, int b, int c, int d) {
		// 최대값을 a라고 가정
		int max = a;
		// 비교를 통해 최대값을 찾아 반환
		if(b > max) max = b;
		if(c > max) max = c;
		if(d > max) max = d;
		return max;
	}
	
	public static void main(String[] args) {
		// Scanner 인스턴스 생성
		Scanner sc = new Scanner(System.in);
		// 입력 변수
		int a, b, c, d;
		// 사용자 입력
		System.out.print("a : "); a = sc.nextInt();
		System.out.print("b : "); b = sc.nextInt();
		System.out.print("c : "); c = sc.nextInt();
		System.out.print("d : "); d = sc.nextInt();
		
		// 최대값 출력
		System.out.print("max4(a, b, c, d) = " + max4(a, b, c, d));
		
		sc.close();
	}
}
