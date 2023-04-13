package ch01_2;

import java.util.Scanner;

public class Q16 {
 
	// n단 피라미드 찍기
	static void spira(int n) {
		// 각 행마다 별 또는 공백을 넣을 수 있는 2(n-1)+1개의 칸이 존재한다
		// i행에 대하여 2(i-1)+1개의 칸에 별을 찍으면 남은 2(n-i)개의 칸에는 공백을 채워야 한다
		// 오른쪽에 공백을 채우지 않고 줄 바꿈을 한다고 할 때 왼쪽에 (n-i)개의 공백을 채우면 된다.
		for(int i = 1 ; i <= n ; i ++) {
			// 공백
			for(int k = 1 ; k <= n - i ; k ++) {
				System.out.print(" ");
			}
			// 별 찍기
			for(int j = 1 ; j <= (i-1)*2 + 1 ; j ++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// 사용자 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : "); int n = sc.nextInt();
		
		// 피라미드 찍기
		System.out.println(n + "단 피라미드 찍기");
		spira(n);
		
		sc.close();
	}
}
