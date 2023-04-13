package ch01_2;

import java.util.Scanner;
 
public class E01_4 {

	// 1부터 n까지 정수의 합 구하기
	public static void main(String[] args) {
		
		// 사용자 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("1부터 n까지 합계를 구하기 위한 n : "); int n = sc.nextInt();
		
		// while문 이용
		int sumUsingWhile = 0;
		int i = 1;
		while(i <= n) {
			sumUsingWhile += i;
			i ++;
		}
		// 정수의 합 출력
		System.out.print("while을 이용한 합 = " + sumUsingWhile);
		
		// Scanner 닫기
		sc.close();
	}
}
