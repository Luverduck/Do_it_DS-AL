package ch01_2;

import java.util.Scanner;
 
public class E01_5 {

	// 1부터 n까지 정수의 합 구하기
	public static void main(String[] args) {
		
		// 사용자 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("1부터 n까지 합계를 구하기 위한 n : "); int n = sc.nextInt();
		
		// for문 이용
		int sumUsingFor = 0;
		for(int i = 1 ; i <= n ; i ++) {
			sumUsingFor += i;
		}
		// 정수의 합 출력
		System.out.println("for을 이용한 합 = " + sumUsingFor);
		
		// Scanner 닫기
		sc.close();
	}
}
