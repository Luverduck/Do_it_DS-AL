package ch01_2;

import java.util.Scanner;

public class Q14 {
 
	// 정사각형 출력
	public static void main(String[] args) {
		// 사용자 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("사각형을 출력합니다.");
		System.out.print("단수 : "); int n = sc.nextInt();
		
		// 출력
		for(int i = 1 ; i <= n ; i ++) {
			for(int j = 1 ; j <= n ; j ++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
