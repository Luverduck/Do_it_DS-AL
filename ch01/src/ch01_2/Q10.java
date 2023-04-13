package ch01_2;

import java.util.Scanner;

public class Q10 {

	// 1부터 n까지 정수의 합 구하기(양수만 입력)
	public static void main(String[] args) {
		// 사용자 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : "); int input = sc.nextInt();
		
		// 입력값이 양수인지 판정
		int n;
		do {
			n = input;
		} while(input <= 0);	// () 안이 false가 될 때 반복문 탈출
		
		// 합계 출력
		int sum = 0;
		for(int i = 1 ; i <= n ; i ++) {
			sum += i; 
		}
		System.out.print("합계 : " + sum);
		
		sc.close();
	}
}
