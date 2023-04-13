package ch01_2;

import java.util.Scanner;

public class Q11 {
	 
	public static void main(String[] args) {
		// 사용자 입력
		Scanner sc = new Scanner(System.in);
		
		// 양수만 입력받도록
		int input;
		do {
			System.out.print("입력 : ");
			input = sc.nextInt();
		} while(input < 0);		// 입력이 음수인 동안만 반복
		
		// 자릿수 구하기
		int digit = 0;
		while(input > 0) {		// 입력을 10으로 나눈 값이 0을 초과하는 동안만 반복
			input = input / 10;
			digit ++;
		}
		
		// 출력
		System.out.println("자릿수 : " + digit);
		
		sc.close();
	}
}
