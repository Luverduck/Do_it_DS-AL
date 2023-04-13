package ch01_2;

import java.util.Scanner;

public class Q15 {
 
	// 왼쪽 아래가 직각인 이등변 삼각형
	static void triangleLB(int n) {
		for(int i = 1 ; i <= n ; i ++) {		
			for(int j = 1 ; j <= i ; j ++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	// 왼쪽 위가 직각인 이등변 삼각형
	static void triangleLU(int n) {
		for(int i = 1 ;  i <= n ; i ++) {
			for(int j = 1 ; j <= n - i + 1 ; j ++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	// 오른쪽 위가 직각인 이등변 삼각형
	static void triangleRU(int n) {
		for(int i = 1 ; i <= n ; i ++) {
			// 오른쪽 위가 직각인 이등변 삼각형 
			// - 층 수에서 1을 뺀 값이 공백의 갯수와 같다 -> 공백 기준
			// - n층 직삼각형의 i번째 층 : 별 (n-i+1)개 / 공백 (i-1)개
			// ex) 7층 직삼각형의 3번째 층 : 별 5개 / 공백 2개
			// 공백 찍기
			for(int k  = 1 ; k <= i - 1 ; k ++) {		// (i-1)개의 공백
				System.out.print("  ");
			}
			// 별 찍기
			for(int j = 1 ; j <= n - i + 1 ; j ++) {		// (n-i+1)개의 별
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	// 오른쪽 아래가 직각인 이등변 삼각형
	static void triangleRB(int n) {
		for(int i = 1 ; i <= n ; i ++) {
			// 오른쪽 아래가 직각인 이등변 삼각형
			// - 층 수의 값이 별 갯수와 같다 -> 별 기준
			// - n층 직삼각형의 i번째 층 : 별 i개 / 공백 (n-i)개
			// ex) 7층 직삼각형의 4번째 층 : 별 4개 / 공백 3개
			// 공백 찍기
			for(int k = 1 ; k <= n - i ; k ++) {			// (n-i)개의 공백
				System.out.print("  ");
			}
			// 별 찍기
			for(int j = 1 ; j <= i ; j ++) {				// i개의 별
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// 사용자 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : "); int n = sc.nextInt();
		
		System.out.println("------------------");
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형");
		triangleLB(n);
		
		System.out.println("------------------");
		System.out.println("왼쪽 위가 직각인 이등변 삼각형");
		triangleLU(n);
		
		System.out.println("------------------");
		System.out.println("오른쪽 위가 직각인 이등변 삼각형");
		triangleRU(n);
		
		System.out.println("------------------");
		System.out.println("오른쪽 아래가 직각인 이등변 삼각형");
		triangleRB(n);
		
		sc.close();
	}
}
