package ch01_2;

import java.util.Scanner;

public class Q17 {
 
	// n단 피라미드 (숫자)
	static void npira(int n) {
		
		for(int i = 1 ; i <= n ; i ++) {
			
			for(int k = 1 ; k <= n-i ; k ++) {
				System.out.print(" ");
			}
			
			for(int j = 1 ; j <= 2*(i-1) + 1 ; j ++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		// 사용자 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : "); int n = sc.nextInt();
		
		// 피라미드 출력
		System.out.println(n + "단 피라미드 찍기");
		npira(n);
		
		sc.close();
	}
}
