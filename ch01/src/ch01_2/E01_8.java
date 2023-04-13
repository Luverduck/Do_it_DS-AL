package ch01_2;

import java.util.Scanner;

public class E01_8 {
 
	// 직각 이등변 삼각형 출력
	public static void main(String[] args) {
		
		// 사용자 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 단 삼각형입니까? : "); int n = sc.nextInt();
		
		// 출력
		// 단 수
		for(int i = 1 ; i <= n ; i ++) {
			// 각 단마다 별의 갯수
			for(int j = 1 ; j <= i ; j ++) {
				System.out.print("* ");
			}
			// 한 단의 별 배치가 끝나면 단 바꿈
			System.out.println();
		}
		
		sc.close();
	};
}
